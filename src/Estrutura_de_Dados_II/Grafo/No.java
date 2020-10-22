package Estrutura_de_Dados_II.Grafo;

import java.util.ArrayList;

public class No {
    //  Atributos
    private Object element;
    private ArrayList <Caminho> listaCaminhos;

    //  Construtor
    public No(Object element) {
        this.element = element;
        this.listaCaminhos = new ArrayList<Caminho>();
    }

    //  Métodos
    //  Quantidade de caminhos
    public int getQtdCaminhos(){
        return listaCaminhos.size();
    }

    //  Pegar o destino de um determinado caminho
    public No getDestino(int position){
        return listaCaminhos.get(position).getDestino();
    }

    //  Pegar peso de um determinado caminho
    public int getPesoDeCaminho(int position){
        return listaCaminhos.get(position).getPeso();
    }
    //  Acessores e Modificadores

    //  Pegar elemento
    public Object getElement() {
        return element;
    }

}
