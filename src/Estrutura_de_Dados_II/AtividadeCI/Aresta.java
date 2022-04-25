package AtividadeCI;

public class Aresta<T> {
    // Atributos
    private Vertice<T> destino;
    private int peso;
    private Aresta<T> proxima, anterior;

    // Construtor
    public Aresta(Vertice<T> destino, int peso) {
        this.destino = destino;
        this.peso = peso;
        this.proxima = null;
        this.anterior = null;
    }

    // Pegar Destino
    public Vertice<T> getDestino() {
        return destino;
    }

    // Alterar destino
    public void setDestino(Vertice<T> destino) {
        this.destino = destino;
    }

    // Pegar Peso final
    public int getPeso() {
        return peso;
    }

    // Alterar Peso final
    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    // Pegar proxima aresta
    public Aresta<T> getProxima() {
        return proxima;
    }

    // Alterar a proxima aresta
    public void setProxima(Aresta<T> proxima) {
        this.proxima = proxima;
    }

    // Pegar aresta anterior
    public Aresta<T> getAnterior() {
        return anterior;
    }

    // Alterar a aresta anterior
    public void setAnterior(Aresta<T> anterior) {
        this.anterior = anterior;
    }

    // @Override
    // public boolean equals(Object o) {
    //     if (this == o)
    //         return true;
    //     if (o == null || getClass() != o.getClass())
    //         return false;
    //     Aresta<T> aresta = (Aresta<T>) o;
    //     return destino.equals(aresta.destino);
    // }
}
