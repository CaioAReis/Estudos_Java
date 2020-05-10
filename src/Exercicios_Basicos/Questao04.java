package Exercicios_Basicos;
import java.util.Scanner;
public class Questao04 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println("Informe três valores: ");
        //Se o primeiro for positivo, imprimir sua raiz quadrada, caso contrário, imprimir o seu quadrado
        int n1 = input.nextInt();
        // se o segundo número for maior que 10 e menor que 100, imprimir a mensagem:
        // “Número está entre 10 e 100 – intervalo permitido”
        int n2 = input.nextInt();
        // se o terceiro número for menor que o segundo,
        // calcular e imprimir a diferença entre eles,
        // caso contrário, imprimir o terceiro número adicionado de 1.
        int n3 = input.nextInt();
        
        if(n1%2 == 0)
            System.out.println("Raiz de " + n1 + " é: " + Math.sqrt(n1));
        else 
            System.out.println("Quadrado de " + n1 + " é: " + Math.pow(n1, 2));
        
        if((n2 > 10) && (n2 < 100))
            System.out.println("Número está entre 10 e 100 – intervalo permitido");
        
        if(n3 < n2)
            System.out.println("Diferença entre " + n2 + " e " + n3 + " é de: " + (n2-n3));
        else 
            System.out.println(n3 + 1);
        
    }
}
