public class Main {
    public static void main(String[] args) {
        // Testando a classe Zoologico
        Zoologico zoo = new Zoologico();
        zoo.reproduzirSons();
        
        // Manipulando objetos individualmente
        Animal meuCachorro = zoo.getCachorro();
        Animal meuGato      = zoo.getGato();
        
        System.out.println("\nTestes individuais:");
        meuCachorro.som();
        meuGato.som();
    }
}