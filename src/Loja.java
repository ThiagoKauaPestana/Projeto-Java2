import java.util.ArrayList;

public class Loja {
    private ArrayList<Cliente> clientes;

    public Loja() {
        clientes = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, String email, int telefone, int id) {
        Cliente novoCliente = new Cliente(nome, email, telefone, id);
        clientes.add(novoCliente);
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }

    public Cliente verificarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getID() == id) {
                System.out.println("Cliente encontrado: " + cliente.getNome());
                return cliente;
            }
        }
        System.out.println("Cliente não encontrado.");
        return null;
    }
}
