public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void informacoes() {
        // Exibe as informações comuns
        super.informacoes();
        // Exibe a informação específica
        System.out.printf("Tipo: Carro — Portas: %d%n", numeroDePortas);
    }
}