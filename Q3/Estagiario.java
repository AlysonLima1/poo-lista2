public class Estagiario extends Funcionario {

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    /**
     * Salário é apenas o salário base (sem adicionais).
     */
    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }
}