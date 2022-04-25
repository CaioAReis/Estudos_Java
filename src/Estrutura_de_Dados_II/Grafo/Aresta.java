package Grafo;

import java.util.Objects;

public class Aresta {
//  Atributos
    private Vertice destino;            // O Destino será o elemento principal da classe: KEY
    private Double pesoFinal;
    private Aresta proxima, anterior;
    //private int peso1, peso2, peso3;

//  Construtor
    public Aresta(Vertice destino, int peso1, int peso2, int peso3){
        this.destino = destino;
        this.pesoFinal = (double) (peso1 + peso2 + peso3) / 3;
        this.proxima = null; this.anterior = null;
        //this.peso1 = peso1; this.peso2 = peso2; this.peso3 = peso3;
    }

    //  Pegar Destino
    public Vertice getDestino() {
        return destino;
    }

    //  Alterar destino
    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    //  Pegar Peso final
    public Double getPesoFinal() {
        // Aqui ficaria a fórmula para calcular o peso final com peso1, peso2 e peso3
        return pesoFinal;
    }

    //  Alterar Peso final
    public void setPesoFinal(Double pesoFinal) {
        this.pesoFinal = pesoFinal;
    }

    //  Pegar proxima aresta
    public Aresta getProxima() {
        return proxima;
    }

    //  Alterar a proxima aresta
    public void setProxima(Aresta proxima) {
        this.proxima = proxima;
    }

    //  Pegar aresta anterior
    public Aresta getAnterior() {
        return anterior;
    }

    //  Alterar a aresta anterior
    public void setAnterior(Aresta anterior) {
        this.anterior = anterior;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aresta aresta = (Aresta) o;
        return destino.equals(aresta.destino);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destino);
    }
}
