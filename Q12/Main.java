package Q12;
public class Main {
    public static void main(String[] args) {
        GestorDeDescontos gestor = new GestorDeDescontos();

        EstrategiaDesconto fidelidade = new DescontoFidelidade();
        EstrategiaDesconto sazonal = new DescontoSazonal();
        EstrategiaDesconto promocional = new DescontoPromocional();

        double precoOriginal = 200.0;

        System.out.println("Preço original: R$" + precoOriginal);

        System.out.println("\nDesconto Fidelidade:");
        double precoFidelidade = gestor.aplicarDesconto(fidelidade, precoOriginal);
        System.out.println("Preço final: R$" + precoFidelidade);

        System.out.println("\nDesconto Sazonal:");
        double precoSazonal = gestor.aplicarDesconto(sazonal, precoOriginal);
        System.out.println("Preço final: R$" + precoSazonal);

        System.out.println("\nDesconto Promocional:");
        double precoPromocional = gestor.aplicarDesconto(promocional, precoOriginal);
        System.out.println("Preço final: R$" + precoPromocional);
    }
}