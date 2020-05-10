package Estrutura_de_Dados.Fila;

public class Main {
    public static void main(String[] args) {

        Fila_DE fila = new Fila_DE();

        fila.push('A');
        fila.push('B');
        fila.push('C');

        fila.printFila();

        fila.pop();

        fila.printFila();

        System.out.println("Proximo Elemento a sair da Fila: " + fila.top());
        System.out.println("Tamanho atual da Fila: " + fila.is());
        System.out.println("A fila está Vazia?: " + fila.isEmpty());
    }
}
