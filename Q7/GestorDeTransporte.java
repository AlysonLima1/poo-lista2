public class GestorDeTransporte {
    public String calcularViagem(Veiculo veiculo, double distancia) {
        double tempo = veiculo.calcularTempo(distancia);
        return String.format("Tempo estimado: %.2f horas | Combustível: %s",
            tempo, veiculo.tipoDeCombustivel());
    }
}