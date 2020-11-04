package Estrutura_de_Dados_II.Grafo;

public class ListaArestas {
    // Atributos
    private Aresta inicio;
    private Aresta fim;
    private int qtdLista;

    // Construtor
    public ListaArestas() {
        this.inicio = null;
        this.fim = null;
        this.qtdLista = 0;
    }

    //  Adicionar
    public boolean add(Vertice destino, int peso1, int peso2, int peso3) {
        Aresta nova = new Aresta(destino, peso1, peso2, peso3);
        if (qtdLista != 0) {
            if (!existeAresta(destino)) {
                this.fim.setProxima(nova);
                nova.setAnterior(fim);
                this.fim = nova;
                this.qtdLista++;
                return true;
            }
            System.out.println("Já existe uma aresta com este mesmo destino");
            return false;
        }
        this.inicio = nova;
        this.fim = nova;
        this.qtdLista++;
        return true;
    }

    //  Remover
    public boolean remove(Vertice destino) {
       if (estaVazia()){
           Aresta removida = buscar(destino);
           if (removida != null) {
               if (removida.equals(inicio)) return removerI();
               if (removida.equals(fim)) return removerF();
               Aresta tempProxima = removida.getProxima();
               Aresta tempAnterior = removida.getAnterior();
               tempAnterior.setProxima(tempProxima);
               tempProxima.setAnterior(tempAnterior);
               this.qtdLista--;
               return true;
           }
           System.out.println("Destino não encontrado na lista de arestas do vértice.");
           return false;
       }
       System.out.println("A lista de aresta está vazia");
       return false;
    }
    private boolean removerI() {
        this.inicio = inicio.getProxima();
        this.inicio.setAnterior(null);
        this.qtdLista--;
        return true;
    }
    private boolean removerF() {
        this.fim = fim.getAnterior();
        this.fim.setProxima(null);
        this.qtdLista--;
        return true;
    }

    public Aresta getInicio() {
        return this.inicio;
    }

    //  Buscar Aresta
    public Aresta buscar(Vertice destino){
       if (estaVazia()){
           Aresta temp = inicio;
           return buscar(temp, destino);
       }
       System.out.println("Lista de arestas está vazia");
       return null;
    }
    private Aresta buscar(Aresta temp, Vertice destino) {
        if (temp != null) {
            if (temp.getDestino() == destino) return temp;
            return buscar(temp.getProxima(), destino);
        }
        return null;
    }

    //  Pegar quantidade da lista
    public int getQtd() {
        return qtdLista;
    }

    //  Existe aresta? S == true | N == false
    public boolean existeAresta(Vertice destino) {
        return buscar(destino) != null;
    }

    //  Lista está vaiza? S == true | N == false
    public boolean estaVazia() {
        return (this.inicio != null || this.fim != null);
    }
}