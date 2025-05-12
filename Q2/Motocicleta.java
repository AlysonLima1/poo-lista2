public class Motocicleta extends Veiculo {
    private String tipoDeGuidao;

    public Motocicleta(String marca, String modelo, int ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    @Override
    public void informacoes() {
        // Exibe as informações comuns
        super.informacoes();
        // Exibe a informação específica
        System.out.printf("Tipo: Motocicleta — Guidão: %s%n", tipoDeGuidao);
    }
}