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
#
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
#
## Aula 03
### Herança

> Nem tudo se copia, às vezes se herda.

Já imaginou você ter sido classificado para a vaga de emprego de seus sonhos e como desafio seria justamente você criar
um diagrama de classes e em seguida os respectivos arquivos .java, que apresentasse os fundamentos de POO com base no
contexto de vários aplicativos de mensagens instantâneas? Sorte sua que você está nos acompanhando nesta nossa jornada.
😜

![](https://sintaxe.netlify.app/assets/poo-10.d97da128.png)

> [!NOTE]
> 📌 Para fixar 
> 
> Com base na nossa classe MsnMessenger, você já poderia dar os primeiros passos para se dar bem no processo seletivo,
> simplemente, copiar e colar a estrutura, para as novas classes FacebookMessenger, Telegram e BINGO 😁😁😁!!!

![](https://sintaxe.netlify.app/assets/poo-11.3937427e.png)

Agora é escrever o código das classes acima e esperar pela contratação !

> [!WARNING]
> 🚨 Cuidado 
> 
> Lamentamos dizer, mas esta não seria a melhor alternativa para a proposta citada acima.

Além de uma compreensão do desafio, é necessário que, tenhamos domínio dos pilares de POO e aplicá-los em situações
iguais a esta.

NOTE: Todas as três classes, possuem a mesma estrutura comportamental e diante deste contexto, se encaixa perfeitamente
o segundo pilar da POO, a Herança.

![](https://sintaxe.netlify.app/assets/poo-12.170b4c4c.png)

**ServicoPai**
```java
//a classe MSNMessenger é ou representa
public class ServicoMensagemInstantanea {
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

**MSN**
```java
public class MSNMessenger extends ServicoMensagemInstantanea{

}
```

**Facebook**
```java
public class FacebookMessenger extends ServicoMensagemInstantanea {

}
```

**Telegram**
```java
public class Telegram extends ServicoMensagemInstantanea {

}
```

**ComputadorPedrinho**
```java
public class ComputadorPedrinho {
    public static void main(String[] args) {

        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.receberMensagem();

        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();

    }
}
```

Podemos avaliar a importância de compreender os pilares de POO para ter uma melhor implementação, reaproveitamento e
reutilização de código em qualquer contexto das nossas aplicações, mas não para por aí.

> [!IMPORTANT]
> 🔔 Atenção
> 
> Será que todos os sistemas de mensagens realizam as suas operações de uma mesma maneira? E agora ? Este é um trabalho
> para os pilares Abstração e Polimorfismo.
#
## Aula 04
### Abstração

> Para você ser é preciso você fazer.

Sabemos que qualquer sistema de mensagens instantâneas realiza as mesmas operações de Enviar e Receber Mensagem, dentre
outras operações comuns ou exclusivas de cada aplicativo disponível no mercado.

Mas será que as ações realizadas, contém o mesmo comportamento ? Acreditamos que não.

> [!NOTE] 
> 📌 Para fixar
> 
> Já imaginou a Microsoft falar para o Facebook: "Ei, toma meu código do MSN!". 😲

O que vale destacar para compreender, é que todo e qualquer sistema de mensagem precisa sim, no mínimo Enviar e Receber
Mensagem, logo, consideramos se firmar um "contrato" para qualquer um que queira se apresentar assim para o mercado.

Observem a nova estruturação dos códigos abaixo, com base na implementação apresentada no pilar Herança.

**ServicoPai**
```java
public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();
}
```

**MSN**
```java
public class MSNMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo MSN Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN Messenger");
    }
}
```

**Facebook**
```java
public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }
}
```

**Telegram**
```java
public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
```

> 🏆 Sucesso 
> 
> Em Java, o conceito de abstração é representado pela palavra reservada `abstract` e métodos que NÃO possuem corpo na
> classe abstrata (pai) e é muito difícil falar de abstração e NÃO mencionar polimorfismo.
#
## Aula 05
### Polimorfismo

> Um mesmo comportamento, de várias maneiras.

Podemos observar no contexto de **Abstração** e **Herança**, que conseguimos criar uma singularidade estrutural de
nossos elementos. Isso quer dizer que, qualquer classe que deseja representar um serviço de mensagens, basta estender a
classe `ServicoMensagemInstantanea` e implementar, os respectivos métodos abstratos. O que vale reforçar aqui é, cada
classe terá a mesma ação, executando procedimentos de maneira especializada.

![](https://sintaxe.netlify.app/assets/poo-13.140e34e5.png)

Este é o resultado do que denominamos como, Polimorfismo. Veja o exemplo abaixo:

```java
public class ComputadorPedrinho {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
		    NÃO SE SABE QUAL APP 
		    MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
		 */
		String appEscolhido="???"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}
