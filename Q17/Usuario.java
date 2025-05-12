package Q17;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private ArrayList<Material> materiaisEmprestados;

    public Usuario(String nome) {
        this.nome = nome;
        this.materiaisEmprestados = new ArrayList<>();
    }

    public void adicionarMaterial(Material material) {
        materiaisEmprestados.add(material);
    }

    public void removerMaterial(Material material) {
        materiaisEmprestados.remove(material);
    }

    public String listarMateriaisEmprestados() {
        if (materiaisEmprestados.isEmpty()) {
            return nome + " não possui materiais emprestados.";
        }

        StringBuilder sb = new StringBuilder(nome + "possui os seguintes materiais:\n");
        for (Material m : materiaisEmprestados) {
            sb.append("- ").append(m.informarMaterial()).append("\n");
        }
        return sb.toString();
    }
}