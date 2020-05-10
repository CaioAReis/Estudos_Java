package Exercicios_Basicos;
import java.util.Scanner;
public class Questao15 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Informe as dimensões do terreno: ");
        float distanciaA = input.nextFloat();
        float distanciaB = input.nextFloat();
        
        float area = distanciaA * distanciaB;
        
        System.out.print("Com as dimensões de: ");
        System.out.println(distanciaA + "  X  " + distanciaB);
        System.out.println("O terreno possui área de: " + area);
    }
}
