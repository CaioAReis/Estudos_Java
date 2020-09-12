package Exercicios_Basicos;
import java.util.Scanner;
public class Questao01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um valor: ");
        int n1 = input.nextInt();
        System.out.print("Insira outro valor: ");
        int n2 = input.nextInt();
        
        if(n1 > n2)
            System.out.println("A diferença do maior p/ o menor é de: " + (n1-n2));
        else
            System.out.println("A diferença do maior p/ o menor é de: " + (n2-n1));
    }
}
