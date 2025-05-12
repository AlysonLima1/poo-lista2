package Q13;

public class Main {
    public static void main(String[] args) {
        SistemaPagamento sistema = new SistemaPagamento();

        ProcessadorPagamento cartao = new ProcessadorCartao();
        ProcessadorPagamento pix = new ProcessadorPix();
        ProcessadorPagamento boleto = new ProcessadorBoleto();

        System.out.println("\n--- Cartão ---");
        sistema.realizarPagamento(cartao, 950);

        System.out.println("\n--- Pix ---");
        sistema.realizarPagamento(pix, 300);

        System.out.println("\n--- Boleto (valor válido) ---");
        sistema.realizarPagamento(boleto, 50);

        System.out.println("\n--- Boleto (valor baixo) ---");
        sistema.realizarPagamento(boleto, 5);
    }
}