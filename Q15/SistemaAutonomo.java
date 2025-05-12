package Q15;

public class SistemaAutonomo {
    public String navegar(ControleAutonomo controle, String destino, double velocidade) {
        String rota = controle.iniciarRota(destino);
        String velocidadeInfo = controle.ajustarVelocidade(velocidade);
        return rota + "\n" + velocidadeInfo;
    }
}