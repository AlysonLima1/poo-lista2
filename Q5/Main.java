public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente cc = new ContaCorrente("João", 1000.0, 2.5);
        cc.depositar(500);
        cc.sacar(200);

        ContaPoupanca cp = new ContaPoupanca("Maria", 1500.0);
        cp.depositar(200);
        cp.adicionarRendimento(1.2);
        cp.sacar(100);

        ContaSalario cs = new ContaSalario("Carlos", 2000.0, 2);
        cs.sacar(300);
        cs.sacar(300);
        cs.sacar(300); // Deve falhar por limite

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);
        banco.adicionarConta(cs);

        banco.gerarRelatorio();

        // Simular fim de mês para ContaSalario
        cs.resetarSaques();
        cs.sacar(100);

        banco.gerarRelatorio();
    }
}