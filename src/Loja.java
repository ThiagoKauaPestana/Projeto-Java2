import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        int op;
        Scanner entrada = new Scanner(System.in);
        CadastroCliente cadastro = new CadastroCliente();


        cadastro.cadastrarCliente("Thiago","10420686@mackenzista.com.br", 977809740, 104);
        cadastro.listarClientes();

       do {
        System.out.println("Bem vindo ao QuickShop - Mack");
        System.out.println("1- Cadastrar Cliente");
        System.out.println("2- Acessar Loja");
        System.out.println("3- Sair");
         System.out.print("\nDigite a Opção: ");
        op = entrada.nextInt();

        switch (op) {
            case 1:
                
                break;
        
            default:
                break;
        }


       } while (op != 3);
    }
}
