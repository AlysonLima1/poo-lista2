public class Desenvolvedor extends Funcionario {
    private double fatorProdutividade;

    public Desenvolvedor(String nome, double salarioBase, double fatorProdutividade) {
        super(nome, salarioBase);
        this.fatorProdutividade = fatorProdutividade;
    }

    /**
     * Salário é o base multiplicado pelo fator de produtividade.
     */
    @Override
    public double calcularSalario() {
        return salarioBase * fatorProdutividade;
    }
}