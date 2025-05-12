public abstract class MetodoPagamento {
    protected double taxa; // percentual (por exemplo, 0.02 = 2%)

    public MetodoPagamento(double taxa) {
        this.taxa = taxa;
    }

    /**
     * Processa o pagamento de um dado valor.
     * @param valor - valor da transação
     * @return true se bem-sucedido, false caso contrário
     */
    public abstract boolean processarPagamento(double valor);

    /**
     * Calcula a taxa aplicada sobre o valor.
     * @param valor - valor da transação
     * @return valor * taxa
     */
    public double calcularTaxa(double valor) {
        return valor * taxa;
    }
}
