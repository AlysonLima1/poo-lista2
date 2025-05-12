package Q10;

public abstract class MembroEquipe {
    protected String nome;
    protected String projeto;

    public MembroEquipe(String nome, String projeto) {
        this.nome = nome;
        this.projeto = projeto;
    }

    public String obterDetalhes() {
        return "Nome: " + nome + " | Projeto: " + projeto;
    }

    public abstract String trabalhar();
}