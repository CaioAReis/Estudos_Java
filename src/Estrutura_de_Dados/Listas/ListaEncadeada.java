package Estrutura_de_Dados.Listas;

public class ListaEncadeada<T> implements ILista<T>{
    
    // Atributos

    private No<T> inicio;
    private No<T> fim;
    private int qtdLista;
    
    // Construtor
    
    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.qtdLista = 0;
    }
    
    // Metodos

    @Override
    public void adicionarFim(T o) {
        
        if (qtdLista == 0)
            adicionarInicio(o);
        else{
            No<T> novo = new No<>(o);
            fim.setProximo(novo);
            fim = novo;
            qtdLista++;
        }
    }

    @Override
    public void adicionarPosicao(int position, T o){
        
        if (position < 0 || position > qtdLista)
            throw new IllegalArgumentException("Posição Informada inválida!");
        
        No<T> novo = new No<>(o);
        No<T> temp = get(position - 1);

        novo.setProximo(temp.getProximo());
        temp.setProximo(novo);
        qtdLista++;
    }

    @Override
    public void adicionarInicio(T o) {
        
        No<T> novo = new No<>(o);
        
        if (qtdLista == 0){
            inicio = novo;
            fim = novo;
            qtdLista++;
        }else{
          novo.setProximo(inicio);
          inicio = novo;
          qtdLista++;
        }
    }

    @Override
    public void removerFim() {

        if (qtdLista == 0 && inicio == fim)
            removerInicio();

        No<T> temp = get(qtdLista - 2);

        temp.setProximo(null);
        fim = temp;
        qtdLista--;
    }

    @Override
    public void removerPosicao(int position) {

        if (position < 0 || position >= qtdLista)
            throw new IllegalArgumentException("Posição Informada inválida!");

        No<T> temp = get(position - 1);
        No<T> excluido = temp.getProximo();
        temp.setProximo(excluido.getProximo());
        qtdLista--;
    }

    @Override
    public void removerInicio() {

        if (inicio == null)
            throw new IllegalArgumentException("A lista já está vazia!");

        inicio = inicio.getProximo();
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
    public boolean encontrarElemento(Object o) {

        No<T> temp = inicio;

        while (temp != null){

            if (temp.getElement().equals(o))
                return true;
            temp = temp.getProximo();
        }
        return false;
    }

    @Override
    public void listar() {
        
        No<T> temp = inicio;

        while ( temp != null ){
            System.out.print(temp.getElement() + " | ");
            temp = temp.getProximo();
        }
        System.out.println();
    }
}