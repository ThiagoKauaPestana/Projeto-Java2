import java.util.Scanner;
import java.util.Random;

public class testaQuickShop {
    public static void main(String[] args) {
        int op;
        Scanner entrada = new Scanner(System.in);
        Loja loja = new Loja();
        Random random = new Random();


        loja.cadastrarCliente("Moises", "Mfilho@gmail.com", 12, 1000);
        loja.cadastrarCliente("Kaua", "Kaua@gmail.com", 13, 2000);
        loja.cadastrarCliente("Gabriel", "Gabriel@gmail.com", 13, 3000);

        do {
            System.out.println("\n--- QuickShop - Mack ---");
            System.out.println("1- Cadastrar Cliente");
            System.out.println("2- Acessar Loja");
            System.out.println("3- Sair");
            System.out.print("Digite a opção: ");
            op = entrada.nextInt();
            entrada.nextLine(); // Consumir quebra de linha

            switch (op) {
                case 1:
                    System.out.println("=== CADASTRO DE CLIENTE ===");
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("E-Mail: ");
                    String email = entrada.nextLine();

                    System.out.print("Telefone: ");
                    int telefone = entrada.nextInt();

                    int id = random.nextInt(9000) + 1000;

                    loja.cadastrarCliente(nome, email, telefone, id);
                    loja.listarClientes();
                    System.out.printf("Cadastro realizado com sucesso! Seu ID: %d\n", id);
                    break;

                case 2:
                    System.out.println("=== ACESSAR LOJA ===");
                    System.out.print("Digite seu ID: ");
                    int idLogar = entrada.nextInt();
                    Cliente cliente = loja.verificarCliente(idLogar);
                    if (cliente != null){
                        System.out.println("** QuickShop **"); 
                        System.out.printf("Bem-vindo, %s!\n", cliente.getNome());
                        System.out.println("1) Ver Catálogo de Produtos");
                        System.out.println("2) Fazer Novo Pedido");
                        System.out.println("3) Ver Meus Pedidos ");
                        System.out.println("4) Sair ");
                        System.out.print("Selecione uma opção: ");
                        op = entrada.nextInt();

                        switch (op) {
                            case 1:
                                System.out.print("Produtos");
                                break;
                        
                            default:
                                break;
                        }
                    
                    } else{
                        System.out.print("Cliente nao localizado.");
                        break;
                    }

                case 3:
                    System.out.println("Saindo do sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (op != 3);

        entrada.close();
    }
}
