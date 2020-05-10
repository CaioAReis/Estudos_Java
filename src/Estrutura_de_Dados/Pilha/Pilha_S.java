package Estrutura_de_Dados.Pilha;

import java.util.Arrays;

public class Pilha_S implements IPilha {

    // Atributos

    private Object[] vetor;
    private int qtdPilha;


    // Construtor

    public Pilha_S() {
        this.vetor = new Object[10];
        Arrays.fill(vetor, null);       // Vai preencher todo o vetor com o valor: null
        this.qtdPilha = -1;
    }

    // Metodos

    @Override
    public void push(Object o) {

        if ( qtdPilha == vetor.length - 1 )
            throw new RuntimeException("A Pilha está cheia!");

        qtdPilha++;
        vetor[qtdPilha] = o;
    }

    @Override
    public void pop() {

        if ( isEmpty() )
            throw new RuntimeException("A Pilha já está Vazia!");

        vetor[qtdPilha] = null;
        qtdPilha--;
    }

    @Override
    public Object top() {
        return vetor[qtdPilha];
    }

    @Override
    public int is() {
        return qtdPilha + 1;
    }

    @Override
    public boolean isEmpty() {
        return (qtdPilha == -1);
    }

    @Override
    public void printPilha() {

        for (int i = qtdPilha; i >= 0; i--) {
            System.out.println(" | " + vetor[i] + " | ");
        }
        System.out.println();
    }
}
