import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class NotificadorWhatsApp {

    public static final String ACCOUNT_SID = "ACa68e06a92b14465590c363f40cd8948d";
    public static final String AUTH_TOKEN = "ce3b0ce24bb86786229d940a87ea0046";

    public NotificadorWhatsApp() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public void enviarMensagem(String telefone, String mensagem) {
        try {

            Message message = Message.creator(
                    new PhoneNumber("whatsapp:" + telefone), // ex: whatsapp:+5519987363747
                    new PhoneNumber("whatsapp:+14155238886"), // O número do Twilio Sandbox
                    mensagem
            ).create();

            System.out.println("Mensagem enviada com SID: " + message.getSid());

        } catch (Exception e) {
            System.out.println("Erro ao enviar mensagem: " + e.getMessage());
        }
    }
}
