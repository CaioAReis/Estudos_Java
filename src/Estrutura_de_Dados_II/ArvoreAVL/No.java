package Estrutura_de_Dados_II.ArvoreAVL;

public class No {
    //  Atributos
    private int valor;
    private int altura;
    private No esquerdo;
    private No direito;

    //  Construtor
    public No(int valor){
        this.valor = valor;
        this.altura = 0;
        this.esquerdo = null;
        this.direito = null;
    }

    //  Métodos
    public boolean existeEsquerdo(){
        return this.esquerdo == null;
    }

    public boolean existeDireito(){
        return this.direito == null;
    }
    //  Acessores e Modificadores
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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
