package Estrutura_de_Dados.Ordenacao.BobbleSort;

public class BobbleSort {
    
    public static void bobbleSort(int[] vetor){
        
        int auxiliar, i, j;
        
        for (i = vetor.length-1; i >= 1; i--){
            
            for (j = 0; j < i; j++){
                
                if (vetor[j] > vetor[j+1]){
                
                auxiliar = vetor[j];
                vetor[j] = vetor[j+1];
                vetor[j+1] = auxiliar;
                
                }
            }
        }
        
        for (i = 0; i < vetor.length; i++)
            System.out.print( vetor[i] + " | ");
        
    }
}
