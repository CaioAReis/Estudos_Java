package AtividadeCI;

public class Main {
    public static void main(String[] args) {
        Grafo<Character> grafo = new Grafo<Character>();
        // DEFININDO OS VERTICES
        grafo.adicionarVertice('A');
        grafo.adicionarVertice('E');
        grafo.adicionarVertice('I');
        grafo.adicionarVertice('O');
        grafo.adicionarVertice('U');
        // DEFININDO AS ROTAS
        // A
        grafo.adicionarAresta('A', 'E', 10);
        grafo.adicionarAresta('A', 'U', 5);
        // E
        grafo.adicionarAresta('E', 'I', 1);
        grafo.adicionarAresta('E', 'U', 2);
        // I
        grafo.adicionarAresta('I', 'O', 6);
        // O
        grafo.adicionarAresta('O', 'I', 4);
        grafo.adicionarAresta('O', 'A', 7);
        // U
        grafo.adicionarAresta('U', 'O', 2);
        grafo.adicionarAresta('U', 'E', 3);
        grafo.adicionarAresta('U', 'I', 9);

        //###########################################################

        System.out.println("\n\n\n\n");
        grafo.buscarMelhorCaminho('U', 'A');
        grafo.imprimirCaminhosGrafo();
    }
}
