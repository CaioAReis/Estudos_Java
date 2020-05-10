package Estrutura_de_Dados.Recursividade.Fibonacci;

public class Fibonacci {

    private static int acumulador = 0;
    
    public static int acumuladorFibo(int i){
        
        if (i <= 0)
            return acumulador;
        else{
            
            acumulador += fibonacci(i);
            return acumuladorFibo(i - 1);
            
        }
    }
    
    public static int fibonacci(int i){
        
        if (i == 0 || i == 1)
            return i;
        else
            return (fibonacci(i - 1) + fibonacci(i - 2));
        
    }

    public static void main(String[] args) {
        
        System.out.println(fibonacci(6)); // RETORNA O RESULTADO DA POSIÇÃO
        
        System.out.println(acumuladorFibo(6)); // RETORNA A SOMA DOS RESULTADOS ATÉ A POSIÇÃO INFORMADA
        
    }
}
