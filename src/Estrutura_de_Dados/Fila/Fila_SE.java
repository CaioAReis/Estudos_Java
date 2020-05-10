package Estrutura_de_Dados.Fila;

public class Fila_SE implements IFila {

    // Atributos

    private Element inicio;
    private Element fim;
    private int qtdFila;

    // Construtor

    public Fila_SE() {
        this.inicio = null;
        this.fim = null;
        this.qtdFila = 0;
    }

    // Metodos

    @Override
    public void push(Object o) {

        Element novo = new Element(o);

        if ( isEmpty() ){
            this.inicio = novo;
            this.fim = novo;
            this.qtdFila++;
        }else {
            this.fim.setProximo(novo);
            this.fim = novo;
            qtdFila++;
        }
    }

    @Override
    public void pop() {

        if ( isEmpty() )
            throw new RuntimeException("A Fila já está Vazia!");

        this.inicio = inicio.getProximo();
        this.qtdFila--;
    }

    @Override
    public Object top() {

        if ( isEmpty() )
            throw new RuntimeException("A Fila está Vazia!");

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

        while (temp != null){
            System.out.print(temp.getElement() + " | ");
            temp = temp.getProximo();
        }
        System.out.println();
    }
}
