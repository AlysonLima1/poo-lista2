package Q20;

public class Main {
    public static void main(String[] args) {
        Rota rota = new Rota("Recife", "Olinda");

        Veiculo onibus = new Onibus("Ônibus Escolar", 50);
        Veiculo carro = new Carro("Toyota Corolla", 5);
        Veiculo moto = new Moto("Honda CB500", 2);

        rota.adicionarVeiculo(onibus);
        rota.adicionarVeiculo(carro);
        rota.adicionarVeiculo(moto);

        System.out.println(rota.listarVeiculos(30));

        Reservavel veiculoReservado = new VeiculoReservavel("Van Executiva", 10);
        veiculoReservado.reservar("12/05/2025", rota);
    }
}