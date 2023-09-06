package aulaum.exemploum;

public class Carro extends Veiculo {

    // Encapsulamento de ações (confereCombustivel e comfereCambio).
    // Essas ações acontecem, porém o usuário não precisa saber.

    private void confereCombustivel() {
        System.out.println("Conferindo combustível.");
    }

    private void confereCambio() {
        System.out.println("Conferindo câmbio em P.");
    }

    @Override
    public void ligarVeiculo() {
        confereCambio();
        confereCombustivel();
        System.out.println("Ligando veículo.");
    }
}
