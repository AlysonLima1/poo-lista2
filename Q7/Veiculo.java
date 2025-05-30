public abstract class Veiculo {
    protected int capacidade;
    protected double velocidadeMaxima;

    public Veiculo(int capacidade, double velocidadeMaxima) {
        this.capacidade = capacidade;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double calcularTempo(double distancia) {
        return distancia / velocidadeMaxima;
    }

    public abstract String tipoDeCombustivel();
}