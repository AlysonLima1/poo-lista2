public class Main {
    public static void main(String[] args) {
        // Criando membros de equipe com diferentes papéis
        MembroEquipe alice = new MembroEquipe("Alice", new PapelDesenvolvedor());
        alice.adicionarTarefa(new Desenvolvimento("Implementar API REST"));
        alice.adicionarTarefa(new Teste("Testar endpoints"));

        MembroEquipe bob = new MembroEquipe("Bob", new PapelDesigner());
        bob.adicionarTarefa(new Design("Criar layout do dashboard"));

        MembroEquipe carol = new MembroEquipe("Carol", new PapelTestador());
        carol.adicionarTarefa(new Teste("Testar fluxo de cadastro"));

        // Listando tarefas
        System.out.println(alice.listarTarefas());
        System.out.println(bob.listarTarefas());
        System.out.println(carol.listarTarefas());
    }
}