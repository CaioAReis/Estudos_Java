package Exercicios_Basicos;
import java.util.Scanner;
public class Questao17 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Informe seu nome: ");
        String nome = input.nextLine();
        
        System.out.print("Informe sua idade: ");
        int idade = input.nextInt();
        
        System.out.println( nome + ", você já viveu " + (idade*365) + " dias!!");
        
        
    }
}
