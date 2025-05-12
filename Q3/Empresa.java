import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Funcionario> funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    /**
     * Percorre todos os funcionários, exibe o nome, a classe e o salário calculado,
     * e retorna o total da folha.
     */
    public double calcularFolhaDePagamento() {
        double total = 0.0;
        System.out.println("=== Folha de Pagamento ===");
        for (Funcionario f : funcionarios) {
            double salario = f.calcularSalario();
            String tipo = f.getClass().getSimpleName();
            System.out.printf("%s (%s): R$ %.2f%n", f.getNome(), tipo, salario);
            total += salario;
        }
        System.out.println("--------------------------");
        System.out.printf("Total da Folha: R$ %.2f%n", total);
        return total;
    }
}