public class Boleto extends MetodoPagamento {

    public Boleto() {
        super(0.05); // taxa fixa de 5%
    }

    @Override
    public boolean processarPagamento(double valor) {
        double valorTaxa = calcularTaxa(valor);
        System.out.printf("Boleto: pagamento de R$%.2f gerado. Taxa fixa de 5%% = R$%.2f%n",
                          valor, valorTaxa);
        // aqui poderíamos gerar o boleto e retornar true se tudo der certo
        return true;
    }
}