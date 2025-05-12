public class Main {
    public static void main(String[] args) {
        // Instanciando veículos
        Veiculo vGenerico = new Veiculo("Honda", "GenericX", 2020);
        Carro    meuCarro   = new Carro("Toyota", "Corolla", 2022, 4);
        Motocicleta minhaMoto = new Motocicleta("Yamaha", "MT-07", 2021, "Reto");

        // Chamando informacoes() em cada objeto
        System.out.println("=== Veículo Genérico ===");
        vGenerico.informacoes();

        System.out.println("\n=== Carro ===");
        meuCarro.informacoes();

        System.out.println("\n=== Motocicleta ===");
        minhaMoto.informacoes();

        // Demonstração de polimorfismo
        System.out.println("\n=== Polimorfismo: lista de Veículos ===");
        Veiculo[] garagem = { vGenerico, meuCarro, minhaMoto };
        for (Veiculo v : garagem) {
            v.informacoes();
            System.out.println("-------------------------");
        }
    }
}
