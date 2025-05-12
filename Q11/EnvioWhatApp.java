package Q11;

public class EnvioWhatsApp implements EnvioMensagem {
    private String status;

    @Override
    public boolean enviar(String mensagem) {
        System.out.println("Enviando WhatsApp: " + mensagem);
        try {
            status = "WhatsApp enviado com sucesso.";
            return true;    
        } catch (Exception e) {
            status = "WhatsApp não enviado.";
            return false;  
        }
    }

    @Override
    public String obterStatus() {
        return status;
    }
}