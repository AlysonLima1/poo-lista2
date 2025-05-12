public class ContaCorrente extends Conta {
    private double taxaOperacao;

    public ContaCorrente(String titular, double saldoInicial, double taxaOperacao) {
        super(titular, saldoInicial);
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public boolean sacar(double valor) {
        double total = valor + taxaOperacao;
        if (saldo >= total) {
            saldo -= total;
            System.out.println("Saque de R$" + valor + " com taxa de R$" + taxaOperacao + " realizado em Conta Corrente de " + titular + ".");
            return true;
        } else {
            System.out.println("Saldo insuficiente para saque + taxa em Conta Corrente de " + titular + ".");
            return false;
        }
    }
}
