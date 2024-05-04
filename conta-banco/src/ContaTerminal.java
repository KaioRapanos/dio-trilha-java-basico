import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //TODO: Conhecer e importar a classe Scanner

        Scanner sc = new Scanner(System.in);

        //TODO: Exibir as mensagens para o nosso usuário
        System.out.println("*******************************");
        System.out.println();
        System.out.println("Bem vindo ao banco Java");
        System.out.println();
        System.out.println("*******************************");
        System.out.println("Vamos agora criar sua conta.");

        //TODO: Obter pela scanner os valores digitados pelo usuario
        System.out.println("Por favor, digite o número da sua conta fornecido no caixa.");
        int numero = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Digite o código da sua agência que está embaixo da conta!");
        String agencia  = sc.nextLine();
        

        System.out.println("Por favor, digite seu nome completo.");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo a ser depositado!!");
        double saldo = sc.nextDouble();
        
        //TODO: Exibir a mensagem conta criada  
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco,\n" 
            +"sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",nomeCliente,agencia,numero,saldo);

        


        
        
    }
}