```

> [!NOTE]
> ℹ️ Informação 
> 
> Para concluirmos a compreensão, Polimorfismo permite que as classes mais abstratas, determine ações uniformes, para
> que cada classe filha concreta, implemente os comportamentos de forma específica.

#### Modificador protected

Vamos para uma retrospectiva quanto ao requisito do nosso sistema de mensagens instantâneas desde a etapa de
encapsulamento.

O nosso requisito, solicita que além de Enviar e Receber Mensagens, precisamos validar se o aplicativo está conectado a
internet (`validarConectadoInternet`) e salvar o histórico de cada mensagem (`salvarHistoricoMensagem`).

Sabemos que cada aplicativo, costuma salvar as mensagens em seus respectivos servidores cloud, mas e quanto validar se
está conectado a internet? Não poderia ser um mecanismo comum a todos ? Logo, qualquer classe filha, de
**ServicoMensagemInstantanea** poderia desfrutar através de herança, esta funcionalidade.

> [!NOTE]
> 🏆 Sucesso
> 
> Mas fica a reflexão do que já aprendemos sobre visibilidade de recursos: Com o modificador private somente a classe
> conhece a implementação, quanto que o modificador public todos passarão a conhecer. Mas gostaríamos que, somente as
> classes filhas soubessem. Bem, é ai que entra o modificador protected.

```java
public abstract class ServicoMensagemInstantanea {
	
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	//mais um método que todos os filhos deverão implementar
	public abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}
