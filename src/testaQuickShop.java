import java.util.Scanner;
import java.util.Random;

public class testaQuickShop {
    public static void main(String[] args) {
        int op;
        Scanner entrada = new Scanner(System.in);
        Loja loja = new Loja();
        Random random = new Random();
        int opLoja;


        loja.cadastrarCliente("Moises", "Mfilho@gmail.com", 12, 1000);
        loja.cadastrarCliente("Kaua", "Kaua@gmail.com", 13, 2000);
        loja.cadastrarCliente("Gabriel", "Gabriel@gmail.com", 13, 3000);
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
            entrada.nextLine(); // Consumir quebra de linha

            switch (op) {
                case 1:
                    System.out.println("=== CADASTRO DE CLIENTE ===");
                    System.out.print("Nome: "); // colocar tratamento de erro
                    String nome = entrada.nextLine();

                    System.out.print("E-Mail: "); // colocar tratamento de erro
                    String email = entrada.nextLine();

                    System.out.print("Telefone (SEM DDD): "); // colocar tratamento de erro
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

                                    do {
                                        System.out.print("\n** NOVO PEDIDO **\n");
                                        loja.listarProdutos();
                                        Pedido pedido = loja.criarPedido(cliente);
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
                                        loja.listarPedidos();

                                    case 4:

                                default:
                                    break;
                            }
                        } while (opLoja != 4);
                    
                    } else{
                        System.out.print("Cliente nao localizado.");
                        break;
                    }

                case 3:
                    System.out.println("=== CADASTRO DE PRODUTO ===");
                    System.out.print("Fabricante: "); // colocar tratamento de erro
                    String fabricante = entrada.nextLine();

                    System.out.print("Descricao: "); // colocar tratamento de erro
                    String descricao = entrada.nextLine();

                    System.out.print("Preco Unitario: "); // colocar tratamento de erro
                    double precoUnitario = entrada.nextDouble();

                    System.out.print("Quantidade: "); // colocar tratamento de erro
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
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (op != 4);

        entrada.close();
    }
}
