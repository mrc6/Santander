import java.util.Scanner;

public class Main {
    public static void main(String[] args){
      Account account = new Account(500);
      System.out.printf("O saldo disponível é %.2f: ",account.getSaldo());
      Scanner scanner = new Scanner(System.in);

        int option = -1;
        do {
            System.out.println("======== Caixa Automático ==========");
            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Criar uma conta");
            System.out.println("2 - Consultar saldo");
            System.out.println("3 - Consultar cheque especial");
            System.out.println("4 - Depositar dinheiro");
            System.out.println("5 - Sacar dinheiro");
            System.out.println("6 - Pagar boleto");
            System.out.println("7 - Verificar se a conta está usando cheque especial");
            System.out.println("0 - Sair");
            System.out.println("====================================");
            option  = scanner.nextInt();
        } while(option != 0);
    }

}


