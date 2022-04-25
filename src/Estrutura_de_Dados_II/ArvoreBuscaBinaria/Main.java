package ArvoreBuscaBinaria;

public class Main {
    public static void main(String[] args) {
        Arvore arvore = new Arvore();
        //  Inserção
            arvore.inserir(18);
            arvore.inserir(8);
            arvore.inserir(2);
            arvore.inserir(14);
            arvore.inserir(10);
            arvore.inserir(16);
            arvore.inserir(9);
            arvore.inserir(12);
            arvore.inserir(11);
//            arvore.inserir(200);
//            arvore.inserir(40);
//            arvore.inserir(80);
        //  Busca
//        System.out.print(arvore.buscar(12).getValor());
//            arvore.buscar(132);

        System.out.println("\n\nAntes: ");
        arvore.exibirArvore();
        arvore.remover(8);
        System.out.println("\nDepois: ");
        arvore.exibirArvore();

//        System.out.println("\n\nAltura " + arvore.altura());
    }
}
