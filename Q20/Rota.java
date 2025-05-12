package Q20;

import java.util.ArrayList;

public class Rota {
    private String origem;
    private String destino;
    private ArrayList<Veiculo> veiculosDisponiveis;

    public Rota(String origem, String destino) {
        this.origem = origem;
        this.destino = destino;
        this.veiculosDisponiveis = new ArrayList<>();
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculosDisponiveis.add(veiculo);
    }

    public String listarVeiculos(double distancia) {
        if (veiculosDisponiveis.isEmpty()) return "Nenhum veículo disponível.";
        StringBuilder sb = new StringBuilder("Veículos disponíveis para " + origem + " → " + destino + ":\n");
        for (Veiculo v : veiculosDisponiveis) {
            sb.append("- ").append(v.modelo).append(" | Tempo estimado: ")
              .append(String.format("%.2f", v.calcularTempo(distancia))).append(" horas\n");
        }
        return sb.toString();
    }
}