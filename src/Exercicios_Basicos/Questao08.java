package Exercicios_Basicos;
import java.util.Scanner;
public class Questao08 {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        System.out.print("Informe um valor pra X:");
        int x = input.nextInt();
        System.out.print("Infore um valor pra Y: ");
        int y = input.nextInt();
        System.out.print("Informe um valor pra Z: ");
        int z = input.nextInt();
        
        if( x < y && x < z)
            System.out.println("X possui o menor valor: " + x);
        else if( y < x && y < z)
            System.out.println("Y possui o menor valor: " + y);
        else if (z < x && z < y)
            System.out.println("Z possui o menor valor: " + z);
    }
}
