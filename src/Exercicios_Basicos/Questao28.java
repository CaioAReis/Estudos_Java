package Exercicios_Basicos;
import java.util.Scanner;
public class Questao28 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.print("Informe um valor: ");
        int valor = input.nextInt();
        int cont = 0;

        for (int i = 1; i <= valor; i++){

            if (valor % i == 0) // Números primos só possuem 2 divisores que são 1 e ele mesmo
                cont++;         // Então se um número tiver mais que 2 divisores exatos (resto igual 0), ele não será primo

        }

        if (cont == 2)
            System.out.println("O valor " + valor + " é um número primo!");
        else
            System.out.println("O valor " + valor + " NÃO é um número primo!");
    }
}