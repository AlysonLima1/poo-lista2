package Q16;

import java.util.ArrayList;

public class Prato {
    private String nome;
    private ArrayList<Ingrediente> ingredientes;

    public Prato(String nome) {
        this.nome = nome;
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public String listarIngredientes() {
        StringBuilder lista = new StringBuilder("Ingredientes do prato " + nome + ":\n");
        for (Ingrediente ing : ingredientes) {
            lista.append("- ").append(ing.informar()).append("\n");
        }
        return lista.toString();
    }
}