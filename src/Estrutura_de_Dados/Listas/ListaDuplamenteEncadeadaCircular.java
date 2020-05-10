package Estrutura_de_Dados.Listas;

public class ListaDuplamenteEncadeadaCircular implements ILista {

    // Atributos

    private No inicio;
    private No fim;
    private int qtdLista;

    // Construtor

    public ListaDuplamenteEncadeadaCircular() {
        this.inicio = null;
        this.fim = null;
        this.qtdLista = 0;
    }

    // Metodos

    @Override
    public void adicionarFim(Object o) {

        No novo = new No(o);

        if (qtdLista == 0)
            adicionarInicio(o);
        else {
            novo.setAnterior(fim);
            novo.setProximo(inicio);
            fim.setProximo(novo);
            inicio.setAnterior(novo);
            fim = novo;
            qtdLista++;
        }
    }

    @Override
    public void adicionarPosicao(int position, Object o) {

        if (position == 0)
            adicionarInicio(o);
        else if (position == qtdLista - 1)
            adicionarFim(o);
        else {
            No novo = new No(o);
            No temp = get(position);
            No tempAnterior = temp.getAnterior();
            tempAnterior.setProximo(novo);
            temp.setAnterior(novo);
            novo.setProximo(temp);
            novo.setAnterior(tempAnterior);
            qtdLista++;
        }
    }

    @Override
    public void adicionarInicio(Object o) {

        No novo = new No(o);

        if (qtdLista == 0){
            inicio = novo;
            fim = novo;
            inicio.setAnterior(novo);
            fim.setProximo(novo);
            qtdLista++;
        }else {
            novo.setAnterior(fim);
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            fim.setProximo(novo);
            inicio = novo;
            qtdLista++;

        }
    }

    @Override
    public void removerFim() {

        if (inicio == null && fim == null)
            throw new IllegalArgumentException("A Lista já está VAZIA!");
        else if(qtdLista == 1){
            inicio = null;
            fim = null;
            qtdLista--;
        }else {
            fim = fim.getAnterior();
            fim.setProximo(inicio);
            inicio.setAnterior(fim);
            qtdLista--;
        }
    }

    @Override
    public void removerPosicao(int position) {

        if (position == 0)
            removerInicio();
        else if (position == qtdLista - 1)
            removerFim();
        else {
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
            throw new IllegalArgumentException("A Lista já está VAZIA!");
        else if(qtdLista == 1){
            inicio = null;
            fim = null;
            qtdLista--;
        }else {
            No temp = inicio;
            inicio = inicio.getProximo();
            inicio.setAnterior(temp.getAnterior());
            fim.setProximo(inicio);
            qtdLista--;
        }
    }

    @Override
    public No get(int position) {

        if (position > qtdLista || position < 0)
            throw new IllegalArgumentException("Posição Inválida!");
        else {

            No temp = inicio;

            for (int i = 0; i < position; i++)
                temp = temp.getProximo();

            return temp;
        }
    }

    @Override
    public int getQtd() {
        return qtdLista;
    }

    @Override
    public boolean encontrarElemento(Object o) {

        No temp = inicio;

        while (temp.getProximo() != inicio ){

            if (temp.getElement().equals(o))
                return true;
            temp = temp.getProximo();
        }
        return false;
    }

    @Override
    public void listar() {

        No temp = inicio;

        while (temp.getProximo() != inicio){
            System.out.println(temp.getElement() + " :" +
                    " Proximo--> " + temp.getProximo().getElement() +
                    " Anterior--> " + temp.getAnterior().getElement() + " | ");
            temp = temp.getProximo();
        }
        System.out.println(temp.getElement() + " :" +
                " Proximo--> " + temp.getProximo().getElement() +
                " Anterior--> " + temp.getAnterior().getElement() + " | ");
    }
}
