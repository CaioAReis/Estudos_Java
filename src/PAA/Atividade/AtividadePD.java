import java.util.Arrays;

public class AtividadePD {
    
    static int cutRod(int price[], int index, int n) {

		// base case
		if (index == 0) {
			return n * price[0];
		}
		// At any index we have 2 options either
		// cut the rod of this length or not cut
		// it
		int notCut = cutRod(price, index - 1, n);
		int cut = Integer.MIN_VALUE;
		int rod_length = index + 1;

		if (rod_length <= n)
			cut = price[index] + cutRod(price, index, n - rod_length);

		return Math.max(notCut, cut);
	}

    public static boolean threePartition() {
        
        
        
        return false;
    }

    // Função auxiliar para resolver o problema de 3 partições.
    // Retorna true se existirem três subconjuntos com a soma dada
    public static boolean subsetSum(int[] S, int n, int a, int b, int c)
    {
        // retorna true se o subconjunto for encontrado
        if (a == 0 && b == 0 && c == 0) {
            return true;
        }
 
        // caso base: nenhum item restante
        if (n < 0) {
            return false;
        }
 
        // Caso 1. O item atual se torna parte do primeiro subconjunto
        boolean A = false;
        if (a - S[n] >= 0) {
            A = subsetSum(S, n - 1, a - S[n], b, c);
        }
 
        // Caso 2. O item atual se torna parte do segundo subconjunto
        boolean B = false;
        if (!A && (b - S[n] >= 0)) {
            B = subsetSum(S, n - 1, a, b - S[n], c);
        }
 
        // Caso 3. O item atual se torna parte do terceiro subconjunto
        boolean C = false;
        if ((!A && !B) && (c - S[n] >= 0)) {
            C = subsetSum(S, n - 1, a, b, c - S[n]);
        }
 
        // retorna true se obtivermos uma solução
        return A || B || C;
    }
 
    // Função para resolver o problema de 3 partições. Retorna verdadeiro se o dado
    // set `S[0…n-1]` pode ser dividido em três subconjuntos com uma soma igual.
    public static boolean partition(int[] s) {
        if (s.length < 3) return false;
 
        // obtém a soma de todos os elementos do conjunto
        int sum = Arrays.stream(s).sum();
 
        // retorna true se a soma for divisível por 3
        if (sum % 3 != 0) return false;

        //  Verificar os conjuntos:
        //  Se a soma deles é igual à SUM
        boolean a = true;
        boolean b = true;
        boolean c = true;

        //  Verificar se 3 subconjuntos com a soma dos elementos igual a TOTAL / 3 existe ou não.
        //  Podemos encontrar isso considerando cada item no array fornecido um por um, e para cada item:

        // Inclua o item atual no primeiro subconjunto e repita os itens restantes com a soma restante.
        // Inclua o item atual no segundo subconjunto e repita os itens restantes com a soma restante.
        // Inclua o item atual no terceiro subconjunto e repita os itens restantes com a soma restante.



        //  e o conjunto `S` puder ser dividido em três subconjuntos com uma soma igual
        return subsetSum(s, s.length - 1, sum/3, sum/3, sum/3);
    }

    public static boolean sub(int[] S, int n, int x) {



        return false;
    }




	public static void main(String args[]) {
		// int arr[] = { 1, 5, 8, 9, 10, 17, 17, 20 };
		// int size = arr.length;
		// System.out.println("Maximum Obtainable Value is " + cutRod(arr, size - 1, size));


        int[] s = { 7, 3, 2, 1, 5, 4, 8 };
	}

}
