package Estrutura_de_Dados.Listas;

public class ListaEncadeada implements ILista{
    
    // Atributos

    private No inicio;
    private No fim;
    private int qtdLista;
    
    // Construtor
    
    public ListaEncadeada() {
        this.inicio = null;
        this.fim = null;
        this.qtdLista = 0;
    }
    
    // Metodos

    @Override
    public void adicionarFim(Object o) {
        
        if (qtdLista == 0)
            adicionarInicio(o);
        else{
            No novo = new No(o);
            fim.setProximo(novo);
            fim = novo;
            qtdLista++;
        }
        
//  Dessa forma abaixo iremos percorrer toda a lista; 
//  que se for muito grande implicará no desempenho do programa!!        

//        while (atual.getProximo() != null) 
//            atual = atual.getProximo();
//        
//        atual.setProximo(novo);
    }

    @Override
    public void adicionarPosicao(int position, Object o){
        
        if (position < 0 || position > qtdLista)
            throw new IllegalArgumentException("Posição Informada inválida!");
        
        No novo = new No(o);
        No temp = get(position - 1);

        novo.setProximo(temp.getProximo());
        temp.setProximo(novo);
        qtdLista++;
    }

    @Override
    public void adicionarInicio(Object o) {
        
        No novo = new No(o);
        
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

        No temp = get(qtdLista - 2);

        temp.setProximo(null);
        fim = temp;
        qtdLista--;
    }

    @Override
    public void removerPosicao(int position) {

        if (position < 0 || position >= qtdLista)
            throw new IllegalArgumentException("Posição Informada inválida!");

        No temp = get(position - 1);
        No excluido = temp.getProximo();
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
    public No get(int position) {

        if (position >= qtdLista)
            throw new IllegalArgumentException("Posição Inválida!");

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

        while (temp != null){

            if (temp.getElement().equals(o))
                return true;
            temp = temp.getProximo();
        }
        return false;
    }

    @Override
    public void listar() {
        
        No temp = inicio;

        while ( temp != null ){
            System.out.print(temp.getElement() + " | ");
            temp = temp.getProximo();
        }
        System.out.println();
    }
}