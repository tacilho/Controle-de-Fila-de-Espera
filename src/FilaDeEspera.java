import java.util.ArrayList;

public class FilaDeEspera {
    private ArrayList<Cliente> fila;

    public FilaDeEspera() {
        fila = new ArrayList<>();
    }

    public void adicionarCliente(Cliente cliente) {
        fila.add(cliente);
        System.out.println(cliente.getNome() + " adicionado com sucesso à fila de espera!");
    }

    public void removerCliente(Cliente cliente) {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
        } else {
            Cliente clienteRemovido = fila.remove(0);
            System.out.println(clienteRemovido.getNome() + "foi removido da fila de espera!");
        }
    }

    public void exibirFila() {
        if (fila.isEmpty()) {
            System.out.println("Fila vazia!");
        } else {
            System.out.println("Clientes na fila de espera:");
            for (Cliente cliente : fila) {
                System.out.println("- " + cliente.getNome() + " (" + cliente.getTelefone() + ")");
            }
        }
    }
}

