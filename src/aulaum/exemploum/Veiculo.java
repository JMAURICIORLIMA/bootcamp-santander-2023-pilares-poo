package aulaum.exemploum;

// Carro e Moto Herdam da classe veículo - Herança.
public abstract class Veiculo {

    private String chassi;
    private String placa;

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract void ligarVeiculo();
}
