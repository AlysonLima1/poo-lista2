public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Criando alguns funcionários de exemplo
        Gerente g1 = new Gerente("Alice", 8000.0, 2000.0);
        Desenvolvedor d1 = new Desenvolvedor("Bruno", 5000.0, 1.2);
        Desenvolvedor d2 = new Desenvolvedor("Camila", 4800.0, 1.1);
        Estagiario e1 = new Estagiario("Daniel", 2000.0);

        // Adicionando à empresa
        empresa.adicionarFuncionario(g1);
        empresa.adicionarFuncionario(d1);
        empresa.adicionarFuncionario(d2);
        empresa.adicionarFuncionario(e1);

        // Calcular e exibir folha
        empresa.calcularFolhaDePagamento();
    }
}
