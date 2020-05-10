package Exercicios_Basicos;
import java.util.Scanner;
public class Questao19 {
    
    public static void main(String[] args) {
        
        
    Scanner input = new Scanner (System.in);
    
    int num;
    
    System.out.println("PARA SAIR DIGITE UM VALOR NEGATIVO!!");
    
    do{
    
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
    }while(num > 0);
        
        
    }
    
}
