package Q13;

public class ProcessadorPix implements ProcessadorPagamento {
    @Override
    public boolean autorizarPagamento(double valor) {
        System.out.println("Autorização Pix instantânea.");
        return true;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Pix de R$" + valor + " concluído.");
        return true;
    }
}