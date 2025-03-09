import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class NotificadorWhatsApp {

    public static final String ACCOUNT_SID = "";
    public static final String AUTH_TOKEN = "";

    public NotificadorWhatsApp() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public void enviarMensagem(String telefone, String mensagem) {
        try {

            Message message = Message.creator(
                    new PhoneNumber("whatsapp:" + telefone),
                    new PhoneNumber("whatsapp:+"),
                    mensagem
            ).create();

            System.out.println("Mensagem enviada com SID: " + message.getSid());

        } catch (Exception e) {
            System.out.println("Erro ao enviar mensagem: " + e.getMessage());
        }
    }
}
