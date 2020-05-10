package Exercicios_Basicos;
import java.util.Scanner;
public class Questao23 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        Byte idade, serie, gostaRedacao, naoFazRedacao = 0;
        int  qtdLivrosLidos, cont3Serie = 0, maiorQtdLidos = 0, qtdTotalAlunos = 0;

        do {

            System.out.print("Informe a idade: ");
            idade = input.nextByte();

            if (idade > 0){

                System.out.print("informe a série: [1 - Primeira, 2 - Segunda, 3 - Terceira, 4 - Quarta]");
                serie = input.nextByte();

                System.out.print("Quantidade de livros lidos: ");
                qtdLivrosLidos = input.nextByte();

                System.out.print("Gosta de redação: [1- SIM | 0 - NÃO]");
                gostaRedacao = input.nextByte();

                if (serie == 3)
                    cont3Serie++;

                if (serie == 4 && qtdLivrosLidos > maiorQtdLidos)
                    maiorQtdLidos = qtdLivrosLidos;

                if (gostaRedacao == 0)
                    naoFazRedacao++;

                qtdTotalAlunos++;
            }

        }while (idade != 0);

        System.out.println("A quantidade de alunos que está na terceira série: " + cont3Serie);
        System.out.println("A maior quantidade de livros lidos por um aluno que está na quarta série: " + maiorQtdLidos);
        System.out.println("A porcentagem de alunos que não gostam de fazer redação " + ((naoFazRedacao*100)/qtdTotalAlunos) + "%" +
                "\ne que estão na terceira série: " + ((cont3Serie*100)/qtdTotalAlunos) + "%");



    }
}
