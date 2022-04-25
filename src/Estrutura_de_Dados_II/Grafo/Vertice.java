package Grafo;

import java.util.ArrayList;
import java.util.Objects;

public class Vertice {
//  Atributos
    private final Object element;
    private ArrayList<Vertice> visitados = new ArrayList<>();
    private final ListaArestas listaArestas;

//  Construtor
    public Vertice(Object element) {
        this.element = element;
        this.listaArestas = new ListaArestas();
    }

//  Métodos
    //  Pegar elemento
    public Object getElement() {
        return element;
    }

    public ListaArestas getListaArestas() {
        return listaArestas;
    }

    public ArrayList<Vertice> getVisitados() {
        return visitados;
    }

    //  Quantidade de Arestas do Vértice
    public int qtdArestas(){
        return this.listaArestas.getQtd();
    }

    //  Adicionar uma nova aresta
    public boolean addAresta(Vertice destino, int peso1, int peso2, int peso3) {
        return this.listaArestas.add(destino, peso1, peso2, peso3);
    }

    //  Remover aresta por destino
    public boolean removerAresta(Vertice destino){
        return this.listaArestas.remove(destino);
    }

    //  Buscar aresta por destino
    public Aresta buscarAresta(Vertice destino) {
        return this.listaArestas.buscar(destino);
    }

    // Verificar se uma aresta existe
    public boolean existeAresta(Vertice destino) {
        return this.listaArestas.existeAresta(destino);
    }

    //  Buscar peso de uma aresta
    public double pesoAresta(Vertice destino) {
        if (existeAresta(destino)) {
            Aresta aresta = buscarAresta(destino);
            return aresta.getPesoFinal();
        }
        return -1;
    }

    //  Imprimir vertice com todos os caminhos
    public void imprimir() {
        System.out.println("Caminhos do vértice " + getElement() + ", no formato Origem-Destino-Peso: ");
        Aresta temp = this.listaArestas.getInicio();
        imprimir(temp);
    }
    private void imprimir(Aresta temp) {
        if (temp != null){
            System.out.println(getElement() + " -> " + temp.getDestino().getElement() + " = " + temp.getPesoFinal());
            imprimir(temp.getProxima());
        }
    }

    public void addVizitado(Vertice v) {
        this.visitados.add(v);
    }

    public boolean foiVizitado(Vertice v) {
        return this.visitados.contains(v);
    }

    @Override
    public String toString() {
        return "" + element;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertice vertice = (Vertice) o;
        return element.equals(vertice.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element);
    }
}
