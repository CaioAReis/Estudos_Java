package Estrutura_de_Dados.Recursividade.ExibirNumeros;

public class ExibirNumeros {
    
    private static int i = 0;
  
    private static enum ordemExibiçao{
        CRESCENTE, DECRESCENTE;
    }
  
    public static void exibirNumeros(ordemExibiçao ordem, int n){
        
        if (ordem.equals(ordemExibiçao.CRESCENTE))
            exibirCRES(n);
        else if (ordem.equals(ordemExibiçao.DECRESCENTE))
            exibirDEC(n);
        
    }
    
    private static String exibirDEC(int n){
        
        if (n > 0){
            
            System.out.print(n + " | ");
            return exibirDEC(n-1);
            
        }else
            return " ";
    }
    
    private static String exibirCRES(int n){
        
        for (int k = 0; k <= n; k++)
            System.out.print( k + " | ");
        return " ";
    }
    
    public static void main(String[] args) {
        exibirNumeros(ordemExibiçao.CRESCENTE, 10);
        System.out.println("\n");
        exibirNumeros(ordemExibiçao.DECRESCENTE, 10);
        System.out.println("\n");
        exibirNumeros(ordemExibiçao.CRESCENTE, 20);
        System.out.println("\n");
        exibirNumeros(ordemExibiçao.DECRESCENTE, 20);
    }
}
