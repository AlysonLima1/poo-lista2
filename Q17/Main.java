package Q17;

public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Lucas");

        Emprestavel livro = new LivroEmprestavel("O Senhor dos Anéis");

        livro.emprestar(usuario);
        
        System.out.println(usuario.listarMateriaisEmprestados());

        System.out.println("\nApós devolver o DVD:\n" + usuario.listarMateriaisEmprestados());
    }
}