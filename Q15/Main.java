package Q15;

public class Main {
    public static void main(String[] args) {
        SistemaAutonomo sistema = new SistemaAutonomo();

        ControleAutonomo carro = new ControleCarro();
        ControleAutonomo drone = new ControleDrone();
        ControleAutonomo navio = new ControleNavio();

        System.out.println("--- Carro ---");
        System.out.println(sistema.navegar(carro, "Centro", 60));

        System.out.println("\n--- Drone ---");
        System.out.println(sistema.navegar(drone, "Parque", 45));

        System.out.println("\n--- Navio ---");
        System.out.println(sistema.navegar(navio, "Ilha X", 25));
    }
}