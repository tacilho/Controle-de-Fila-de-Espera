import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        FilaDeEspera fila = new FilaDeEspera();
        NotificadorWhatsApp notificador = new NotificadorWhatsApp();

        System.out.println("Qual o nome do cliente?");
        String nome = sc.nextLine();

        System.out.println("Qual o telefone do cliente?");
        String telefone = sc.nextLine();

        Cliente cliente = new Cliente(nome, telefone);

        fila.adicionarCliente(cliente);
        fila.exibirFila();

        System.out.println("\nA vaga ficou disponível. Enviando mensagem...");
        notificador.enviarMensagem(telefone, "Sua vaga na pizzaria está disponível!");

        sc.close();
    }
}
