package Q10;

public class Main {
    public static void main(String[] args) {
        GestorProjeto gestor = new GestorProjeto();

        MembroEquipe dev = new Desenvolvedor("Alice", "AppMobile");
        MembroEquipe des = new Designer("Bruno", "AppMobile");
        MembroEquipe ger = new GerenteDeProjetos("Carla", "WebPortal");

        gestor.adicionarMembro(dev);
        gestor.adicionarMembro(des);
        gestor.adicionarMembro(ger);

        System.out.println("Relatórios:");
        System.out.println(gestor.exibirRelatorio(dev));
        System.out.println(gestor.exibirRelatorio(des));
        System.out.println(gestor.exibirRelatorio(ger));

        System.out.println("\nEquipe do projeto 'AppMobile':");
        for (MembroEquipe m : gestor.listarEquipePorProjeto("AppMobile")) {
            System.out.println("- " + m.nome + ": " + m.trabalhar());
        }
    }
}