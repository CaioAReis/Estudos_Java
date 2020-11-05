package Estrutura_de_Dados_II.Grafo;

public class Main {
    public static void main(String[] args) {

        //  TESTANDO...

        Grafo grafo = new Grafo();

        grafo.addVertice('A');
        grafo.addVertice('B');
        grafo.addVertice('C');

        grafo.addAresta('A', 'B', 2,2,2);
        grafo.addAresta('A', 'C',5,5,5);

        grafo.addAresta('B', 'C', 3,2,1);

        grafo.addAresta('C', 'B', 4,5,6);

        grafo.getVetice('A').imprimir();
        grafo.getVetice('B').imprimir();
        grafo.getVetice('C').imprimir();

        System.out.println("-----------------------");

        grafo.removerAresta('A', 'C');
        grafo.getVetice('A').imprimir();

        System.out.println("-----------------------");

        System.out.println(grafo.existeArestaEntre('A', 'B'));
        System.out.println(grafo.existeArestaEntre('A', 'C'));

        System.out.println("-----------------------");

        System.out.println(grafo.getQtdArestas());

        System.out.println("-----------------------");

        System.out.println(grafo.existeVertice('C'));
        grafo.removeVertice('C');
        System.out.println(grafo.existeVertice('C'));
        System.out.println(grafo.getQtdArestas());

        System.out.println("-----------------------");

        System.out.println(grafo.qtdArestasDoVertice('A'));
        System.out.println(grafo.getPesoAresta('A', 'B'));
    }
}
