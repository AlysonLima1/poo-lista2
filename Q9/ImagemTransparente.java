package Q9;

public class ImagemTransparente extends Imagem {
    public ImagemTransparente(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Aplicando máscara de transparência.";
    }
}