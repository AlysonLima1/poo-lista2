package Q20;

public class Moto extends Veiculo {
    public Moto(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / 100.0;
    }
}