package Q16;

public class Carboidrato extends Ingrediente {
    public Carboidrato(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String informar() {
        return nome + ": " + quantidade + "g de carboidrato.";
    }
}