package Exercicios_Basicos;

import java.util.Scanner;

//  25. Escreva um algoritmo em PORTUGOL que determine se dois valores inteiros e positivos A e B são primos
//  entre si. (dois números inteiros são ditos primos entre si, caso não exista divisor comum aos dois números).

public class Questao25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int valorA, valorB, counter = 0, i;

        do {
            System.out.println("Informe apenas valores positivos!!");
            System.out.print("Informe o valor de A: ");
            valorA = input.nextInt();
            System.out.print("Informe o valor de B: ");
            valorB = input.nextInt();
        }while(valorA <= 0 || valorB <= 0);

        if (valorA > valorB){
            for ( i = 1; i <= valorA; i++){

                if (i > valorB) break;

                if ((valorA % i == 0) && (valorB % i == 0)) {
                    counter++;
                }
            }
        }else {
            for ( i = 1; i <= valorB; i++) {

                if (i > valorA) break;

                if ((valorB % i == 0) && (valorA % i == 0)) {
                    counter++;
                }
            }
        }
        if (counter == 1)
            System.out.println("Os números " + valorA + " e " + valorB + " são primos entre si!");
        else
            System.out.println("Os números " + valorA + " e " + valorB + " NÃO são primos entre si!");
    }
}
