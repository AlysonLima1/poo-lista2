public class ContaSalario extends Conta {
    private int limiteSaques;
    private int saquesRealizados;

    public ContaSalario(String titular, double saldoInicial, int limiteSaquesMensal) {
        super(titular, saldoInicial);
        this.limiteSaques = limiteSaquesMensal;
        this.saquesRealizados = 0;
    }

    @Override
    public boolean sacar(double valor) {
        if (saquesRealizados >= limiteSaques) {
            System.out.println("Limite de saques mensais atingido para Conta Salário de " + titular + ".");
            return false;
        }
        boolean sucesso = super.sacar(valor);
        if (sucesso) {
            saquesRealizados++;
            System.out.println("Saque número " + saquesRealizados + " realizado neste mês em Conta Salário de " + titular + ".");
        }
        return sucesso;
    }

    public int getSaquesRealizados() {
        return saquesRealizados;
    }

    public void resetarSaques() {
        saquesRealizados = 0;
        System.out.println("Contador de saques mensais resetado para Conta Salário de " + titular + ".");
    }
}