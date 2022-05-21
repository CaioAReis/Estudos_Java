package AtividadeCI;

public class Vertice<T> {
    // Atributos
    private final T element;
    private final ListaArestas<T> listaArestas;
    private int estimativa;

    // Construtor
    public Vertice(T element) {
        this.element = element;
        this.listaArestas = new ListaArestas<T>();
        this.estimativa = Integer.MAX_VALUE;
    }

    // Pegar elemento
    public T getElement() {
        return element;
    }

    public ListaArestas<T> getListaArestas() {
        return listaArestas;
    }

    // Quantidade de Arestas do Vértice
    public int qtdArestas() {
        return this.listaArestas.getQtd();
    }

    // Adicionar uma nova aresta
    public boolean addAresta(Vertice<T> destino, int peso) {
        return this.listaArestas.add(destino, peso);
    }

    // Remover aresta por destino
    public boolean removerAresta(Vertice<T> destino) {
        return this.listaArestas.remove(destino);
    }

    // Buscar aresta por destino
    public Aresta<T> buscarAresta(Vertice<T> destino) {
        return this.listaArestas.buscar(destino);
    }

    // Verificar se uma aresta existe
    public boolean existeAresta(Vertice<T> destino) {
        return this.listaArestas.existeAresta(destino);
    }

    // Buscar peso de uma aresta
    public int pesoAresta(Vertice<T> destino) {
        if (existeAresta(destino)) {
            Aresta<T> aresta = buscarAresta(destino);
            return aresta.getPeso();
        }
        return -1;
    }

    // Imprimir vertice com todos os caminhos
    public void imprimir() {
        System.out.println("Caminhos do vértice " + getElement() + ", no formato Origem-Destino-Peso: ");
        Aresta<T> temp = this.listaArestas.getInicio();
        imprimir(temp);
    }

    private void imprimir(Aresta<T> temp) {
        if (temp != null) {
            System.out.println(getElement() + " ---> " + temp.getDestino().getElement() + " = " + temp.getPeso());
            imprimir(temp.getProxima());
        }
    }

    @Override
    public String toString() {
        return "" + element;
    }

    public int getEstimativa() {
        return estimativa;
    }

    public void setEstimativa(int estimativa) {
        this.estimativa = estimativa;
    }
}