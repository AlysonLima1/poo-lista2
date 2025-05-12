package Q12;

public class DescontoSazonal implements EstrategiaDesconto {
    @Override
    public double calcularDesconto(double preco) {
        return preco * 0.10;
    }
}