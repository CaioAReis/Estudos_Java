package Exercicios_Basicos;
import java.util.Scanner;
public class Questao16 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Quantos paẽs foram vendidos: ");
        int quantidadePao = input.nextInt();
        
        System.out.print("Quantas broas foram vendidas: ");
        int quantidadeBroa = input.nextInt();
        
        double somaGeral = (quantidadePao * 0.12)+(quantidadeBroa * 1.50);
        
        double poupanca = ((somaGeral*10)/100);
        
        System.out.println("Soma Total das vendas: R$" + somaGeral);
        System.out.println("Valor que será guardado na poupança é de: R$" + poupanca);
        
        
    }
}
