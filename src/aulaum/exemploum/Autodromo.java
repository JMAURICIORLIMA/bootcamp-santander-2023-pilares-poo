package aulaum.exemploum;

public class Autodromo {

    public static void main(String[] args) {

        Carro carroAutomatico = new Carro();

//        carroAutomatico.ligarVeiculo();

        Carro renegade = new Carro();
        renegade.setChassi("1532546a");
        renegade.setPlaca("PWA1B52");

        Moto tiger = new Moto();
        tiger.setChassi("756412BA");
        tiger.setPlaca("PMI1C92");

        System.out.println("Informações do carro");
        System.out.println("Chassi: " + renegade.getChassi());
        System.out.println("Placa: " + renegade.getPlaca());
//        renegade.ligarVeiculo();

        System.out.println("\nInformações da moto");
        System.out.println("Chassi: " + tiger.getChassi());
        System.out.println("Placa: " + tiger.getPlaca());
//        tiger.ligarVeiculo();

        /*
         * No Exemplo abaixo praticamos a abstração e polimorfismo.
         * Abstração a termos de Veiculo (sendo a classe mais genérica) e atribuindo uma variável de instância.
         * atribuindo a mesma em primerio o carro com seu método de ligar.
         * em seguida
         * atribuindo a moto e também chamando o método de ligar.
         * Ambos utilizam a mesma variável de instância, porém com "Propostas diferente para ligar".
         * Dessa forma, usamos o conceito de polimorfismo.
        */

//        Veiculo coringa = renegade;
//        Veiculo coringa = tiger;
//        coringa.ligarVeiculo();

    }
}
