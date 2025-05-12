package Q15;

public class ControleCarro implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) {
        return "Carro autônomo iniciando rota para " + destino + ".";
    }

    @Override
    public String ajustarVelocidade(double velocidade) {
        return "Velocidade do carro ajustada para " + velocidade + " km/h.";
    }
}