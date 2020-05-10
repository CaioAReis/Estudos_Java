package Exercicios_Basicos;
import java.util.Scanner;
public class Questao24 {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int id, aumento, qtdProdutosCaros = 0, qtdMesmoValor = 0, totalProdutos = 0;
        float valor, novoValor = 0, somaValores = 0, valorMaisCaro = 0;

        do {

            System.out.print("Informe o ID do Produto: ");
            id = input.nextInt();

            if (id != 0){

                System.out.print("Informe o Valor atual do Produto: ");
                valor = input.nextFloat();

                System.out.print("Informe o percentual de aumento: ");
                aumento = input.nextInt();

                if (aumento > 0)
                    novoValor = ((valor*aumento)/100) + valor;
                else if (aumento == 0)
                    novoValor = valor;

                if (novoValor > 100 || aumento > 5)
                    qtdProdutosCaros++;

                if (novoValor == valor) {
                    somaValores += novoValor;
                    qtdMesmoValor++;
                }

                if (novoValor > valorMaisCaro)
                    valorMaisCaro = novoValor;

                totalProdutos++;

                System.out.println("---------------");
                System.out.println("Valor antigo: " + valor + " Novo Valor: " + novoValor);
            }

        }while (id != 0);

        System.out.println("---------------");
        System.out.println("Quantidade de produtos caros: " + qtdProdutosCaros);
        System.out.println("Média do valor dos produtos que não sofreram aumento: " + (somaValores/qtdMesmoValor));
        System.out.println("Valor do produto mais caro: " + valorMaisCaro);

    }
}
