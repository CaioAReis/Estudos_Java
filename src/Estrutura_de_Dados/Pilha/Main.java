package Estrutura_de_Dados.Pilha;

public class Main {

    public static void main(String[] args) {

        Pilha_S pilha = new Pilha_S();

        pilha.push('A');        // Primeiro elemento a entrar, mas será o último a sair !!
        pilha.push('B');
        pilha.push('C');
        pilha.push('D');        // Último elemento a entrar, mas será o primeiro a sair !!

        pilha.printPilha();

        pilha.pop();        // O último elemento que entrou, é o primeiro a sair!!

        pilha.printPilha();

        System.out.println("PILHA Vazia? " + pilha.isEmpty());
        System.out.println("Tamanho da PILHA: " + pilha.is());
        System.out.println("Próximo elemento a sair da PILHA: " + pilha.top());
    }
}
