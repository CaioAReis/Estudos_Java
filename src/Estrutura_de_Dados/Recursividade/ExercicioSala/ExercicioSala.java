package Estrutura_de_Dados.Recursividade.ExercicioSala;

public class ExercicioSala {
    
    public static int fatorial(int i){
        
        if (i == 0)
            return 1;
        else
            return i * fatorial(i - 1);
    }

    public static String imprimindoResultado(int n){
        if (n == 1)
            return "(" + n + "/" + 2*n + "!" + ") = ";
        else
            return "(" + n + "/" + 2*n + "!" + ") + ";
    }

    public static double calculoInvertido(int n) throws Exception {

        if (n < 0)
            throw new Exception("Número inválido!!");
        else if (n == 0)
            return 0;
        else{
            System.out.print(imprimindoResultado(n));
            return (double) n / fatorial(2*n) + calculoInvertido(n - 1);
        }
            
    }

    public static void main(String[] args) throws Exception {
        System.out.println(calculoInvertido(10));
    }
}
