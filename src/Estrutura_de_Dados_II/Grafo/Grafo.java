package Estrutura_de_Dados_II.Grafo;

import java.util.HashMap;
import java.util.Map;

public class Grafo {
//  Atributos
    private final Map <Character, Vertice> conjuntoVertices;
    private int qtdVertices, qtdArestas;

//  Construtor
    public Grafo() {
        this.conjuntoVertices = new HashMap<>();
        this.qtdVertices = 0;
        this.qtdArestas = 0;
    }

//  Métodos
    //  Inserir um Vertice
    public void addVertice(Character element) {
        Vertice novo = new Vertice(element);
        this.conjuntoVertices.put(element,novo);
        this.qtdVertices++;
    }

    //  Remover um Vertice
    public void removeVertice(Character element) {
        Vertice removido = getVetice(element);
        this.qtdArestas -= removido.qtdArestas();
        this.conjuntoVertices.remove(element);
        this.qtdVertices--;
    }

    //  Pegar um Vertice
    public Vertice getVetice(Character element) {
        return conjuntoVertices.get(element);
    }

    //  Existe o Vertice?
    public boolean existeVertice(Character element) {
        return this.conjuntoVertices.containsKey(element);
    }

    //  Pegar a quantidade de arestas de um Vertice
    public int qtdArestasDoVertice(Character element) {
        Vertice temp = getVetice(element);
        return temp.qtdArestas();
    }

    //  Pegar o peso de uma aresta entre dois Vertices
    public double getPesoAresta(Character origem, Character destino) {
        Vertice tempO = getVetice(origem);
        Vertice tempD = getVetice(destino);
        return tempO.pesoAresta(tempD);
    }

    //  Inserir uma Aresta
    public void addAresta(Character origem, Character destino, int peso1, int peso2, int peso3) {
        Vertice tempO = getVetice(origem);
        Vertice tempD = getVetice(destino);
        if (tempO.addAresta(tempD, peso1, peso2, peso3)) this.qtdArestas++;
    }

    //  Remover uma Aresta
    public void removerAresta(Character origem, Character destino) {
        Vertice tempO = getVetice(origem);
        Vertice tempD = getVetice(destino);
        if (tempO.removerAresta(tempD)) this.qtdArestas--;
    }

    //  Existe uma Aresta entra a origem e o destino informado?
    public boolean existeArestaEntre(Character origem, Character destino) {
        Vertice tempO = getVetice(origem);
        Vertice tempD = getVetice(destino);
        return tempO.existeAresta(tempD);
    }

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
