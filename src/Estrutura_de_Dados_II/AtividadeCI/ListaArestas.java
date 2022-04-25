package AtividadeCI;

public class ListaArestas<T> {
    // Atributos
    private Aresta<T> inicio;
    private Aresta<T> fim;
    private int qtdLista;

    // Construtor
    public ListaArestas() {
        this.inicio = null;
        this.fim = null;
        this.qtdLista = 0;
    }

    // Métodos
    // Adicionar
    public boolean add(Vertice<T> destino, int peso) {
        Aresta<T> nova = new Aresta<T>(destino, peso);
        if (qtdLista != 0) {
            if (!existeAresta(destino)) {
                this.fim.setProxima(nova);
                nova.setAnterior(fim);
                this.fim = nova;
                this.qtdLista++;
                return true;
            }
            return false;
        }
        this.inicio = nova;
        this.fim = nova;
        this.qtdLista++;
        return true;
    }

    // Remover
    public boolean remove(Vertice<T> destino) {
        if (estaVazia()) {
            Aresta<T> removida = buscar(destino);
            if (removida != null) {
                if (removida.equals(inicio))
                    return removerI();
                if (removida.equals(fim))
                    return removerF();
                Aresta<T> tempProxima = removida.getProxima();
                Aresta<T> tempAnterior = removida.getAnterior();
                tempAnterior.setProxima(tempProxima);
                tempProxima.setAnterior(tempAnterior);
                this.qtdLista--;
                return true;
            }
            return false;
        }
        return false;
    }

    // Remover do início
    private boolean removerI() {
        this.inicio = inicio.getProxima();
        this.inicio.setAnterior(null);
        this.qtdLista--;
        return true;
    }

    // Remover do fim
    private boolean removerF() {
        this.fim = fim.getAnterior();
        this.fim.setProxima(null);
        this.qtdLista--;
        return true;
    }

    // Pegar Inicio
    public Aresta<T> getInicio() {
        return this.inicio;
    }

    // Buscar Aresta
    public Aresta<T> buscar(Vertice<T> destino) {
        if (estaVazia()) {
            Aresta<T> temp = inicio;
            return buscar(temp, destino);
        }
        System.out.println("Lista de arestas está vazia");
        return null;
    }

    private Aresta<T> buscar(Aresta<T> temp, Vertice<T> destino) {
        if (temp != null) {
            if (temp.getDestino() == destino)
                return temp;
            return buscar(temp.getProxima(), destino);
        }
        return null;
    }

    // Pegar quantidade da lista
    public int getQtd() {
        return qtdLista;
    }

    // Existe aresta? S == true | N == false
    public boolean existeAresta(Vertice<T> destino) {
        return buscar(destino) != null;
    }

    // Lista está vaiza? S == true | N == false
    public boolean estaVazia() {
        return (this.inicio != null || this.fim != null);
    }
}