package Q16;
public class Proteina extends Ingrediente {
    public Proteina(String nome, double quantidade) {
        super(nome, quantidade);
    }

    @Override
    public String informar() {
        return nome + ": " + quantidade + "g de proteína.";
    }
}