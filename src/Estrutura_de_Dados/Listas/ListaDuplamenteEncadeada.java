package Estrutura_de_Dados.Listas;

public class ListaDuplamenteEncadeada<T> implements ILista<T>{

    // Atributos
    private No<T> inicio;
    private No<T> fim;
    private int qtdLista;

    // Construtor
    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.qtdLista = 0;
    }

    // Métodos
    @Override
    public void adicionarFim(T o) {

        if (qtdLista == 0){
            adicionarInicio(o);
        }else{
            No<T> novo = new No<>(o);
            fim.setProximo(novo);
            novo.setAnterior(fim);
            fim = novo;
            qtdLista++;
        }
    }

    @Override
    public void adicionarPosicao(int position, T o) {

        if (position == 0)
            adicionarInicio(o);
        else if (position > qtdLista || position < 0)
            throw new IllegalArgumentException("Posição Inválida!!");
        else {
            No<T> novo = new No<>(o);
            No<T> temp = get(position);
            No<T> tempAnterior = temp.getAnterior();

            tempAnterior.setProximo(novo);
            novo.setAnterior(tempAnterior);
            novo.setProximo(temp);
            temp.setAnterior(novo);

            qtdLista++;
        }
    }

    @Override
    public void adicionarInicio(T o) {

        No<T> novo = new No<>(o);

        if (qtdLista == 0){
            inicio = novo;
            fim = novo;
            qtdLista++;
        }else{
            inicio.setAnterior(novo);
            novo.setProximo(inicio);
            inicio = novo;
            qtdLista++;
        }
    }

    @Override
    public void removerFim() {

        if (qtdLista == 1)
            removerInicio();
        else{
            No<T> temp = fim.getAnterior();
            temp.setProximo(null);
            fim = temp;
            qtdLista--;
        }
    }

    @Override
    public void removerPosicao(int position) {

        if (position < 0 || position >= qtdLista )
            throw new IllegalArgumentException("Posição Inválida!");

        if (position == 0)
            removerInicio();
        else if (position == qtdLista - 1)
            removerFim();
        else{
            No<T> temp = get(position);
            No<T> tempAnterior = temp.getAnterior();
            No<T> tempProximo = temp.getProximo();

            tempAnterior.setProximo(tempProximo);
            tempProximo.setAnterior(tempAnterior);

            qtdLista--;
        }
    }

    @Override
    public void removerInicio() {

        if (inicio == null && fim == null)
            throw new IllegalArgumentException("A lista já está VAZIA!!");

        inicio = inicio.getProximo();
        inicio.setAnterior(null);
        qtdLista--;
    }

    @Override
    public No<T> get(int position) {

        if (position < 0 || position >= qtdLista)
            throw new IllegalArgumentException("Posição Inválida!!");

        No<T> temp = inicio;
        for (int i = 0; i < position; i++)
            temp = temp.getProximo();

        return temp;
    }

    @Override
    public int getQtd() {
        return qtdLista;
    }

    @Override
    public boolean encontrarElemento(T o) {
        No<T> temp = inicio;

        while (temp != null ){

            if (temp.getElement().equals(o))
                return true;
            temp = temp.getProximo();
        }
        return false;
    }

    @Override
    public void listar() {

        No<T> temp = inicio;
        // System.out.print(fim.getElement()+ "FFFFFFFFF\n");
        while ( temp != null){
            System.out.print(temp.getElement() + " | ");
            temp = temp.getProximo();
        }
        System.out.println();
    }

    // public Boolean estaOrdenada() {
    //     return verificarOrdem(inicio);
    // }

    //  A IDE entende este médodo como errado pois a lista possui o tipo T,
    // e ele só funciona pra listas do tipo INT
    // private Boolean verificarOrdem(No<T> temp) {
    //     if (temp != fim) {
    //         if (temp.getElement() >= temp.getProximo().getElement())
    //             return verificarOrdem(temp.getProximo());
    //         else return false;
    //     }
    //     return true;
    // }
}