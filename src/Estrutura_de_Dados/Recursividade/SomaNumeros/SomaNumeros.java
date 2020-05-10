package Estrutura_de_Dados.Recursividade.SomaNumeros;

public class SomaNumeros {
    
    public static int somaNumeros(int i){
        
        if (i == 0)
            return 0;
        else
            return i + somaNumeros(i - 1);
    }
    
    public static void main(String[] args) {
        
        System.out.println(somaNumeros(10));
        
    }
}
