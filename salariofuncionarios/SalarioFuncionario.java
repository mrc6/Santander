import java.util.Scanner;

public class SalarioFuncionario {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("Digite o valor do Salario do Funcionario: ");
     float valorSalario = scanner.nextFloat();
     while(valorSalario < 0){
         System.out.println("Valor do salario nao pode ser negativo. Digite o valor do Salario do Funcionario: ");
         valorSalario = scanner.nextFloat();
     }
     System.out.println("Digite o valor dos Beneficios: ");
     float valorBeneficios = scanner.nextFloat();
     while(valorBeneficios < 0) {
         System.out.println("Valor do beneficio nao pode ser negativo. Digite o valor dos Beneficios do Funcionario: ");
         valorBeneficios = scanner.nextFloat();
     }
     
     float valorImposto = 0;
     if(valorSalario >= 0 && valorSalario <= 1100){
         valorImposto = 0.05F * valorSalario;
     } else if (valorSalario >= 1100.01 && valorSalario <= 2500){
         valorImposto = 0.10F * valorSalario;
     } else if (valorSalario >= 2500.01){
         valorImposto = 0.15F * valorSalario;
     }
     
     float saida = valorSalario - valorImposto + valorBeneficios;
     System.out.println(String.format("%.2f", saida));
     
   }

}
