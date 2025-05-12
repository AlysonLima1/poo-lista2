package Q18;

public abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public abstract double calcularDesconto();

    public String getDescricaoComDesconto() {
        return nome + " - Preço: R$" + preco + ", Desconto: R$" + calcularDesconto();
    }
}