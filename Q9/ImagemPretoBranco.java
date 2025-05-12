package Q9;

public class ImagemPretoBranco extends Imagem {
    public ImagemPretoBranco(int largura, int altura) {
        super(largura, altura);
    }

    @Override
    public String processar() {
        return "Convertendo imagem para preto e branco.";
    }
}