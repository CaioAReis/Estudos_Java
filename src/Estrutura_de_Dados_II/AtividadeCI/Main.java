package AtividadeCI;

public class Main {
    public static void main(String[] args) {

        Grafo<Character> grafo = new Grafo<Character>();

        // DEFININDO OS VERTICES
        grafo.addVertice('A');
        grafo.addVertice('E');
        grafo.addVertice('I');
        grafo.addVertice('O');
        grafo.addVertice('U');

        // DEFININDO AS ROTAS
        // A
        grafo.addAresta('A', 'E', 10);
        grafo.addAresta('A', 'U', 5);

        // E
        grafo.addAresta('E', 'I', 1);
        grafo.addAresta('E', 'U', 3);

        // I
        grafo.addAresta('I', 'O', 6);

        // O
        grafo.addAresta('O', 'I', 4);
        grafo.addAresta('D', 'A', 7);

        // U
        grafo.addAresta('U', 'O', 2);
        grafo.addAresta('U', 'E', 2);
        grafo.addAresta('U', 'I', 9);

        
    }
}
