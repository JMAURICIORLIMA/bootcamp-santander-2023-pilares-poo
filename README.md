# Pilares do P O O

## Aula 1

### Introdução

**Programação orientada a objetos (POO**, ou **OOP** segundo as suas siglas em inglês), é um paradigma de programação
baseado no conceito de "objetos", que podem conter dados na forma de campos, também conhecidos como atributos e códigos
na forma de procedimentos também conhecidos como métodos.

Como se trata de um contexto análogo ao mundo real, tudo que nos referimos são objetos, exemplo: Conta bancária, Aluno,
Veículo, Transferência etc.

A programação orientada a objetos é bem requisitada no contexto das aplicações mais atuais no mercado devido a
possibilidade de reutilização de código e a capacidade de representação do sistema ser muito mais próximo do mundo real.

Abaixo segue uma definição conceitual dos quatro pilares da programação orientada a objetos:

* **Encapsulamento**: Nem tudo precisa estar visível, grande parte do nosso algoritmo pode ser distribuído em métodos
com finalidades específicas que complementa uma ação global em nossa aplicação.

* **Exemplo**: Ligar um veículo exige muitas etapas para a engenharia, mas o condutor só visualiza a ignição, da
partida e a “magia” acontece.

* **Herança**: Características e comportamentos comuns, podem ser elevados e compartilhados através de uma hierarquia
de objetos.

* **Exemplo**: Um Carro e uma Motocicleta possuem propriedades como placa, chassi, ano de fabricação e métodos como
acelerar, frear. Logo, para não ser um processo de codificação redundante, podemos desfrutar da herança criando uma
classe Veiculo para que seja herdada por Carro e Motocicleta.

* **Abstração**: É a indisponibilidade para determinar a lógica de um ou vários comportamentos em um objeto.

* **Exemplo**: Veículo determina duas ações como acelerar e frear, logo, estes comportamentos deverão ser abstratos
pois existe mais de uma maneira de se realizar a mesma operação. ver Polimorfismo.

* **Polimorfismo**: São as inúmeras maneiras de se realizar uma mesma ação.

* **Exemplo**: Veículo determina duas ações como acelerar e frear, primeiramente precisamos identificar se estaremos
nos referindo a Carro ou Motocicleta para determinar a lógica de aceleração e frenagem dos respectivos veículos. 

### Em prática

Para ilustrar a proposta dos Princípios de POO no nosso cotidiano, vamos simular algumas funcionalidades dos
aplicativos de mensagens instantâneas pela internet.

**MSN Messenger** foi um programa de mensagens instantâneas criado pela Microsoft Corporation. O serviço nasceu em 22
de julho de 1999, anunciando-se como um serviço que permitia falar com uma pessoa através de conversas instantâneas
pela internet. Ao longo dos anos, surgiram novos serviços de mensagens pela internet, como **Facebook Messenger** e o
**VKontakte Telegram**.

![](https://sintaxe.netlify.app/assets/poo-10.d97da128.png)

Vamos descrever em UML e depois em código, algumas das principais funcionalidades de qualquer serviço de comunicação
instantânea pela internet, inicialmente pelo MSN Messenger e depois inserindo os demais, considerando os princípios de
POO.

![](https://sintaxe.netlify.app/assets/poo-9.c1160e1e.png)

Pontos de atenção:

> * Todos os métodos da classe são public (tudo realmente precisa estar visível ?);
> * Só existe uma única forma de se comunicar via internet (como ter novas formas de se comunicar mantendo a proposta
> central ?).

* CODE:
```java
public class MSNMessenger {
    public void enviarMensagem() {
        System.out.println("Enviando mensagem");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }
    public void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    public void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
```

## Aula 2

### Encapsulamento

> Nem tudo precisa estar disponível para todos

Já imaginou, você instalar o MSN Messenger e ao querer enviar uma mensagem, fosse solicitado a você verificar se o
computador está conectado a internet, e depois pedir para você salvar a mensagem no histórico? ou, se ao tentar enviar
um SMS pelo celular, primeiro você precisasse consultar manualmente o seu saldo ?

Acredito que não seria uma experiência tão agradável de ser executada, recorrentemente, por nós usuários.

Mesmo ainda sendo necessária algumas etapas nos processos citados, não é um requisito uma visibilidade pública, isso
quer dizer, além da própria classe que possui a responsabilidade de uma determinada ação.

Quanto ao MSN Messenger, para nós, só é relevante saber que podemos e como devemos enviar e receber a mensagem, logo,
as demais funcionalidades poderão ser consideradas privadas (private). E é ai que se caracteriza a necessidade do pilar
de Encapsulamento. O que esconder ?

> [!NOTE]
> 📌 Para fixar
> 
> Nem tudo precisa estar disponível para todos

Vamos a revisão de nossa implementação

![](https://sintaxe.netlify.app/assets/poo-8.5b947d04.png)

```java
/*
 * Simulação do uso da classe MSNMessenger
 */
public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        MSNMessenger msn = new MSNMessenger();

        msn.validarConectadoInternet();
        msn.enviarMensagem();
        msn.salvarHistoricoMensagem();

        msn.receberMensagem();
    }
}
```
```java
public class MSNMessenger {
    public void enviarMensagem() {
        //primeiro confirmar se esta conectado a internet
        validarConectadoInternet();

        System.out.println("Enviando mensagem");

        //depois de enviada, salva o histórico da mensagem
        salvarHistoricoMensagem();
    }
    
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
    }

    //métodos privadas, visíveis somente na classe
    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
    
    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
```
```java
/*
 * Simulação do uso da classe MSNMessenger
 * com métodos encapsulados - privados
 */
public class ComputadorPedrinho {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		
		msn.enviarMensagem();
		
		msn.receberMensagem();
	}
}
```