package Q18;

public class Alimento extends Produto {
    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return preco * 0.05;
    }
}