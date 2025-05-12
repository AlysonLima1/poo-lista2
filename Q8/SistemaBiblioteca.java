package Q8;

public class SistemaBiblioteca {
    public String registrarEmprestimo(MaterialBiblioteca material) {
        return "Emprestado: " + material.getTitulo() + " | Devolver em: " + material.getPrazoDevolucao() + " dias";
    }

    public double calcularMulta(MaterialBiblioteca material, int diasAtraso) {
        return material.calcularMulta(diasAtraso);
    }
}