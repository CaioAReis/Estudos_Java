package Estrutura_de_Dados_II.ArvoreBuscaBinaria;

public class No {
    //  Atributos
    private int valor;
    private No esquerdo;
    private No direito;

    //  Construtores
    public No(int valor){
        this.valor = valor;
        this.esquerdo = null;
        this.direito = null;
    }

    //  Acessores e Modificadores
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }
}