public class Desenvolvimento extends Tarefa {
    public Desenvolvimento(String descricao) {
        super(descricao);
    }

    @Override
    public String realizarTarefa() {
        return "Desenvolvendo: " + descricao;
    }
}