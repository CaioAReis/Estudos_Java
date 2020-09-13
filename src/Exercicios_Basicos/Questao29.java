package Exercicios_Basicos;

//  29 . Escreva um algoritmo que calcule os N-menores números primos. Este número N
//  deve ser lido do teclado.

import java.util.Scanner;

public class Questao29 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = input.nextInt();

        System.out.print("Números primos existentes menores que o valor informado:\n| ");
        for (int i = valor; i >= 1; i--){
            int counter = 0;
            for (int j = 1; j <= i; j++){
                if (counter > 2) break;
                if (i % j == 0) counter++;
            }
            if (counter == 2) System.out.print(i + " | ");
        }
    }
}