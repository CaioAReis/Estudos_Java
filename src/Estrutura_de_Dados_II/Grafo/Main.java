package Estrutura_de_Dados_II.Grafo;

public class Main {
    public static void main(String[] args) {

        //  TESTANDO...

        Grafo grafo = new Grafo();

        //  DEFININDO OS VERTICES
        grafo.addVertice('A');
        grafo.addVertice('B');
        grafo.addVertice('C');
        grafo.addVertice('D');
        grafo.addVertice('E');
        grafo.addVertice('F');

        //  DEFININDO AS ROTAS
        //  A
        grafo.addAresta('A', 'B', 1,1,1);
        grafo.addAresta('A', 'D',2,2,2);
        grafo.addAresta('A', 'E',3,3,3);
        //  B
        grafo.addAresta('B', 'C', 7,7,7);
        //  C
        grafo.addAresta('C', 'F', 2,2,2);
        //  D
        grafo.addAresta('D', 'E',2,2,2);
        //  E
        grafo.addAresta('E', 'D',15,15,15);
        grafo.addAresta('E', 'B',1,1,1);
        grafo.addAresta('E', 'C',3,3,3);
        //  F
        grafo.addAresta('F', 'E',1,1,1);



        grafo.buscarMelhorCaminho('A', 'C');

    }
}
