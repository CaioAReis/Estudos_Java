package Estrutura_de_Dados_II.Grafo;

public class Aresta {
    //  Atributos
    private Vertice destino;
    private int peso;

    //  Construtor
    public Aresta(Vertice destino, int peso){
        this.destino = destino;
        this.peso = peso;
    }

    //  Acessores e Modificadores

    //  Pegar destino da Aresta
    public Vertice getDestino() {
        return destino;
    }
    //  Alterar destino da Aresta
    public void setDestino(Vertice destino) {
        this.destino = destino;
    }
    //  Pegar valor da Aresta
    public int getPeso() {
        return peso;
    }
    //  Alterar Peso da Aresta
    public void setPeso(int peso) {
        this.peso = peso;
    }
}
