public class Produto {
    private String fabricante;
    private String descricao;
    private double precoUnitario;
    private int quantidade;
    private static int contCodigo = 1;
    private int codigo;

    public Produto(String fabricante, String descricao, double precoUnitario, int quantidade){
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
        this.codigo = contCodigo;
        contCodigo++;
    }

    public String getFabricante(){
        return fabricante;
    }

    public String getDescricao(){
        return descricao;
    }

    public double getPrecoUnitario(){
        return precoUnitario;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public int getCodigo(){
        return codigo;
    }

    public String toString() {
        return "Fabricante: " + fabricante + " | Descricao: " + descricao + " | Preco Unitario: " + precoUnitario + " | Quantidade: " + quantidade + " | Codigo: " + codigo;
    }
}
