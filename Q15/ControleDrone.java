package Q15;

public class ControleDrone implements ControleAutonomo {
    @Override
    public String iniciarRota(String destino) {
        return "Drone decolando para o destino: " + destino + ".";
    }

    @Override
    public String ajustarVelocidade(double velocidade) {
        return "Velocidade do drone ajustada para " + velocidade + " km/h.";
    }
}