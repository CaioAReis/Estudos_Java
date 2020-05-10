package Exercicios_Basicos;
import java.util.Scanner;
public class Questao13 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        float precoUnitario = 0;
        
        System.out.print("Informe o código do produto: ");
        int codigoProduto = input.nextInt();
        
        
        
        switch(codigoProduto){
            case 1001:
                precoUnitario = (float) 5.32;
                break;
            case 1324: 
                precoUnitario = (float) 6.45;
                break;
            case 6548:
                precoUnitario = (float) 2.37;
                break;
            case 987:
                precoUnitario = (float) 5.32;
                break;
            case 7623:
                precoUnitario = (float) 6.45;
                break;
            default:
                System.out.println("Código Inválido!");
        }
        
        if(precoUnitario != 0){
            
            System.out.print("Informe a quantidade comprada: ");
            int quantidade = input.nextInt();

            System.out.println("Valor total da dívida é de: R$" + (precoUnitario * quantidade));
        }
        
    }
}
