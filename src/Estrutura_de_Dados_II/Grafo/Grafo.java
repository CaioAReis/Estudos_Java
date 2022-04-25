package Grafo;

import java.util.HashMap;
import java.util.Map;

public class Grafo {
//  Atributos
    private final Map <Object, Vertice> conjuntoVertices;
    private int qtdVertices, qtdArestas;
    //  Atributos para o método BuscarMenorCaimnho
    private String caminho, caminhoAtual;
    private int custoTotal, custoAtual;

//  Construtor
    public Grafo() {
        this.conjuntoVertices = new HashMap<>();
        this.qtdVertices = 0;
        this.qtdArestas = 0;
        //-------------------------
        this.caminho = ""; this.caminhoAtual = "";
        this.custoTotal = Integer.MAX_VALUE; this.custoAtual = 0;
    }

//  Métodos
    //  Inserir um Vertice
    public void addVertice(Object element) {
        Vertice novo = new Vertice(element);
        this.conjuntoVertices.put(element,novo);
        this.qtdVertices++;
    }

    //  Remover um Vertice
    public void removeVertice(Object element) {
        Vertice removido = getVetice(element);
        this.qtdArestas -= removido.qtdArestas();
        this.conjuntoVertices.remove(element);
        this.qtdVertices--;
    }

    //  Pegar um Vertice
    public Vertice getVetice(Object element) {
        return conjuntoVertices.get(element);
    }

    //  Existe o Vertice?
    public boolean existeVertice(Object element) {
        return this.conjuntoVertices.containsKey(element);
    }

    //  Pegar a quantidade de arestas de um Vertice
    public int qtdArestasDoVertice(Object element) {
        Vertice temp = getVetice(element);
        return temp.qtdArestas();
    }

    //  Pegar o peso de uma aresta entre dois Vertices
    public double getPesoAresta(Object origem, Object destino) {
        Vertice tempO = getVetice(origem);
        Vertice tempD = getVetice(destino);
        return tempO.pesoAresta(tempD);
    }

    //  Inserir uma Aresta
    public void addAresta(Object origem, Object destino, int peso1, int peso2, int peso3) {
        Vertice tempO = getVetice(origem);
        Vertice tempD = getVetice(destino);
        if (tempO.addAresta(tempD, peso1, peso2, peso3)) this.qtdArestas++;
    }

    //  Remover uma Aresta
    public void removerAresta(Object origem, Object destino) {
        Vertice tempO = getVetice(origem);
        Vertice tempD = getVetice(destino);
        if (tempO.removerAresta(tempD)) this.qtdArestas--;
    }

    //  Existe uma Aresta entra a origem e o destino informado?
    public boolean existeArestaEntre(Object origem, Object destino) {
        Vertice tempO = getVetice(origem);
        Vertice tempD = getVetice(destino);
        return tempO.existeAresta(tempD);
    }

    //--------------------------------------------------------------------------------------------------

    //  Buscar melhor caminho entre dois pontos
    public void buscarMelhorCaminho(Object origem, Object destino) {
        if (existeVertice(origem) && existeVertice(destino)) {
            Vertice o = getVetice(origem), d = getVetice(destino);
            percorrerListaArestas(o,d, o.getListaArestas().getInicio());
            if (custoTotal == Integer.MAX_VALUE)
                System.out.println("Não é possível chegar ao destino.");
            else
                System.out.println("O melhor caminho é o : " + caminho + "\nCom o custo de: " + custoTotal);
            return;
        }
        System.out.println("Vértices não encontrados.");
    }
    private void percorrerListaArestas(Vertice o, Vertice d, Aresta a) {
        if (a != null) {
            System.out.println(o.getElement() + "->" + a.getDestino().getElement());
            caminhoAtual += o.toString() + " -> ";
            if (percorrerVertices(a.getDestino(), d, a)) return;
            percorrerListaArestas(o, d, a.getProxima());
        }
    }
    private boolean percorrerVertices(Vertice atual, Vertice d, Aresta a) {
        if (atual.equals(d)) {
            System.out.println("ACHOU PORRA!");
            custoAtual += a.getPesoFinal();
            if (custoAtual < custoTotal) {
                custoTotal = custoAtual;
                caminho = caminhoAtual + a.getDestino().toString();
                custoAtual = 0; caminhoAtual = "";
            }
            return true;
        }
        if (!atual.foiVizitado(a.getDestino())) {
            atual.addVizitado(a.getDestino());
            custoAtual += a.getPesoFinal();
            a = atual.getListaArestas().getInicio();
            percorrerListaArestas(atual, d, a);
        }
        return false;
    }

    //--------------------------------------------------------------------------------------------------

    //  Limpar Grafo
    public void limparGrafo() {
        this.conjuntoVertices.clear();
        this.qtdArestas = 0;
        this.qtdVertices = 0;
    }

//  Acessores
    //  Pegar a quantidade geral de vertices
    public int getQtdVertives() {
        return qtdVertices;
    }

    //  Pegar a quantidade geral de arestas
    public int getQtdArestas() {
        return qtdArestas;
    }
}
