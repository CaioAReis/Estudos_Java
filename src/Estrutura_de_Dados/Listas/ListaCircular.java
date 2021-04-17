package Estrutura_de_Dados.Listas;

public class ListaCircular<T> implements ILista<T>{

    // Atributos

    private No<T> inicio;
    private No<T> fim;
    private int qtdLista;

    // Construtor

    public ListaCircular() {
        this.inicio = null;
        this.fim = null;
        this.qtdLista = 0;
    }

    // Metodos

    @Override
    public void adicionarFim(T o) {

        No<T> novo = new No<>(o);

        if (qtdLista == 0){
            adicionarInicio(o);
            novo.setProximo(novo);
        }else{
            fim.setProximo(novo);
            fim = novo;
            fim.setProximo(inicio);
        }
        qtdLista++;
    }

    @Override
    public void adicionarPosicao(int position, T o) {

        if (position < 0 || position > qtdLista)
            throw new IllegalArgumentException("Posição Informada inválida!");
        else {
            No<T> novo = new No<>(o);
            No<T> temp = get(position-1);

            novo.setProximo(temp.getProximo());
            temp.setProximo(novo);
            qtdLista++;
        }
    }

    @Override
    public void adicionarInicio(T o) {

        No<T> novo = new No<>(o);

        if (qtdLista == 0){
            inicio = novo;
            fim = novo;
            fim.setProximo(novo);
        }else{
            novo.setProximo(inicio);
            inicio = novo;
        }
        qtdLista++;
    }

    @Override
    public void removerFim() {

        if (qtdLista == 0 && inicio == fim)
            removerInicio();

        No<T> temp = get(qtdLista-2);

        temp.setProximo(inicio);
        fim = temp;
        qtdLista--;
    }

    @Override
    public void removerPosicao(int position) {

        if (position < 0 || position >= qtdLista)
            throw new IllegalArgumentException("Posição Informada inválida!");

        No<T> temp = get(position - 1);
        No<T> auxiliar = temp.getProximo();
        temp.setProximo(auxiliar.getProximo());
        qtdLista--;
    }

    @Override
    public void removerInicio() {

        if (inicio == null)
            throw new IllegalArgumentException("A lista já está vazia!");

        inicio = inicio.getProximo();
        fim.setProximo(inicio);
        qtdLista--;

        if (qtdLista == 0)
            fim = null;
    }

    @Override
    public No<T> get(int position) {

        if (position >= qtdLista)
            throw new IllegalArgumentException("Posição Inválida!");

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

        while (temp.getProximo() != inicio ){

            if (temp.getElement() == o)
                return true;
            temp = temp.getProximo();
        }
        return false;
    }

    @Override
    public void listar() {

        No<T> temp = inicio;

        while (temp.getProximo() != inicio){
            System.out.println(temp.getElement()+ " Proximo: " + temp.getProximo().getElement() + " | ");
            temp = temp.getProximo();
        }
        System.out.println(temp.getElement()+ " Proximo: " + temp.getProximo().getElement() + " | ");
    }
}
