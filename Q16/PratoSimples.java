package Q16;

public class PratoSimples implements Preparo {
    private String nome;

    public PratoSimples(String nome) {
        this.nome = nome;
    }

    @Override
    public String preparar() {
        return "Preparando o prato simples: " + nome + ". Misturar os ingredientes e servir.";
    }
}