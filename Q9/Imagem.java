package Q9;

public abstract class Imagem {
    protected int largura;
    protected int altura;

    public Imagem(int largura, int altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public int calcularTamanho() {
        return largura * altura;
    }

    public abstract String processar();
}