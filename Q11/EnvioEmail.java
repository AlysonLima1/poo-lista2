package Q11;

public class EnvioEmail implements EnvioMensagem {
    private String status;

    @Override
    public boolean enviar(String mensagem) {
        try {
            System.out.println("Enviando e-mail: " + mensagem);
            status = "E-mail enviado com sucesso.";
            return true;
        } catch (Exception e) {
            status = "E-mail não enviado.";
            return false;
        }
    }

    @Override
    public String obterStatus() {
        return status;
    }
}