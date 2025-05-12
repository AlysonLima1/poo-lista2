public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    public void adicionarRendimento(double percentual) {
        if (percentual > 0) {
            double rendimento = saldo * (percentual / 100);
            saldo += rendimento;
            System.out.println("Rendimento de " + percentual + "% (R$" + rendimento + ") adicionado à Conta Poupança de " + titular + ".");
        } else {
            System.out.println("Percentual de rendimento inválido.");
        }
    }
}
