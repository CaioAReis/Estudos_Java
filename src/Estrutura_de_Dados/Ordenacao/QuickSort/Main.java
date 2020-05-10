package Estrutura_de_Dados.Ordenacao.QuickSort;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        
        int[] vetor = {8,3,5,33,4,2,9,12,1,7};
        
        QuickSort.quickSort(vetor, 0, vetor.length-1);
        System.out.println(Arrays.toString(vetor));
        
    }
}