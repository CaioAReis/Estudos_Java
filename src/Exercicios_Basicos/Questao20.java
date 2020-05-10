package Exercicios_Basicos;
import java.util.Scanner;
public class Questao20 {
    public static void main(String[] args) {
        
     Scanner input = new Scanner (System.in);
     
     int codFuncionario, horasTrabalho, dependentes;
     float salarioBruto, inss, ir;
     
     for (int i = 0; i <= 9; i++){
         
         System.out.print("Informe o Código: ");
         codFuncionario = input.nextInt();
         
         System.out.print("Informe as horas trabalhadas: ");
         horasTrabalho = input.nextInt();
         
         System.out.print("Informe o número de dependentes: ");
         dependentes = input.nextInt();
         
         salarioBruto = (horasTrabalho * 12) + (dependentes * 40);
         
         ir = (float) ((salarioBruto * 5) / 100);
         inss = (float) ((salarioBruto * 8.5)/100);
         
         System.out.println("\n---------------------");
         System.out.println("Código do Funcionário:" + codFuncionario);
         System.out.println("Salário Bruto: R$" + salarioBruto);
         System.out.println("Descontos: "
                 + "\nINSS: R$" + inss
                 + "\nIR: R$" + ir);
         System.out.println("Salário Líquido: R$" + (salarioBruto - (inss + ir)));
         System.out.println("---------------------");
         
     }
        
    }
}
