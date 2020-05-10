package Estrutura_de_Dados.Listas;

public class ListaDuplamenteEncadeada  implements ILista{

    // Atributos

    private No inicio;
    private No fim;
    private int qtdLista;

    // Construtor

    public ListaDuplamenteEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.qtdLista = 0;
    }

    // Métodos

    @Override
    public void adicionarFim(Object o) {

        if (qtdLista == 0){
            adicionarInicio(o);
        }else{
            No novo = new No(o);
            fim.setProximo(novo);
            novo.setAnterior(fim);
            fim = novo;
            qtdLista++;
        }
    }

    @Override
    public void adicionarPosicao(int position, Object o) {

        if (position == 0)
            adicionarInicio(o);
        else if (position > qtdLista || position < 0)
            throw new IllegalArgumentException("Posição Inválida!!");
        else {
            No novo = new No(o);
            No temp = get(position);
            No tempAnterior = temp.getAnterior();

            tempAnterior.setProximo(novo);
            novo.setAnterior(tempAnterior);
            novo.setProximo(temp);
            temp.setAnterior(novo);

            qtdLista++;
        }
    }

    @Override
    public void adicionarInicio(Object o) {

        No novo = new No(o);

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
            No temp = fim.getAnterior();
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
            No temp = get(position);
            No tempAnterior = temp.getAnterior();
            No tempProximo = temp.getProximo();

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
    public No get(int position) {

        if (position < 0 || position >= qtdLista)
            throw new IllegalArgumentException("Posição Inválida!!");

        No temp = inicio;
        for (int i = 0; i < position; i++)
            temp = temp.getProximo();

        return temp;
    }

    @Override
    public int getQtd() {
        return qtdLista;
    }

    @Override
    public boolean encontrarElemento(Object o) {
        No temp = inicio;

        while (temp != null ){

            if (temp.getElement().equals(o))
                return true;
            temp = temp.getProximo();
        }
        return false;
    }

    @Override
    public void listar() {

        No temp = inicio;

        while ( temp != null){
            System.out.print(temp.getElement() + " | ");
            temp = temp.getProximo();
        }
    }
}