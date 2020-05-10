package Estrutura_de_Dados.Fila;

public class Fila_DE implements IFila {

    // Atributos

    private Element inicio;
    private Element fim;
    private int qtdFila;

    // Construtor

    public Fila_DE() {
        this.inicio = null;
        this.fim = null;
        this.qtdFila = 0;
    }

    // Metodos

    @Override
    public void push(Object o) {

        Element novo = new Element(o);

        if ( isEmpty() ){

            novo.setProximo(novo);
            novo.setAnterior(novo);

            inicio = novo;
            fim = novo;

            qtdFila++;
        }else {

            fim.setProximo(novo);
            novo.setAnterior(fim);
            fim = novo;
            qtdFila++;
        }
    }

    @Override
    public void pop() {

        if ( isEmpty() )
            throw new RuntimeException("A Fila já está Vazia!");

        inicio = inicio.getProximo();
        inicio.setAnterior(null);
        qtdFila--;
    }

    @Override
    public Object top() {
        return inicio.getElement();
    }

    @Override
    public int is() {
        return qtdFila;
    }

    @Override
    public boolean isEmpty() {
        return (qtdFila == 0);
    }

    @Override
    public void printFila() {

        Element temp = inicio;

        System.out.print("Caixa <-- | ");

        while (temp != null){
            System.out.print(temp.getElement() + " | ");
            temp = temp.getProximo();
        }
        System.out.println();
    }
}