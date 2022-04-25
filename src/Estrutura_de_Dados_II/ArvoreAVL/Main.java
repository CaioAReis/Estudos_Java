package ArvoreAVL;

public class Main {
    public static void main(String[] args) {

    ArvoreAVL a = new ArvoreAVL();

    //  Montando a árvore
        a.add(50);
        a.add(30);
        a.add(70);
        a.add(10);
        a.add(40);
//        a.add(20);
//        a.add(30);
//        a.add(12);
//        a.add(9);
//        a.add(1);
//        a.add(3);

    System.out.println("\nANTES:");
        a.printTree();
    System.out.println("\nDEPOIS:");
    //  Removendo folha
        a.add(35);
//        a.remove(3);
        a.printTree();
//        System.out.println();
    //  Removendo No com apenas um filho
//        a.remove(2);
//        a.remove(10);
//        a.printTree();
//        System.out.println();
    //  Removendo No com dois filhos diferente da raiz
//        a.remove(23);
//        a.printTree();
//        System.out.println();
    //  Removendo raiz
//        a.remove(15);
//        a.printTree();
    }
}
