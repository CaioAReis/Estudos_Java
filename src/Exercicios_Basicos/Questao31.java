package Exercicios_Basicos;

//  31. Seja a seguinte série: 1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, ... Escreva um algoritmo que
//  seja capaz de gerar os N termos dessa série. Esse número N deve ser lido do teclado.

import java.util.Scanner;

public class Questao31 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Informe um valor: ");
        int valor = input.nextInt();

        for (int i = 1; i <= valor; i++) System.out.print(i + ", " + (i+3) + ", " + (i+3) + ", ");
    }
}
