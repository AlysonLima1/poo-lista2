public class CartaoCredito extends MetodoPagamento {

    public CartaoCredito(double taxa) {
        super(taxa);
    }

    @Override
    public boolean processarPagamento(double valor) {
        // só permite se a taxa for menor que 2%
        if (this.taxa < 0.02) {
            double valorTaxa = calcularTaxa(valor);
            System.out.printf("Cartão de Crédito: pagamento de R$%.2f autorizado. Taxa: R$%.2f%n",
                              valor, valorTaxa);
            return true;
        } else {
            System.out.println("Cartão de Crédito: taxa muito alta, pagamento não autorizado.");
            return false;
        }
    }
}