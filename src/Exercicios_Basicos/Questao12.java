package Exercicios_Basicos;
import java.util.Scanner;
public class Questao12 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        float creditoEspecial = 0;
        
        System.out.print("Informe o saldo médio: R$");
        float saldoMedio = input.nextFloat();
        
        if(saldoMedio > 0 && saldoMedio <= 200)
            creditoEspecial = 0;
        else if(saldoMedio > 200 && saldoMedio <= 400)
            creditoEspecial = ((saldoMedio*20)/100);
        else if(saldoMedio > 400 && saldoMedio <= 600)
            creditoEspecial = ((saldoMedio*30)/100);
        else  if(saldoMedio > 600)
            creditoEspecial = ((saldoMedio*40)/100);
        
        System.out.println("Com o saldo médio de: R$" + saldoMedio );
        System.out.println("O Crédito especial será de: R$" + creditoEspecial);
        
        
    }
}
