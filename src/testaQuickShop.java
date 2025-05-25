import java.util.Scanner;
import java.util.Random;

public class testaQuickShop {
    public static void main(String[] args) {
        int op;
        Scanner entrada = new Scanner(System.in);
        Loja loja = new Loja();
        Random random = new Random();
        int opLoja;

        // NOME: Thiago Kaua Pestana do Amaral
        // TIA: 10420686
        // NOME: Moisés Manoel Dos Santos Filho
        // TIA: 10419955
        // Usuarios e Produtos previamente cadastrados para a avaliacao do Projeto
        loja.cadastrarCliente("Moises", "Mfilho@gmail.com", 12, 1000 ,"Rua 1");
        loja.cadastrarCliente("Kaua", "Kaua@gmail.com", 13, 2000, "Rua 2");
        loja.cadastrarCliente("Gabriel", "Gabriel@gmail.com", 13, 3000, "Rua 3");
        loja.listarClientes();
        loja.cadastrarProduto("Apple", "IPhone", 5000, 10);
        loja.cadastrarProduto("Samsung", "Galaxy", 5000, 10);
        loja.listarProdutos();

        do {
            System.out.println("\n--- QuickShop - Mack ---");
            System.out.println("1) Cadastrar Cliente");
            System.out.println("2) Acessar Loja");
            System.out.println("3) Cadastrar Produto");
            System.out.println("4) Sair");
            System.out.print("Digite a opção: ");
            op = entrada.nextInt();
            entrada.nextLine(); 

            switch (op) {
                case 1:
                    System.out.println("=== CADASTRO DE CLIENTE ===");
                    System.out.print("Nome: ");
                    String nome = entrada.nextLine();

                    System.out.print("E-Mail: "); 
                    String email = entrada.nextLine();

                    System.out.print("Telefone (SEM DDD): "); 
                    int telefone = entrada.nextInt(); 
                    entrada.nextLine();
                    
                    System.out.print("Endereco: "); 
                    String endereco = entrada.nextLine();

                    int id = random.nextInt(9000) + 1000;


                    loja.cadastrarCliente(nome, email, telefone, id, endereco);
                    loja.listarClientes();
                    System.out.printf("Cadastro realizado com sucesso! Seu ID: %d\n", id);
                    break;

                case 2:
                    System.out.println("=== ACESSAR LOJA ===");
                    System.out.print("Digite seu ID: "); 
                    int idLogar = entrada.nextInt();
                    Cliente cliente = loja.verificarCliente(idLogar);
                    if (cliente != null){

                        do {

                        
                            System.out.println("** QuickShop **"); 
                            System.out.printf("Bem-vindo, %s!\n", cliente.getNome());
                            System.out.println("1) Ver Catálogo de Produtos");
                            System.out.println("2) Fazer Novo Pedido");
                            System.out.println("3) Ver Meus Pedidos ");
                            System.out.println("4) Sair ");
                            System.out.print("Selecione uma opção: ");
                            opLoja = entrada.nextInt();

                            switch (opLoja) {
                                case 1:
                                    loja.listarProdutos();
                                    entrada.nextLine();
                                    break;
                            
                                case 2: 
                                    char continuar;
                                    Pedido pedido = loja.criarPedido(cliente);

                                    do {
                                        System.out.print("\n** NOVO PEDIDO **\n");
                                        loja.listarProdutos();
                                        System.out.print("Digite o codigo do produto que deseja: ");
                                        int codigoProd = entrada.nextInt();

                                        Produto produto = loja.buscaProdCodigo(codigoProd);

                                        if (produto != null) {
                                            System.out.print("Digite a quantidade: ");
                                            int quantidade = entrada.nextInt();

                                            
                                            pedido.adicionarItem(produto, quantidade);
                                            
                                        } else {
                                            System.out.println("Produto nao encontrado");
                                        }

                                        System.out.print("Deseja adicionar mais itens ao Pedido? (Digite S ou N): ");
                                        continuar = entrada.next().charAt(0);


                                    } while(continuar == 's' || continuar == 'S');
                                    

                                    System.out.println("** Pedido Finalizado ** ");
                                    break;

                                    case 3:
                                        loja.listarPedidosCliente(idLogar);
                                        break;

                                    case 4:
                                        System.out.println("Saindo..");
                                        break;
                                default:
                                    break;
                            }
                        } while (opLoja != 4);
                        break;   
                    
                    } else{
                        System.out.print("Cliente nao localizado.");
                        break;
                    }

                case 3:
                    System.out.println("=== CADASTRO DE PRODUTO ===");
                    System.out.print("Fabricante: "); 
                    String fabricante = entrada.nextLine();

                    System.out.print("Descricao: "); 
                    String descricao = entrada.nextLine();

                    System.out.print("Preco Unitario: "); 
                    double precoUnitario = entrada.nextDouble();

                    System.out.print("Quantidade: "); 
                    int quantidade = entrada.nextInt(); 
                    entrada.nextLine();

                    loja.cadastrarProduto(fabricante, descricao, precoUnitario, quantidade);
                    loja.listarProdutos();
                    System.out.printf("Cadastro realizado com sucesso!");
                    break;

                case 4:
                    System.out.println("Saindo..");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }

        } while (op != 4);

        entrada.close();
    }
}
