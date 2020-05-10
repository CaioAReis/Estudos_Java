package Estrutura_de_Dados.Pilha;

public class Pilha_SE implements IPilha {

    // Atributos

    private Elements topoPilha;
    private Elements basePilha;
    private int qtdPilha;

    // Construtor

    public Pilha_SE() {
        this.topoPilha = null;
        this.qtdPilha = 0;
    }

    // Metodos

    @Override
    public void push(Object o) {

        Elements novo = new Elements(o);

        if (isEmpty()){
            this.topoPilha = novo;
            this.basePilha = novo;
            this.qtdPilha++;
        }else {
            this.topoPilha.setProximo(novo);
            this.topoPilha = novo;
            this.qtdPilha++;
        }
    }

    @Override
    public void pop() {

        if (isEmpty())
            throw new RuntimeException("A Pilha já está Vazia!");
        else {

            Elements temp = basePilha;

            while (temp.getProximo() != topoPilha)
                temp = temp.getProximo();

            topoPilha = temp;
            topoPilha.setProximo(null);
            qtdPilha--;
        }
    }

    @Override
    public Object top() {

        if ( isEmpty() )
            throw new RuntimeException("A Pilha está Vazia");
        return topoPilha.getElement();
    }

    @Override
    public int is() {
        return qtdPilha;
    }

    @Override
    public boolean isEmpty() {
        return (qtdPilha == 0);
    }

    @Override
    public void printPilha() {

        Elements temp = basePilha;

        while (temp != null){
            System.out.println( " | " + temp.getElement() + " | ");
            temp = temp.getProximo();
        }
        System.out.println();
    }
}
