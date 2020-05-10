package Estrutura_de_Dados.Pilha;

public class Pilha_DE implements IPilha {

    // Atributos

    private Elements topoPilha;       // Será o último a entrar e o primeiro a sair!
    private int qtdPilha;

    // Construtor

    public Pilha_DE() {
        this.topoPilha = null;
        this.qtdPilha = 0;
    }

    // Metodos

    @Override
    public void push(Object o) {

        Elements temp = new Elements(o);

        if (isEmpty()){
            this.topoPilha = temp;
            this.topoPilha.setAnterior(null);
            this.topoPilha.setProximo(null);
            qtdPilha++;
        }else {
            temp.setAnterior(topoPilha);
            this.topoPilha.setProximo(temp);
            this.topoPilha = temp;
            qtdPilha++;
        }
    }

    @Override
    public void pop() {

        if ( isEmpty() )
            throw new RuntimeException("A Pilha já está Vazia!");

        this.topoPilha = topoPilha.getAnterior();
        this.topoPilha.setProximo(null);
        qtdPilha--;
    }

    @Override
    public Object top() {

        if ( isEmpty() )
            throw new RuntimeException("A Pilha está Vazia!");
        return topoPilha.getElement();
    }

    @Override
    public int is() {
        return this.qtdPilha;
    }

    @Override
    public boolean isEmpty() {
        return (qtdPilha == 0);
    }

    @Override
    public void printPilha(){

        Elements temp = topoPilha;

        while (temp != null){
            System.out.println( " | " + temp.getElement() + " | ");
            temp = temp.getAnterior();
        }
        System.out.println();
    }
}