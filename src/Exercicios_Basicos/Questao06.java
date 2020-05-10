package Exercicios_Basicos;
import java.util.Scanner;
public class Questao06 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("### Classificador de categorias ###");
        
        System.out.print("Informe sua Idade: ");
        int idade = input.nextInt();
        
        if(idade < 5)
            System.out.println("Não pode participar!");
        else if(idade > 5 && idade <= 7)
            System.out.println("Infantil A");
        else if(idade > 7 && idade <= 10)
            System.out.println("Infantil B");
        else if(idade > 10 && idade <= 13)
            System.out.println("Juvenial A");
        else if(idade > 13 && idade <= 17)
            System.out.println("Juvenial B");
        else if(idade > 18)
            System.out.println("Sênior");
        
        
    }
}
