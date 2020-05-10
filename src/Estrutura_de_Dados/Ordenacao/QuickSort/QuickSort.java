package Estrutura_de_Dados.Ordenacao.QuickSort;

public class QuickSort {
    
    public static void quickSort(int[] vetor, int inicio, int fim){
        
        if (inicio <= fim){
            
            int posiPivo = separarVetor(vetor, inicio, fim);
            quickSort(vetor, inicio, posiPivo - 1);
            quickSort(vetor, posiPivo + 1, fim);
        }
    }
    
    public static int separarVetor(int[] vetor, int inicio, int fim){
        
        int pivo = vetor[inicio], i = inicio+1, f = fim;
        
        while (i <= f){
            
            if (vetor[i] <= pivo) i++;
            else if (vetor[f] > pivo) f--;
            else{
                
                trocarValores(vetor, i, f);
                i++; f--;
            }
        }
        
        trocarValores(vetor, inicio, f);
        return f;
    }
    
    public static void trocarValores(int[] vetor, int i, int f){

        int troca = vetor[i];
        vetor[i] = vetor[f];
        vetor[f] = troca;
    }
}