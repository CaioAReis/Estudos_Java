package Exercicios_Basicos;
import java.util.Scanner;
public class Questao09 {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        System.out.print("Informe o lado A do triângulo: ");
        int a = input.nextInt();
        System.out.print("Informe o lado B do triângulo: ");
        int b = input.nextInt();
        System.out.print("Informe o lado C do triângulo: ");
        int c = input.nextInt();
        
        if((a+b>c) && (a+c>b) && (b+c>a)){
            
            if((a == b) && (a == c))
                System.out.println("É um triângulo equilátero!!");
            else if((a != b) && (a != c) && (c != b))
                System.out.println("É um triângulo escaleno!!");
            else 
                System.out.println("É um triângulo isóceles!!");
            
            
        }else
            System.out.println("Os lados informados NÃO formam um triângulo!!");
    }
}
