package Estrutura_de_Dados.Ordenacao.MergeSort;

import java.util.Arrays;

public class MergeSort {
    
    public static void merge(int[] vetorA, int[] vetorB, int[] vetorC){
        
        int posiA = 0, posiB = 0, posiC = 0;
        
        while (posiA < vetorA.length && posiB < vetorB.length){
            
            if (vetorA[posiA] < vetorB[posiB])
                vetorC[posiC++] = vetorA[posiA++];
            else
                vetorC[posiC++] = vetorB[posiB++];
        }      
        
        while (posiA < vetorA.length)
            vetorC[posiC++] = vetorA[posiA++];
        
        while (posiB < vetorB.length)
            vetorC[posiC++] = vetorB[posiB++];
        
        System.out.println(" A " + Arrays.toString(vetorA));
        System.out.println(" B " + Arrays.toString(vetorB));
        System.out.println(" C " + Arrays.toString(vetorC));
    }
    
    public static void breakUp(int[] vetorC){
        
        if (vetorC.length >= 2){
            
            int meio = vetorC.length / 2;
            int[] vetorA = new int[meio];
            int[] vetorB = new int[vetorC.length - meio];
            
            for (int i = 0; i < meio; i++)
                vetorA[i] = vetorC[i];
            
            for (int i = meio; i < vetorC.length; i++)
                vetorB[i-meio] = vetorC[i];
            
            breakUp(vetorA);
            breakUp(vetorB);
            
            merge(vetorA, vetorB, vetorC);
        }
    }   
}
