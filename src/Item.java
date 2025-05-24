public class Item {
    private Produto produto;
    private int quantidade;


    public Item(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto(){
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubTotal(){
        return produto.getPrecoUnitario() * quantidade;
    }

    public String toString(){
        return "Produto: " + produto.getDescricao() +
        " | Quantidade: " + quantidade +
        " | Preco Unitario: " +produto.getPrecoUnitario() +
        " | Sub Total: " + getSubTotal();
    }
}


