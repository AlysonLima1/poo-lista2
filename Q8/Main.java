package Q8;

public class Main {
    public static void main(String[] args) {
        SistemaBiblioteca sistema = new SistemaBiblioteca();

        MaterialBiblioteca livro = new Livro("Dom Casmurro", 14);
        MaterialBiblioteca revista = new Revista("Superinteressante", 7);
        MaterialBiblioteca dvd = new DVD("Matrix", 3);

        System.out.println(sistema.registrarEmprestimo(livro));
        System.out.println("Multa por 3 dias de atraso: R$" + sistema.calcularMulta(livro, 3));

        System.out.println("\n" + sistema.registrarEmprestimo(revista));
        System.out.println("Multa por 3 dias de atraso: R$" + sistema.calcularMulta(revista, 3));

        System.out.println("\n" + sistema.registrarEmprestimo(dvd));
        System.out.println("Multa por qualquer atraso: R$" + sistema.calcularMulta(dvd, 10));
    }
}