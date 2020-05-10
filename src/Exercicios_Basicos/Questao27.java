package Exercicios_Basicos;
import java.util.Scanner;
public class Questao27 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = input.nextInt();

        System.out.println("Os divisores desse valor são: ");
        for (int i = 1; i < valor; i++){

            if (valor % i == 0)
                System.out.print(i + ", ");

        }
    }
}
