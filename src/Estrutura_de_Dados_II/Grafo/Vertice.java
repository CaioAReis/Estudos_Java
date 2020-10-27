package Estrutura_de_Dados_II.Grafo;

import java.util.ArrayList;

public class Vertice {
    //  Atributos
    private final Object element;
    private ArrayList <Aresta> listaArestas;
    private int qtdArestas;

    //  Construtor
    public Vertice(Object element) {
        this.element = element;
        this.listaArestas = new ArrayList <Aresta> ();
        this.qtdArestas = 0;
    }

    //  Métodos

    //  Pegar elemento
    public Object getElement() {
        return element;
    }

    //  Quantidade de Arestas do Vértice
    public int getQtdArestas(){
        return this.qtdArestas;
    }

    //  Adicionar uma nova aresta
    public boolean addAresta(Vertice destino, int peso) {
        if (existeAresta(destino)) {
            System.out.println("Já existe uma aresta com o mesmo destino informado!!");
            return false;
        }
        Aresta nova = new Aresta(destino, peso);
        this.listaArestas.add(nova);
        this.qtdArestas++;
        return true;
    }

    //  Remover aresta por destino
    public boolean removerArestaDestino(Vertice destino){
        Aresta removida = buscarArestaDestino(destino);
        if (removida != null) {
            this.listaArestas.remove(removida);
            return true;
        }
        System.out.println("O vértice não possui nenhuma aresta com o destino informado!!");
        return false;
    }

    //  Buscar aresta por destino
    public Aresta buscarArestaDestino(Vertice destino) {
        for (int i = 0; i < this.qtdArestas; i++) {
            if (this.listaArestas.get(i).getDestino() == destino)
                return this.listaArestas.get(i);
        }
        return null;
    }

    // Verificar se uma aresta existe
    public boolean existeAresta(Vertice destino) {
        return buscarArestaDestino(destino) != null;
    }

    //  Buscar peso de uma aresta
    public int pesoAresta(Vertice destino) {
        if (existeAresta(destino)) {
            Aresta aresta = buscarArestaDestino(destino);
            return aresta.getPeso();
        }
        return -1;
    }

    //  Buscar peso de uma aresta por indice
    public int getPesoDaAresta(int position){
        return listaArestas.get(position).getPeso();
    }

    //  Buscar destino de uma aresta
    public Vertice buscarDestino(Vertice destino) {
        if (existeAresta(destino)) {
            return buscarArestaDestino(destino).getDestino();
        }
        return null;
    }

    //  Buscar destino de uma Aresta por indice
    public Vertice getDestinoAresta(int position){
        return listaArestas.get(position).getDestino();
    }

    //  Imprimir vertice com todos os caminhos
    public void imprimirVertice() {
        System.out.println("Informação do vértice: " + getElement());
        System.out.println("Caminhos do vértice, no formato Origem-Destino-Peso: ");
        for (int i = 0; i < qtdArestas; i++) {
            System.out.print(getElement() + "-"
                    + this.listaArestas.get(i).getDestino().getElement()
                    + this.listaArestas.get(i).getPeso() + "\n");
        }
    }
}
