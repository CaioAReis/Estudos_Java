package Estrutura_de_Dados.Recursividade.Fibonacci;

import java.util.Scanner;

public class Fibonacci {

    private static int calls = -1;
    
    public static int fibonacci(int i){
        calls++;
        if (i == 0 || i == 1) return i;
        else return (fibonacci(i - 1) + fibonacci(i - 2));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), value, fib;

        for (int i = 0; i < n; i++) {
            value = input.nextInt();
            fib = fibonacci(value);
            System.out.println("fib(" + value + ')' + " = " + calls + " calls = " + fib);
            calls = -1;
        }
    }
}