package Q20;

public class VeiculoReservavel extends Veiculo implements Reservavel {
    public VeiculoReservavel(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public boolean reservar(String data, Rota rota) {
        System.out.println("Veículo " + modelo + " reservado para " + data + " na rota " +
            rota.getOrigem() + " -> " + rota.getDestino());
        return true;
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / 70.0; // default
    }
}