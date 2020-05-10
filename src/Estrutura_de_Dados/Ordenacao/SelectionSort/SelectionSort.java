package Estrutura_de_Dados.Ordenacao.SelectionSort;

public class SelectionSort {
    
    public static void selectionSort(int[] vetor){
        
        for (int i = 0; i < vetor.length-1; i++){
            
            int menorValor = vetor[i];
            
            for (int j = i+1; j < vetor.length; j++){
                
// A odem de exibição pode ser alterada em CRESCENTE ou DECRESCENTE a depender da comparação feita com ( > ou < )                    

                if (vetor[j] < menorValor){ 
                    
                    menorValor = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = menorValor;
                    
                }
            }
        }

        for (int value : vetor) {
            System.out.print(value + " | ");
        }
    }
}
