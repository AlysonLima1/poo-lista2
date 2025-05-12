package Q16;

public class Main {
    public static void main(String[] args) {
        Prato prato = new Prato("Prato Fitness");

        prato.adicionarIngrediente(new Proteina("Frango grelhado", 150));
        prato.adicionarIngrediente(new Carboidrato("Arroz integral", 100));
        prato.adicionarIngrediente(new Tempero("Orégano", 5));

        System.out.println(prato.listarIngredientes());

        Preparo preparo = new PratoSimples("Prato Fitness");
        System.out.println(preparo.preparar());
    }
}