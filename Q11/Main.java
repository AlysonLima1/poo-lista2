package Q11;

public class Main {
    public static void main(String[] args) {
        GestorMensagens gestor = new GestorMensagens();

        EnvioMensagem email = new EnvioEmail();
        EnvioMensagem sms = new EnvioSMS();
        EnvioMensagem whatsapp = new EnvioWhatsApp();

        System.out.println("Teste Email:");
        gestor.enviarMensagem(email, "Olá por e-mail!");

        System.out.println("\nTeste SMS:");
        gestor.enviarMensagem(sms, "Olá por SMS!");

        System.out.println("\nTeste WhatsApp:");
        gestor.enviarMensagem(whatsapp, "Olá por WhatsApp!");
    }
}