```
#
## Aula 06
### Interface

> 🔔 Atenção
> 
> Antes de tudo, NÃO estamos nos referindo a interface gráfica. Ok? 😁😉

Como vimos anteriormente, **Herança** é um dos pilares de POO, mas uma curiosidade que se deve ser esclarecida, na
linguagem Java, é que ela não permite o que conhecemos como **Herança Múltipla**.

A medida que vão surgindo novas necessidades, novos equipamentos (objetos), que nascem para atender as expectativas de
oferecer ferramentas com finalidades bem específicas, como por exemplo: Impressoras, Digitalizadoras, Copiadoras e etc.

Observem que não há uma especificação de marca, modelo e ou capacidades de execução das classes citadas acima, isto é o
que consideramos o nível mais abstrato da orientação a objetos, que denominamos como **interfaces**.

Ilustração de interfaces dos equipamentos citados acima:

![](https://sintaxe.netlify.app/assets/poo-14.5d056733.png)

Representação de objetos reais com base nas interfaces citadas acima:

![](https://sintaxe.netlify.app/assets/poo-15.53bc165b.png)

> Então o que você está dizendo é que interfaces é o mesmo que classes? Um molde para representação dos objetos reais?

Este é um dos maiores questionamentos dos desenvolvedores, no que se refere a modelo de classes da aplicação.

Como citado acima, Java não permite herança múltipla, logo, vamos imaginar que, recebemos o desafio de projetar uma
nova classe, para criar objetos que representam as três características citadas acima e que iremos denominar de
**EquipamentoMultifunional**.

![](https://sintaxe.netlify.app/assets/poo-16.1ac440b7.png)

Para uma melhor compreensão, vamos analisar os diagramas de classes abaixo, comparando o conceito de herança entre,
classes e interfaces.

**Cenário 1**

![](https://sintaxe.netlify.app/assets/poo-18.065a153a.png)

**Cenário 2**

![](https://sintaxe.netlify.app/assets/poo-19.21941aa0.png)

Antes de iniciarmos a representação via código, devemos compreender que, assim como em classes e métodos abstratos,
quando herdamos de uma interface, precisamos implementar todos os seus métodos, pois eles são implicitamente
`public abstract`.

E para encerrar, uma das mais importantes ilustrações quanto ao uso de interfaces para desenvolvimento de componentes
revolucionários, é apresentado em 2007 por nada mais nada menos que Steve Jobs ao lançar o primeiro **iPhone** da
história.

![](https://sintaxe.netlify.app/assets/poo-17.39b083f4.png)

> [!NOTE]
> ℹ️ Informação 
> 
> Um único equipamento, que pode ser considerado tanto como um: Reprodutor Musical, Aparelho Telefônico e Navegador na 
> Internet.

**Referencias:**
> https://sintaxe.netlify.app/topicos/linguagens/java/intermediario/pilares-poo

> https://glysns.gitbook.io/java-basico/programacao-orientada-a-objetos/pilares-do-poo

> Github do instrutor: https://github.com/glysns

> Linkedin do instrutor: https://www.linkedin.com/in/glysns/

> Meu Github: https://github.com/JMAURICIORLIMA

> Meu Linkedin: https://www.linkedin.com/in/josemauricio-rodriguesdelima/

**Lançamento do Iphone**
> https://www.youtube.com/watch?t=1101s&v=9ou608QQRq8

***Bons estudos a todos.***


## Resulmão.
### Encapsulamento
O encapsulamento é um dos quatro princípios fundamentais da Programação Orientada a Objetos (POO), juntamente com a
abstração, a herança e o polimorfismo. O encapsulamento é uma técnica que permite esconder os detalhes internos de uma
classe e proteger seus dados de acesso não autorizado. Isso é feito definindo membros da classe como privados
(ou protegidos) e fornecendo métodos públicos para acessar e manipular esses membros. O encapsulamento promove a
modularidade e a manutenibilidade do código, uma vez que os detalhes internos de uma classe podem ser alterados sem
afetar o código que a utiliza.

Aqui estão os principais conceitos relacionados ao encapsulamento:

1. **Atributos Privados**: Os atributos de uma classe (também chamados de campos ou variáveis de instância) são
   declarados como privados (`private`) para que não possam ser acessados diretamente fora da classe.

   ```java
   private int idade;
   ```

2. **Métodos Públicos**: São fornecidos métodos públicos (também chamados de métodos getters e setters) para acessar e
   modificar os atributos privados. Esses métodos controlam como os dados são lidos e gravados.

   ```java
   public int getIdade() {
       return idade;
   }

   public void setIdade(int novaIdade) {
       if (novaIdade >= 0) {
           idade = novaIdade;
       }
   }
   ```

3. **Controle de Acesso**: O encapsulamento permite que você controle quem pode ler e escrever nos atributos da classe.
   Por exemplo, ao fornecer apenas um método `get` para um atributo e não um método `set`, você torna esse atributo
   somente leitura.

4. **Proteção contra Acessos Indesejados**: O encapsulamento ajuda a proteger os dados da classe contra acessos
   indesejados ou inválidos. No exemplo acima, verificamos se a nova idade é maior ou igual a zero antes de atualizar o
   atributo `idade`.

5. **Flexibilidade Interna**: Com o encapsulamento, você pode modificar a implementação interna de uma classe sem
   afetar o código externo que a utiliza. Isso é útil para manter a estabilidade da interface pública enquanto refatora ou
   melhora a implementação interna.

6. **Manutenção Simplificada**: O encapsulamento torna mais fácil rastrear onde os dados são lidos e gravados na classe,
   o que facilita a manutenção e a solução de problemas.

Em resumo, o encapsulamento é uma técnica importante na POO que ajuda a proteger e organizar os dados e a
funcionalidade de uma classe. Ele fornece uma interface pública clara e controlada para acessar e manipular esses dados,
promovendo a segurança e a manutenibilidade do código.
#
### Herança

A herança é um dos quatro princípios fundamentais da Programação Orientada a Objetos (POO), juntamente com o
encapsulamento, a abstração e o polimorfismo. A herança é um conceito que permite criar uma nova classe (a classe
derivada ou subclasse) a partir de uma classe existente (a classe base ou superclasse), herdando seus atributos e
métodos. Isso promove a reutilização de código e facilita a criação de hierarquias de classes.

Aqui estão os principais conceitos relacionados à herança:

1. **Superclasse e Subclasse**: A classe base é chamada de superclasse e a classe derivada é chamada de subclasse. A
subclasse herda os atributos e métodos da superclasse.

2. **Extensão**: A herança é implementada usando a palavra-chave `extends` no Java. A subclasse estende a superclasse
para herdar seus membros.

   ```java
   class Superclasse {
       // Atributos e métodos da superclasse
   }

   class Subclasse extends Superclasse {
       // Atributos e métodos da subclasse
   }
   ```

3. **Reutilização de Código**: A herança permite reutilizar o código da superclasse na subclasse. Isso significa que
você não precisa reescrever os membros da superclasse na subclasse, a menos que deseje modificá-los.

4. **Adição de Funcionalidade**: Além de herdar membros da superclasse, a subclasse pode adicionar novos atributos e
métodos ou modificar os existentes.

5. **Relação "É-um"**: A herança modela uma relação "é-um". Por exemplo, se você tem uma superclasse `Animal` e uma
subclasse `Cachorro`, pode dizer que "um cachorro é um animal".

6. **Polimorfismo**: O polimorfismo é outro conceito importante relacionado à herança. Ele permite que você trate
objetos da subclasse como objetos da superclasse, o que é útil para escrever código genérico.

7. **Sobrescrita de Métodos**: A subclasse pode sobrescrever (override) métodos da superclasse para fornecer uma
implementação específica da subclasse.

   ```java
   class Superclasse {
       void metodo() {
           // Implementação na superclasse
       }
   }

   class Subclasse extends Superclasse {
       @Override
       void metodo() {
           // Implementação na subclasse (sobrescrita)
       }
   }
   ```

8. **Chamada de Métodos da Superclasse**: A subclasse pode chamar métodos da superclasse usando a palavra-chave `super`.

   ```java
   class Subclasse extends Superclasse {
       void metodoDaSubclasse() {
           super.metodo(); // Chama o método da superclasse
       }
   }
   ```

A herança é um conceito poderoso na POO que permite criar hierarquias de classes e organizar o código de forma
eficiente. No entanto, deve ser usado com cuidado para evitar hierarquias muito profundas e complexas. Em alguns casos,
a composição (outra técnica de POO) pode ser preferível à herança.
#
### Abstração 

A abstração é um dos quatro princípios fundamentais da Programação Orientada a Objetos (POO), juntamente com o
encapsulamento, a herança e o polimorfismo. A abstração é um conceito fundamental que envolve a simplificação de
complexidade, focando apenas nos aspectos relevantes e essenciais de um objeto ou sistema.

Aqui estão os principais conceitos relacionados à abstração:

1. **Modelagem Simplificada**: A abstração envolve a criação de modelos simplificados de objetos do mundo real. Em vez
de representar todos os detalhes de um objeto, você se concentra apenas nos aspectos que são relevantes para o problema
em questão.

2. **Classes e Objetos**: Em POO, as classes são abstrações que definem estruturas de objetos, e os objetos são
instâncias dessas classes. Por exemplo, uma classe `Carro` é uma abstração que representa carros em geral, enquanto um
objeto `MeuCarro` é uma instância específica dessa classe.

3. **Membros Abstratos**: Em uma classe, você pode declarar membros (atributos e métodos) que são abstratos, ou seja,
não têm implementação concreta. Esses membros são definidos nas subclasses.

   ```java
   abstract class Veiculo {
       // Método abstrato (sem implementação)
       abstract void acelerar();

       // Atributo comum
       String cor;
   }
   ```

4. **Classes Abstratas**: Uma classe abstrata é uma classe que contém um ou mais membros abstratos. Ela não pode ser
instanciada diretamente, mas pode ser usada como base para outras classes.

   ```java
   abstract class Animal {
       abstract void fazerBarulho();
   }

   class Cachorro extends Animal {
       void fazerBarulho() {
           System.out.println("O cachorro faz latidos.");
       }
   }
   ```

5. **Modelo de Negócios**: A abstração é frequentemente usada para criar modelos de negócios que representam conceitos
do mundo real de forma simplificada. Por exemplo, uma classe `Pedido` pode abstrair os detalhes de um pedido de compra.

6. **Simplificação da Complexidade**: A abstração ajuda a simplificar a complexidade do mundo real, tornando-o mais
gerenciável para programadores e mais compreensível para os usuários.

7. **Separação de Preocupações**: A abstração permite separar preocupações diferentes em classes separadas. Isso
promove a modularidade e a manutenibilidade do código.

A abstração é fundamental para a POO, pois permite criar modelos e sistemas que representam o mundo real de forma
eficiente. Ela ajuda a reduzir a complexidade, facilitando a compreensão e a manutenção do código. Além disso, a
abstração promove a reutilização de código, uma vez que você pode criar classes abstratas que servem como base para
outras classes relacionadas.
#
### Polimorfismo

O polimorfismo é um dos quatro princípios fundamentais da Programação Orientada a Objetos (POO), juntamente com o
encapsulamento, a herança e a abstração. O polimorfismo é um conceito que permite que objetos de classes diferentes
sejam tratados de maneira uniforme, ou seja, permite que um objeto seja usado como se fosse de um tipo diferente.

Há dois tipos principais de polimorfismo em POO:

1. **Polimorfismo de Subtipo (ou Polimorfismo de Herança)**: Este tipo de polimorfismo ocorre quando uma classe
derivada (subclasse) é tratada como uma instância da classe base (superclasse). Isso significa que você pode usar um
objeto da subclasse onde um objeto da superclasse é esperado.

   Exemplo:

   ```java
   // Superclasse
   class Animal {
       void fazerBarulho() {
           System.out.println("O animal faz algum som.");
       }
   }

   // Subclasse
   class Cachorro extends Animal {
       void fazerBarulho() {
           System.out.println("O cachorro faz latidos.");
       }
   }

   public class Main {
       public static void main(String[] args) {
           Animal meuAnimal = new Cachorro(); // Polimorfismo de subtipo
           meuAnimal.fazerBarulho(); // Chama o método da subclasse
       }
   }
   ```

2. **Polimorfismo de Parametrização (ou Polimorfismo de Interface)**: Este tipo de polimorfismo ocorre quando um método
pode aceitar argumentos de tipos diferentes, desde que esses tipos implementem uma interface comum ou sejam subtipos de
uma classe comum. Isso permite que você escreva código genérico que pode ser reutilizado com diferentes tipos de
objetos.

   Exemplo:

   ```java
   // Interface comum
   interface Barulhento {
       void fazerBarulho();
   }

   // Classes que implementam a interface
   class Cachorro implements Barulhento {
       void fazerBarulho() {
           System.out.println("O cachorro faz latidos.");
       }
   }

   class Gato implements Barulhento {
       void fazerBarulho() {
           System.out.println("O gato faz miados.");
       }
   }

   public class Main {
       static void fazerBarulhoDoAnimal(Barulhento animal) {
           animal.fazerBarulho();
       }

       public static void main(String[] args) {
           Barulhento meuAnimal = new Cachorro(); // Polimorfismo de parametrização
           fazerBarulhoDoAnimal(meuAnimal); // Chama o método específico da classe Cachorro

           meuAnimal = new Gato();
           fazerBarulhoDoAnimal(meuAnimal); // Chama o método específico da classe Gato
       }
   }
   ```

O polimorfismo torna o código mais flexível e genérico, permitindo que você escreva código que funciona com uma
variedade de tipos de objetos. Isso é fundamental para a reutilização de código e para a criação de sistemas flexíveis
e extensíveis. O Java suporta o polimorfismo de maneira nativa, tornando-o uma linguagem poderosa para a programação
orientada a objetos.
#
### Interface

Uma interface em programação é uma coleção de métodos abstratos (métodos sem implementação) que podem ser implementados
por qualquer classe que declare que "implementa" essa interface. As interfaces são usadas para definir contratos ou
padrões de métodos que as classes devem seguir. Elas são uma parte fundamental da Programação Orientada a Objetos (POO)
e permitem que diferentes classes forneçam implementações específicas para os métodos definidos na interface.

Aqui estão os principais conceitos relacionados a interfaces em Java:

1. **Declaração de Interface**: Para declarar uma interface em Java, você usa a palavra-chave `interface`. Em uma
interface, você define os métodos que devem ser implementados por qualquer classe que a implemente.

   ```java
   interface ExemploInterface {
       void metodo1();
       int metodo2();
   }
   ```

2. **Implementação de Interfaces**: Uma classe pode implementar uma ou mais interfaces usando a palavra-chave
`implements`. Quando uma classe implementa uma interface, ela deve fornecer uma implementação para todos os métodos
definidos na interface.

   ```java
   class MinhaClasse implements ExemploInterface {
       public void metodo1() {
           // Implementação do método 1
       }

       public int metodo2() {
           // Implementação do método 2
           return 42;
       }
   }
   ```

3. **Múltiplas Interfaces**: Uma classe pode implementar várias interfaces separadas por vírgulas.

   ```java
   class MinhaClasse implements Interface1, Interface2 {
       // Implementações dos métodos das interfaces
   }
   ```

4. **Polimorfismo de Interface**: Você pode usar interfaces para criar código genérico que funcione com objetos de
classes diferentes que implementam a mesma interface.

   ```java
   void executaMetodo(ExemploInterface objeto) {
       objeto.metodo1();
   }
   ```

5. **Padrão de Assinatura**: As interfaces especificam apenas a assinatura dos métodos (nome, parâmetros e tipo de
retorno), não sua implementação. Isso cria um contrato que as classes devem seguir.

6. **Default Methods (Métodos com Implementação Padrão)**: A partir do Java 8, interfaces podem conter métodos com
implementação padrão (também conhecidos como métodos padrão). Esses métodos têm uma implementação padrão e não exigem
que todas as classes que implementam a interface forneçam sua própria implementação.

   ```java
   interface ExemploInterface {
       void metodo1();

       default void metodoComImplementacaoPadrao() {
           // Implementação padrão do método
       }
   }
   ```

7. **Membros Estáticos**: Interfaces também podem conter membros estáticos, como constantes, que podem ser acessados
diretamente usando o nome da interface.

   ```java
   interface ExemploInterface {
       int MIN = 0;
       int MAX = 100;

       void metodo1();
   }
   ```

As interfaces são usadas para definir contratos claros entre diferentes partes do código. Elas são amplamente usadas em
Java para criar código modular e flexível. Classes que implementam interfaces podem ser usadas de maneira polimórfica,
o que significa que você pode criar código genérico que funcione com várias implementações de uma interface. Isso é
fundamental para criar sistemas flexíveis e extensíveis em Java.

1. **Encapsulamento**: Esconde os detalhes internos de um objeto e permite o acesso controlado aos seus membros.

2. **Abstração**: Simplifica objetos complexos, focando apenas nos aspectos relevantes e essenciais.

3. **Herança**: Permite que uma classe herde atributos e métodos de outra classe, promovendo a reutilização de código.

4. **Polimorfismo**: Permite que objetos de classes diferentes sejam tratados de maneira uniforme, facilitando a escrita de
código genérico.