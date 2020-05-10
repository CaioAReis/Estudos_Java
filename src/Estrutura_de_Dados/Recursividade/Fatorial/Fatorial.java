package Estrutura_de_Dados.Recursividade.Fatorial;

public class Fatorial {
    
    public static void main(String[] args) {
        
        System.out.println(fatorial(4));
        
    }
    
    public static int fatorial(int i){
        
        if (i == 1)
            return 1;
        else
            return i * fatorial(i - 1);
        
    }
}
