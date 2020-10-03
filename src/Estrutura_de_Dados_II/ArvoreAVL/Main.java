package Estrutura_de_Dados_II.ArvoreAVL;

public class Main {
    public static void main(String[] args) {

    ArvoreAVL a = new ArvoreAVL();

    a.inserir(15);
    a.inserir(8);
    a.inserir(23);
    a.inserir(2);
    a.inserir(10);
    a.inserir(20);
    a.inserir(30);

    System.out.println("\nANTES:");
    a.printTree();
    System.out.println("\nDEPOIS:");
    a.remover(8);
    a.printTree();

    }
}
