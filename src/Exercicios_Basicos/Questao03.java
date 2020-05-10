package Exercicios_Basicos;
import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Informe dois valores: ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        
        if(n1 == n2)
            System.out.println("Números Iguais!");
        else if(n1 > n2)
            System.out.println(n1 + " É o maior valor!");
        else 
            System.out.println(n2 + " É o maior valor! ");
            
        
        
        
        
    }
}
