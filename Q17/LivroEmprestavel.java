package Q17;

public class LivroEmprestavel extends Livro implements Emprestavel {
    public LivroEmprestavel(String titulo) {
        super(titulo);
    }

    @Override
    public boolean emprestar(Usuario usuario) {
        usuario.adicionarMaterial(this);
        return true;
    }

    @Override
    public boolean devolver(Usuario usuario) {
        usuario.removerMaterial(this);
        return true;
    }
}