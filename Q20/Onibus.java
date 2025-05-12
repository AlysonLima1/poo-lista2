package Q20;

public class Onibus extends Veiculo {
    public Onibus(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        return distancia / 60.0; 
    }
}