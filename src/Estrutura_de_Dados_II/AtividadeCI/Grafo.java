package AtividadeCI;

import java.util.HashMap;
import java.util.Map;

public class Grafo<T> {
    // Atributos
    private final Map<T, Vertice<T>> conjuntoVertices;
    private int qtdVertices, qtdArestas;

    // Construtor
    public Grafo() {
        this.conjuntoVertices = new HashMap<>();
        this.qtdVertices = 0;
        this.qtdArestas = 0;
    }

    // Métodos
    // Inserir um Vertice
    public void adicionarVertice(T element) {
        Vertice<T> novo = new Vertice<T>(element);
        this.conjuntoVertices.put(element, novo);
        this.qtdVertices++;
    }

    // Remover um Vertice
    public void removerVertice(T element) {
        Vertice<T> removido = getVetice(element);
        this.qtdArestas -= removido.qtdArestas();
        this.conjuntoVertices.remove(element);
        this.qtdVertices--;
    }

    // Pegar um Vertice
    public Vertice<T> getVetice(T element) {
        return conjuntoVertices.get(element);
    }

    // Existe o Vertice?
    public boolean existeVertice(T element) {
        return this.conjuntoVertices.containsKey(element);
    }

    // Pegar a quantidade de arestas de um Vertice
    public int qtdArestasDoVertice(T element) {
        Vertice<T> temp = getVetice(element);
        return temp.qtdArestas();
    }

    // Pegar o peso de uma aresta entre dois Vertices
    public int getPesoAresta(T origem, T destino) {
        Vertice<T> tempO = getVetice(origem);
        Vertice<T> tempD = getVetice(destino);
        return tempO.pesoAresta(tempD);
    }

    // Inserir uma Aresta
    public void adicionarAresta(T origem, T destino, int peso) {
        Vertice<T> tempO = getVetice(origem);
        Vertice<T> tempD = getVetice(destino);
        if (tempO.addAresta(tempD, peso))
            this.qtdArestas++;
    }

    // Remover uma Aresta
    public void removerAresta(T origem, T destino) {
        Vertice<T> tempO = getVetice(origem);
        Vertice<T> tempD = getVetice(destino);
        if (tempO.removerAresta(tempD))
            this.qtdArestas--;
    }

    // Existe uma Aresta entra a origem e o destino informado?
    public boolean existeArestaEntre(T origem, T destino) {
        Vertice<T> tempO = getVetice(origem);
        Vertice<T> tempD = getVetice(destino);
        return tempO.existeAresta(tempD);
    }

    // Limpar Grafo
    public void limparGrafo() {
        this.conjuntoVertices.clear();
        this.qtdArestas = 0;
        this.qtdVertices = 0;
    }

    // Acessores
    // Pegar a quantidade geral de vertices
    public int getQtdVertives() {
        return qtdVertices;
    }

    // Pegar a quantidade geral de arestas
    public int getQtdArestas() {
        return qtdArestas;
    }
}
