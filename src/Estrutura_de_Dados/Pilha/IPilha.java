package Estrutura_de_Dados.Pilha;

public interface IPilha {

    void push(Object o);                    //  Adiciona um novo elemento no Topo da Pilha
    void pop();                             //  Remove o Elemento do Topo
    Object top();                           //  Retorna o Elemento do Topo
    int is();                               //  Retorna o tamanho da pilha
    boolean isEmpty();                      //  Informa se a pilha está vazia
    void printPilha();                      //  Imprime a Pilha


    }
