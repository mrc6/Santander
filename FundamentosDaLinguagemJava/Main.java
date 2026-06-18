import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int baseYear = OffsetDateTime.now().getYear();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome");
        String nome =  scanner.nextLine();
        System.out.println("Informe o seu ano de nascimento");
        int anoNascimento = scanner.nextInt();
        int idade = baseYear - anoNascimento;
        System.out.println("Olá, " + nome + "! Você tem " + idade + " anos.");
        scanner.close();
    }
}