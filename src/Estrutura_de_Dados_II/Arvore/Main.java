package Arvore;

public class Main {
    public static void main(String[] args) {

        Arvore a = new Arvore();

        System.out.println("\n##### MÉTODO DE ADIÇÃO #####\n");
        a.add(8);   // Raiz
        a.add(3);   // Esquerda de 8
        a.add(1);   // Esquerda de 3
        a.add(6);
        a.add(10);  // Direita de 8
        a.add(9);   // Esquerda de 10
        a.add(14);  // Direita de 10

        System.out.println("\n##### MÉTODO DE BUSCA #####\n");
        a.buscar(9);
        a.buscar(20);

        System.out.println("\n##### MÉTODOS DE ORDENAÇÃO #####\n");
        a.emOrdem();
        System.out.println();
        a.ordemInversa();
        System.out.println();
        a.ordemEDR();
        System.out.println();
        a.ordemRED();
        System.out.println();
    }
}
