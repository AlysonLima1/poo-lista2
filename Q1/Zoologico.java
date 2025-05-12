public class Zoologico {
    private Animal cachorro;
    private Animal gato;

    public Zoologico() {
        this.cachorro = new Cachorro();
        this.gato     = new Gato();
    }

    public void reproduzirSons() {
        System.out.println("Sons do zoológico:");
        cachorro.som();
        gato.som();
    }

    // Getters caso queira manipular individualmente
    public Animal getCachorro() {
        return cachorro;
    }

    public Animal getGato() {
        return gato;
    }
}
