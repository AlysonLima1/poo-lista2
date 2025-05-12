package Q9;

public class ImagemColorida extends Imagem {
    public ImagemColorida(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Aplicando filtro de saturação em imagem colorida.";
    }
}