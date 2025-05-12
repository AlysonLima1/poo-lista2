package Q11;

public class EnvioSMS implements EnvioMensagem {
    private String status;

    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando SMS: " + mensagem);
        try {
            status = "SMS enviado com sucesso.";
            return true;
        } catch (Exception e) {
            status = "SMS enviado com sucesso.";
            return false;
        }
    }

    @Override
    public String obterStatus() {
        return status;
    }
}