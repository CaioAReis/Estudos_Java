package Exercicios_Basicos;
import java.util.Scanner;
public class Questao05 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);

        System.out.println("### Calculador de peso ideal ###");
        
        System.out.print("Informe sua altura: ");
        float altura = input.nextFloat();
        System.out.print("Informe seu sexo: [M/F] ");
        char sexo = input.next().charAt(0); 
        
        if(sexo == 'm')
            System.out.printf("Seu peso ideal é: %.2f \n", 72.2*altura-58);
        else if(sexo == 'f')
            System.out.printf("Seu peso ideal é: %.2f \n", 62.1*altura-44.7);
        
        
    }
}
