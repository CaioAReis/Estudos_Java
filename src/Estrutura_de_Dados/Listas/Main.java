package Estrutura_de_Dados.Listas;

public class Main {
    
    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------------
//        ListaEncadeada lista = new ListaEncadeada();
//        lista.adicionarFim('B');
//        lista.adicionarInicio('A');
//        lista.adicionarFim('C');
//        lista.adicionarFim('D');
//        lista.adicionarInicio('Z');
//        lista.adicionarFim('E');
//        lista.adicionarPosicao(1, 'X');
//        lista.listar();
//        lista.removerInicio();
//        lista.listar();
//        lista.removerFim();
//        lista.listar();
//        lista.removerPosicao(1);
//        lista.listar();
//        System.out.println("Quantidade de NOs da lista atual: " + lista.getQtd());
//        System.out.println("Pegando o elemento dada a posição: " + lista.get(2));
//        System.out.println("Verificar se determinado elemento está na lista: " + lista.encontrarElemento('C'));
//----------------------------------------------------------------------------------------------------------------------
//        ListaCircular listaCircular = new ListaCircular();
//        listaCircular.adicionarInicio('A');                 // OK
//        listaCircular.adicionarFim('B');                    // OK
//        listaCircular.adicionarFim('C');
//        listaCircular.adicionarFim('D');
//        listaCircular.adicionarPosicao(2,'X');                // OK
//        listaCircular.removerFim();                           // OK
//        listaCircular.removerInicio();                        // OK
//        listaCircular.removerPosicao(2);                      // OK
//        listaCircular.listar();                                 // OK
//        System.out.println("Quantidade de NOs da lista atual: " + listaCircular.getQtd());
//        System.out.println("Pegando o elemento dada a posição: " + listaCircular.get(2));
//        System.out.println("Verificar se determinado elemento está na lista: " + listaCircular.encontrarElemento('X'));
//----------------------------------------------------------------------------------------------------------------------
       ListaDuplamenteEncadeada lde = new ListaDuplamenteEncadeada();
       lde.adicionarInicio('A');
       lde.adicionarFim('B');
       lde.adicionarFim('C');
       lde.adicionarPosicao(2,'X');
       lde.removerInicio();
       lde.removerFim();
       lde.removerPosicao(1);
       lde.listar();
       System.out.println("\nQuantidade de NOs da lista atual: " + lde.getQtd());
       System.out.println("Pegando o elemento dada a posição: " + lde.get(1).getElement());
       System.out.println("Verificar se determinado elemento está na lista: " + lde.encontrarElemento('A'));
//----------------------------------------------------------------------------------------------------------------------

//         ListaDuplamenteEncadeadaCircular ldec = new ListaDuplamenteEncadeadaCircular();

//         ldec.adicionarFim('B');
//         ldec.adicionarFim('C');
//         ldec.adicionarFim('D');
//         ldec.adicionarInicio('A');
//         ldec.adicionarPosicao(1,'X');
// //        ldec.removerInicio();
// //        ldec.removerFim();
// //        ldec.removerPosicao(3);
//         ldec.listar();
//         System.out.println("\nQuantidade de NOs da lista atual: " + ldec.getQtd());
//         System.out.println("Pegando o elemento dada a posição: " + ldec.get(1).getElement());
//         System.out.println("Verificar se determinado elemento está na lista: " + ldec.encontrarElemento('A'));

    }
}
