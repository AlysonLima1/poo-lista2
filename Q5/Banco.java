import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta adicionada: " + conta.getTitular() + ".");
    }

    public void gerarRelatorio() {
        System.out.println("--- Relatório de Contas do Banco ---");
        for (Conta c : contas) {
            String tipo = c.getClass().getSimpleName();
            System.out.printf("Titular: %s | Tipo: %s | Saldo: R$%.2f%n", c.getTitular(), tipo, c.getSaldo());
        }
        System.out.println("--- Fim do Relatório ---");
    }
}