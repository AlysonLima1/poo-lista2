public class SistemaPagamento {

    /**
     * Efetua o pagamento usando o método fornecido.
     * @param metodo - instância de MetodoPagamento (CartaoCredito, Pix ou Boleto)
     * @param valor  - valor da transação
     * @return true se o pagamento for processado com sucesso, false caso contrário
     */
    public static boolean efetuarPagamento(MetodoPagamento metodo, double valor) {
        System.out.println("Iniciando processamento...");
        boolean resultado = metodo.processarPagamento(valor);

        if (resultado) {
            double taxa = metodo.calcularTaxa(valor);
            System.out.printf("Pagamento concluído! Taxa aplicada: R$%.2f%n", taxa);
        } else {
            System.out.println("Falha no processamento do pagamento.");
        }

        return resultado;
    }

    // Exemplo de uso
    public static void main(String[] args) {
        double valorCompra = 500.0;

        MetodoPagamento cartao = new CartaoCredito(0.015); // 1,5%
        MetodoPagamento pix    = new Pix();
        MetodoPagamento boleto = new Boleto();

        System.out.println("=== Teste Cartão de Crédito ===");
        efetuarPagamento(cartao, valorCompra);

        System.out.println("\n=== Teste PIX ===");
        efetuarPagamento(pix, valorCompra);

        System.out.println("\n=== Teste Boleto ===");
        efetuarPagamento(boleto, valorCompra);
    }
}