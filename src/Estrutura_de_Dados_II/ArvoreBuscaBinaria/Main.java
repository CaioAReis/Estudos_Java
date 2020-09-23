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
            arvore.inserir(124);
        //  Busca
//        System.out.print(arvore.buscar(12).getValor());
//            arvore.buscar(132);

        System.out.println(arvore.buscarPai(20).getValor());


    }
}
