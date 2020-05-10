package Exercicios_Basicos;
import java.util.Scanner;
public class Questao02 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Insira um valor: ");
        int num = input.nextInt();
        
        if(num%2 == 0){
            if(num>0){
                System.out.println("O número informado é um PAR, POSITIVO!");
            }else
                System.out.println("O número informado é um PAR, NEGATIVO!");
        }else{ 
            if(num>0){
                System.out.println("O número informado é um IMPAR, POSITIVO!");
            }else
                System.out.println("O número informado é um IMPAR, NEGATIVO!");
        }
    }
}
