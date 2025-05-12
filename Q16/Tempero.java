package Q16;

public class Tempero extends Ingrediente {
    public Tempero(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String informar() {
        return "Tempero: " + nome + " - " + quantidade + "g.";
    }
}