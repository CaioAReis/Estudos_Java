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
        if (!existeAresta(destino)){
            Aresta nova = new Aresta(destino, peso1, peso2, peso3);
            if (qtdLista == 0){
                this.inicio = nova;
                this.fim = nova;
                this.qtdLista++;
                return true;
            }else{
                this.fim.setProxima(nova);
                nova.setAnterior(fim);
                this.fim = nova;
                this.qtdLista++;
                return true;
            }
        }
        System.out.println("Já existe uma aresta com este mesmo destino");
        return false;
    }

    //  Remover
    public boolean remove(Vertice destino) {
       if (estaVazia()){
           Aresta removida = buscar(destino);
           if (removida != null) {
               Aresta tempProxima = removida.getProxima();
               Aresta tempAnterior = removida.getAnterior();
               tempAnterior.setProxima(tempProxima);
               tempProxima.setAnterior(tempAnterior);
               return true;
           }
       }
       System.out.println("A lista de aresta está vazia");
       return false;
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
            buscar(temp.getProxima(), destino);
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
        return (this.inicio != null && this.fim != null);
    }
}