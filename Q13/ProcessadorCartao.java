package Q13;

public class ProcessadorCartao implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        System.out.println("Autorizando pagamento com cartão...");
        return valor <= 1000; // Simulação: limite fictício
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando pagamento com cartão de R$" + valor);
        return true;
    }
}