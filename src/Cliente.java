public class Cliente {
    private String nome;
    private String email;
    private int telefone;
    private int id;

    public Cliente(String nome, String email, int telefone, int id) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.id = id;
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
        return "Cliente: " + nome + ", Email: " + email + ", Telefone: " + telefone + ", ID: " + id;
    }

}
