package AtividadeCI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Grafo<T> {
    // Atributos
    private final Map<T, Vertice<T>> conjuntoVertices;
    private int qtdVertices, qtdArestas;
    private ArrayList<T> vizitados;

    // Construtor
    public Grafo() {
        this.conjuntoVertices = new HashMap<>();
        this.qtdVertices = 0;
        this.qtdArestas = 0;
        this.vizitados = new ArrayList<>();
    }

    // Buscar o melhor caminho Dijkstra
    public void buscarMelhorCaminho(T origem, T destino) {
        if (existeVertice(origem) && existeVertice(destino)) {
            Vertice<T> o = getVetice(origem);
            Vertice<T> d = getVetice(destino);

            o.setEstimativa(0);
            percorrerVertices(o);

            if (d.getEstimativa() == Integer.MAX_VALUE)
                System.out.println("Não é possível chegar no vertice de destino!\n");
            else {
                System.out.println("O melhor caminho entre " + o.getElement() + " e " + d.getElement() + " será: "
                        + d.getEstimativa() + "\n");
            }
        } else
            System.out.println("Vertice não encontrado!");
    }

    private void percorrerVertices(Vertice<T> origem) {
        if (vizitados.size() < conjuntoVertices.size()) {
            vizitados.add(origem.getElement());

            Aresta<T> tempAresta = origem.getListaArestas().getInicio();
            Vertice<T> tempVertice;
            int somaEstimativa;

            do {
                tempVertice = tempAresta.getDestino();
                somaEstimativa = origem.getEstimativa() + tempAresta.getPeso();
                if (somaEstimativa < tempVertice.getEstimativa())
                    tempVertice.setEstimativa(somaEstimativa);
                tempAresta = tempAresta.getProxima();
            } while (tempAresta != null);

            // Buscar o vertice com a menor estimativa e que ainda não foi vizitado
            Vertice<T> temp = buscarVerticeComMenorEstimativaAberta();
            percorrerVertices(temp);
        }
    }

    private Vertice<T> buscarVerticeComMenorEstimativaAberta() {
        int menorValor = Integer.MAX_VALUE;
        Vertice<T> menor = null, temp;

        for (T key : conjuntoVertices.keySet()) {
            temp = conjuntoVertices.get(key);
            if (temp.getEstimativa() < menorValor && !vizitados.contains(temp.getElement())) {
                menor = temp;
                menorValor = temp.getEstimativa();
            }
        }
        return menor;
    }

    public void imprimirCaminhosGrafo() {
        Vertice<T> temp;
        for (T key : conjuntoVertices.keySet()) {
            temp = conjuntoVertices.get(key);
            System.out.println(temp.getElement() + ": " + temp.getEstimativa());
        }
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

    public ArrayList<T> getVizitados() {
        return vizitados;
    }

    public void setVizitados(ArrayList<T> vizitados) {
        this.vizitados = vizitados;
    }
}
