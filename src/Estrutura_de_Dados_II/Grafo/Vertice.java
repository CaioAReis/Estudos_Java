package Estrutura_de_Dados_II.Grafo;

public class Vertice {
    //  Atributos
    private final Object element;
    private ListaArestas listaArestas;

    //  Construtor
    public Vertice(Object element) {
        this.element = element;
        this.listaArestas = new ListaArestas();
    }

    //  Pegar elemento
    public Object getElement() {
        return element;
    }

    //  Quantidade de Arestas do Vértice
    public int getQtdArestas(){
        return this.listaArestas.getQtd();
    }

    //  Adicionar uma nova aresta
    public boolean addAresta(Vertice destino, int peso1, int peso2, int peso3) {
        return this.listaArestas.add(destino, peso1, peso2, peso3);
    }

    //  Remover aresta por destino
    public boolean remover(Vertice destino){
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
    public void imprimirVertice() {
        System.out.println("Informação do vértice: " + getElement());
        System.out.println("Caminhos do vértice, no formato Origem-Destino-Peso: ");
        Aresta temp = this.listaArestas.getInicio();
    }
    public void imprimir(Aresta temp) {
        if (temp != null){
            System.out.println(getElement() + "-" + temp.getDestino() + temp.getPesoFinal());
            imprimir(temp.getProxima());
        }
    }
}
