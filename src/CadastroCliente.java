import java.util.ArrayList;

public class CadastroCliente {
    private ArrayList<Cliente> clientes;

    public CadastroCliente(){
        clientes = new ArrayList<>();
    }

    public void cadastrarCliente(String nome, String email, int telefone, int id){
        Cliente novoCliente = new Cliente(nome, email, telefone, id);
        clientes.add(novoCliente);
    }

    public void listarClientes(){
        for (Cliente cliente : clientes){
            System.out.println(cliente);
        }
    }
}
