package Q12;

public class GestorDeDescontos {
    public double aplicarDesconto(EstrategiaDesconto estrategia, double preco) {
        double desconto = estrategia.calcularDesconto(preco);
        double novoPreco = preco - desconto;
        System.out.println("Desconto aplicado: R$" + desconto);
        return novoPreco;
    }
}