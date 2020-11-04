package Estrutura_de_Dados_II.Grafo;

public class Main {
    public static void main(String[] args) {

        //  TESTANDO...

        //  Criar um vértice
        Vertice a = new Vertice('A');
        Vertice b = new Vertice('B');
        Vertice c = new Vertice('C');
        Vertice d = new Vertice('D');

        //  OK
        a.addAresta(b,1,3,5);
        a.addAresta(c,3,5,7);
        a.addAresta(d,1,1,1);
        b.addAresta(a,1,1,1);
        b.addAresta(c,1,1,1);
        b.addAresta(c,2,2,2);

        //  OK
        a.imprimir();
        b.imprimir();
        //  OK
        System.out.println(a.getElement());
        //  OK
        System.out.println(a.qtdArestas());
        //  OK
        System.out.println(a.existeAresta(c));
        //  OK
        System.out.println(a.pesoAresta(c));
        //  OK
        System.out.println(a.buscarAresta(c).getDestino().getElement());
        //  OK
        a.remover(d);
        System.out.println(a.qtdArestas());
        a.imprimir();
    }
}
