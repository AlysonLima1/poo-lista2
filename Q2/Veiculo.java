public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca  = marca;
        this.modelo = modelo;
        this.ano    = ano;
    }

    public void informacoes() {
        System.out.printf("Veículo: %s %s (%d)%n", marca, modelo, ano);
    }
}