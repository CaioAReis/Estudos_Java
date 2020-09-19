package Estrutura_de_Dados_II.ArvoreBuscaBinaria;

public class Main {
    public static void main(String[] args) {
        Tree arvore = new Tree();
        //  Inserção
            arvore.inserir(15);
            arvore.inserir(8);
            arvore.inserir(2);
            arvore.inserir(12);
            arvore.inserir(23);
            arvore.inserir(20);
            arvore.inserir(30);
        //  Busca
            arvore.buscar(12);
            arvore.buscar(132);

        System.out.println(arvore.quantidadeNos()+"\n\n");
//        arvore.exibirArvore();

        arvore.printOrdemRED();


    }
}
