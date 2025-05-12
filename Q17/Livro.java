package Q17;

public class Livro extends Material {
    public Livro(String titulo) {
        super(titulo);
    }

    @Override
    public String informarMaterial() {
        return "Livro: " + titulo;
    }
}