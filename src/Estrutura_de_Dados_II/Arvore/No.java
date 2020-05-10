package Estrutura_de_Dados_II.Arvore;

public class No {

    // Atributos

    private No esquerto;
    private No direito;
    private int valor;

    // Construtor

    public No(int valor) {
        this.esquerto = null;
        this.direito = null;
        this.valor = valor;
    }

    // Métodos Especiais

    public No getEsquerto() {
        return esquerto;
    }

    public void setEsquerto(No esquerto) {
        this.esquerto = esquerto;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
