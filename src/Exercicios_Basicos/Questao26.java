package Exercicios_Basicos;
import java.util.Scanner;
public class Questao26 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Insira um valor inteiro: ");
        int fatorial = input.nextInt();

        int resultado = 1;

        for (int i = fatorial; i > 1; i--){

            resultado *= i;

        }

        System.out.println("Fatorial do valor é: " + resultado);

    }
}
