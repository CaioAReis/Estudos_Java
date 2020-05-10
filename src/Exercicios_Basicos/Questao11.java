package Exercicios_Basicos;
import java.util.Scanner;
public class Questao11 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Informe o valor depositado: R$");
        float valorDeposito = input.nextFloat();
        
        System.out.print("Informe a taxa de juros anual: ");
        int taxaAnual = input.nextInt();
        
        System.out.print("Informe o tempo em anos para o investimento: ");
        int investimentoAnos = input.nextInt();
        
        float mountante = (float) (((valorDeposito*taxaAnual)/100) * investimentoAnos) + valorDeposito;
        
        System.out.println("O mountante total acumulado será de: R$" + mountante);
        
    }
}
