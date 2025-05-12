package Q9;

public class Main {
    public static void main(String[] args) {
        EditorImagem editor = new EditorImagem();

        Imagem img1 = new ImagemColorida(1920, 1080);
        Imagem img2 = new ImagemPretoBranco(800, 600);
        Imagem img3 = new ImagemTransparente(1024, 768);

        System.out.println("Imagem 1:\n" + editor.exibirInformacoes(img1));
        System.out.println("\nImagem 2:\n" + editor.exibirInformacoes(img2));
        System.out.println("\nImagem 3:\n" + editor.exibirInformacoes(img3));

        Imagem imgAjustada = editor.ajustarImagem(img1, 1280, 720);
        System.out.println("\nImagem ajustada:\n" + editor.exibirInformacoes(imgAjustada));
    }
}