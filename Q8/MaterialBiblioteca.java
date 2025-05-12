package Q8;

public abstract class MaterialBiblioteca {
    protected String titulo;
    protected int prazoDevolucao;

    public MaterialBiblioteca(String titulo, int prazoDevolucao) {
        this.titulo = titulo;
        this.prazoDevolucao = prazoDevolucao;
    }

    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 1.5;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPrazoDevolucao() {
        return prazoDevolucao;
    }
}