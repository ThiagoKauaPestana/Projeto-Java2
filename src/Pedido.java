import java.util.ArrayList;

public class Pedido {
    private static int contCodigo = 1;
    private int codigo;
    private Cliente cliente;
    private ArrayList<Item> itens;
    private double total;

    public Pedido(Cliente cliente) {
        this.codigo = contCodigo;
        contCodigo++;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
        this.total =  0.0;

    }
    public double getTotal() {
        return total;

    }

    public int getCodigo(){
        return codigo;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public ArrayList<Item> getItems() {
        return itens;
    }
    
    public String toString(){
        String notaPedido = "Pedido: "+ codigo + " | Cliente: " + cliente.getNome() + "\n";

        for (Item item : itens){
            notaPedido += item.toString() + "\n";
        }
        notaPedido += "Total do Pedido: " + total;
        return notaPedido;

    }
    public void adicionarItem(Produto produto, int quantidade) {
        if (produto.getQuantidade() >= quantidade) {
            Item item = new Item(produto, quantidade);
            itens.add(item);
            total += item.getSubTotal();
            produto.reduzirEstoque(quantidade);
            System.out.println("Produto " + produto.getDescricao() + " adicionado ao pedido.");
        } else {
            System.out.println("Não há estoque suficiente para " + produto.getDescricao() + 
                                ". Quantidade disponível: " + produto.getQuantidade());
    }
}

}
