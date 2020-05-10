package Exercicios_Basicos;
import java.util.Scanner;
public class Questão30 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Informe um valor: ");
        int termoN = input.nextInt();

        for (int i = 1; i <= termoN; i++){

            System.out.println(i + "º Termo: " + (i*i));

        }
    }
}
