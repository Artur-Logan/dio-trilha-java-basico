import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, seja bem vindo ao DIO Bank!");

        System.out.println("Insira seu nome");
        String nomeCliente = sc.nextLine();

        System.out.println("Insira sua idade");
        int idadeCliente = sc.nextInt();

        if(idadeCliente < 18){
            throw new RuntimeException("Desculpe " + nomeCliente + ", mas apenas maiores de 18 anos podem criar uma conta na DIO Bank!");
        }
        
        System.out.println("Por favor, digite o número da Agência !");
        int numeroAgencia = sc.nextInt();

        System.out.println("Por favor, digite a Agência !");
        String nomeAgencia = sc.next();

        System.out.println("Por favor, insira seu Saldo !");
        double saldo = sc.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta na DIO Bank, sua agência é " + nomeAgencia + ", conta " + numeroAgencia + ", e seu saldo " + saldo + " já está disponível para saque!");
        
        sc.close();
    }
}
