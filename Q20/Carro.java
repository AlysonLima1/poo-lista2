package Q20;

public class Carro extends Veiculo {
    public Carro(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / 80.0;
    }
}