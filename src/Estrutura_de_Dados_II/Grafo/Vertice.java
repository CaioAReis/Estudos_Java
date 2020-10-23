package Estrutura_de_Dados_II.Grafo;

import java.util.ArrayList;

public class Vertice {
    //  Atributos
    private Object element;
    private ArrayList <Aresta> listaArestas;
    private int qtdArestas;

    //  Construtor
    public Vertice(Object element) {
        this.element = element;
        this.listaArestas = new ArrayList <Aresta> ();
        this.qtdArestas = 0;
    }

    //  Métodos

    //  Quantidade de Arestas do Vértice
    public int getQtdArestas(){
        return this.qtdArestas;
    }

    //  Pegar elemento
    public Object getElement() {
        return element;
    }

    //  Adicionar uma aresta
    public void addAresta(Vertice destino, int peso){
        for (int i = 0; i < qtdArestas; i++){
            if (this.listaArestas.get(i).getDestino() == destino){
                System.out.println("Uma aresta com o mesmo DESTINO já existe!");
                return;
            }
        }
        Aresta nova = new Aresta(destino, peso);
        this.listaArestas.add(nova);
    }

    //  Remover uma aresta
    public void removerAresta(Aresta aresta){
        this.listaArestas.remove(aresta);
    }

    //  Remover aresta por indice
    public void removerArestaIndice(int position){
        this.listaArestas.remove(position);
    }

    // Verificar se uma aresta existe
    public boolean existeAresta(Aresta aresta) {
        return this.listaArestas.contains(aresta);
    }

    //  Buscar uma aresta
    public Aresta buscarAresta(int position){
        return this.listaArestas.get(position);
    }

    //  Pegar o destino de uma Aresta por indice
    public Vertice getDestinoAresta(int position){
        return listaArestas.get(position).getDestino();
    }

    //  Pegar peso de uma aresta por indice
    public int getPesoDaAresta(int position){
        return listaArestas.get(position).getPeso();
    }

    //  Acessores e Modificadores


}
