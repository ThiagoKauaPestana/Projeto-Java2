import java.util.ArrayList;

public class Loja {
    private ArrayList<Cliente> clientes;
    private ArrayList<Produto> produtos;
    private ArrayList<Pedido> pedidos;

    public Loja() {
        clientes = new ArrayList<>();
        produtos = new ArrayList<>();
        pedidos = new ArrayList<>();
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
        return null;
    }

    public void listarProdutos(){
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    public void cadastrarProduto(String fabricante, String descricao, double precoUnitario, int quantidade) {
        Produto novoProduto = new Produto(fabricante, descricao, precoUnitario, quantidade);
        produtos.add(novoProduto);
    }

    public Pedido criarPedido(Cliente cliente){
        Pedido novoPedido = new Pedido(cliente);
        pedidos.add(novoPedido);
        return novoPedido;
    }

    public void listarPedidos(){
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);

        }
    }

    public void listarPedidosCliente(int id){
        for (Pedido pedido : pedidos){
            if (pedido.getCliente().getID() == id){
                System.out.println(pedido);
            }
        }
    }

    public Produto buscaProdCodigo(int codigo) {
        for (Produto p : produtos){
            if (p.getCodigo() == codigo){
                return p;
            }
        }
        return null;
    }


}
