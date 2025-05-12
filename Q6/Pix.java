public class Pix extends MetodoPagamento {

    public Pix() {
        super(0.0); // sem taxa
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.printf("PIX: pagamento instantâneo de R$%.2f realizado sem taxa.%n", valor);
        return true;
    }
}
