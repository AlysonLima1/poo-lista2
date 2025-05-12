public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    /**
     * Retorna o salário base do funcionário.
     */
    public double calcularSalario() {
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }
}