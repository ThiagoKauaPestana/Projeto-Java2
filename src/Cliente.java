public class Cliente {
    private String nome;
    private String email;
    private int telefone;
    private int id;
    private String endereco;

    public Cliente(String nome, String email, int telefone, int id, String endereco) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.id = id;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public int getTelefone(){
        return telefone;
    }

    public int getID(){
        return id;
    }

    public String toString() {
        return "Cliente: " + nome + " | Email: " + email + " | Telefone: " + telefone + " | ID: " + id + " | Endereco: " + endereco;
    }

}
