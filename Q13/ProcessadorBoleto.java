package Q13;

public class ProcessadorBoleto implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        if (valor > 10) {
            System.out.println("Boleto autorizado.");
            return true;
        }
        System.out.println("Valor abaixo do mínimo para boleto.");
        return false;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Processando boleto de R$" + valor);
        return true;
    }
}