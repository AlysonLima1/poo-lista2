package Q9;

public class EditorImagem {

    public String exibirInformacoes(Imagem imagem) {
        return "Largura: " + imagem.largura + ", Altura: " + imagem.altura +
               ", Tamanho: " + imagem.calcularTamanho() + " pixels\n" +
               imagem.processar();
    }

    public Imagem ajustarImagem(Imagem imagem, int novaLargura, int novaAltura) {
        if (imagem instanceof ImagemColorida) {
            return new ImagemColorida(novaLargura, novaAltura);
        }
        
        if (imagem instanceof ImagemPretoBranco) {
            return new ImagemPretoBranco(novaLargura, novaAltura);
        }
        
        if (imagem instanceof ImagemTransparente) {
            return new ImagemTransparente(novaLargura, novaAltura);
        }
        return null;
    }
}