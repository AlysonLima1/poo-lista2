public class Main {
    public static void main(String[] args) {
        GestorDeTransporte gestor = new GestorDeTransporte();

        Veiculo carro = new Carro(5, 120);
        Veiculo aviao = new Aviao(180, 800);
        Veiculo navio = new Navio(1000, 40);

        System.out.println("Viagem de Carro: " + gestor.calcularViagem(carro, 240));
        System.out.println("Viagem de Avião: " + gestor.calcularViagem(aviao, 1600));
        System.out.println("Viagem de Navio: " + gestor.calcularViagem(navio, 200));
    }
}