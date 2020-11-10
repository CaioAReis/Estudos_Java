package Exercicios_Basicos;

import java.util.Random;
import java.util.Scanner;

public class Questao0000 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int valor = random.nextInt(100), maiorValor = 100, menorValor = 0, palpite;
        int chutesJogador1 = 0, chutesJogador2 = 0;

        System.out.println("Jogador 1 Chute um número entre 0 e 100!!");
        do {
            System.out.print("Jogador 1: Entre com o palpite: " );
            palpite = input.nextInt();

            if (valor < palpite) {
                maiorValor = palpite;
                System.out.println("n > " + menorValor + " e " + "n < " + maiorValor);
            } else {
                menorValor = palpite;
                System.out.println("n > " + menorValor + " e " + "n < " + maiorValor);
            }
            chutesJogador1++;
        }while (valor != palpite);
        System.out.println("Jogador1: Você acertou o número!! " + valor);

        valor = random.nextInt(100);
        maiorValor = 100; menorValor = 0;
        System.out.println("\n\nJogador 2 Chute um número entre 0 e 100!!");
        do {
            System.out.print("Jogador 2: Entre com o palpite: " );
            palpite = input.nextInt();
            if (valor < palpite) {
                maiorValor = palpite;
                System.out.println("n > " + menorValor + " e " + "n < " + maiorValor);
            } else {
                menorValor = palpite;
                System.out.println("n > " + menorValor + " e " + "n < " + maiorValor);
            }
            chutesJogador2++;
        }while (valor != palpite);
        System.out.println("Jogador2: Você acertou o número!! " + valor);

        if (chutesJogador1 > chutesJogador2){
            System.out.println("VENCENDOR: Jogador2 - " + chutesJogador2 + " chutes");
            System.out.println("PERDEDOR: Jogador1 - " + chutesJogador1 + " chutes");
        } else {
            System.out.println("VENCENDOR: Jogador1 - " + chutesJogador1 + " chutes");
            System.out.println("PERDEDOR: Jogador2 - " + chutesJogador2 + " chutes");
        }
    }
}
