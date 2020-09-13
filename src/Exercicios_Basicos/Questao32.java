package Exercicios_Basicos;

//  32. Escreva um algoritmo em PORTUGOL, que leia um conjunto de 50 fichas, cada uma contendo a
//  altura e o código do sexo de uma pessoa (código = 1 se for masculino e 2 se for feminino), e calcule e
//  imprima: - a maior e a menor altura da turma; - a média de altura das mulheres; - a média de altura da turma

import java.util.Scanner;

public class Questao32 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float altura, totalAltura = 0, totalAlturaMulheres = 0, maiorAltura = 0, menorAltura = 100, mediaAlturaMulheres, mediaAlturaTurma;
        byte sexo, totalMulheres = 0;

        for (int i = 1; i <= 50; i++){
            System.out.print("Informa a altura: ");
            altura = input.nextFloat();
            System.out.print("Informe o sexo: (1 p/ Masculino e 2 p/ Feminino) ");
            sexo = input.nextByte();

            if (altura > maiorAltura) maiorAltura = altura;
            if (altura < menorAltura) menorAltura = altura;

            if (sexo == 2){
                totalMulheres++;
                totalAlturaMulheres += altura;
            }

            totalAltura += altura;
        }

        mediaAlturaMulheres = totalAlturaMulheres / totalMulheres;
        mediaAlturaTurma = totalAltura / 50;

        System.out.println("Maior altura: " + maiorAltura +
                         "\nMenor altura: " + menorAltura +
                         "\nMedia altura das mulheres: " + mediaAlturaMulheres +
                         "\nMedia de altura da turma: " + mediaAlturaTurma);

    }
}