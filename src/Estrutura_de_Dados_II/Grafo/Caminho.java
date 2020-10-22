package Estrutura_de_Dados_II.Grafo;

public class Caminho {
    //  Atributos
    private No destino;
    private int peso;

    //  Construtor
    public Caminho(No destino, int peso){
        this.destino = destino;
        this.peso = peso;
    }

    //  Acessores e Modificadores

    //  Pegar destino do caminho
    public No getDestino() {
        return destino;
    }
    //  Alterar destino do caminho
    public void setDestino(No destino) {
        this.destino = destino;
    }
    //  Pegar valor do caminho
    public int getPeso() {
        return peso;
    }
    //  Alterar Peso do caminho
    public void setPeso(int peso) {
        this.peso = peso;
    }
}
