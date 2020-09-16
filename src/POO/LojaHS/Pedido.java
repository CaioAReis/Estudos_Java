package POO.LojaHS;

import java.util.Arrays;
import java.util.Objects;

public class Pedido {
    //  Atributos
    private int numero;
    private Item[] itens;
    private int qtditens;
    private Cliente cliente;

    //  Construtores
    public Pedido(int numero) {
        this.numero = numero;
        this.itens = new Item[10];
        this.qtditens = 0;
    }

    public Pedido(int numero, Cliente cliente){
        this.numero = numero;
        this.itens = new Item[10];
        this.qtditens = 0;
        this.cliente = cliente;
    }

    //  Metodos
    public boolean existeItem(Item item){
        if (qtditens > 0){
            for (int i = 0; i < qtditens; i++){
                if (itens[i].getProduto().getId() == item.getProduto().getId()) return true;
            }
        }
        return false;
    }

    public boolean adicionarItem(Item item){
        if (qtditens < itens.length){
            itens[qtditens] = item;
            qtditens++;
            return true;
        }
        return false;
    }

    public Item buscarItem(Item item){
        for (int i = 0; i < qtditens; i++){
            if (itens[i].getProduto().getId() == item.getProduto().getId()) return itens[i];
        }
        return null;
    }

    //  Acessores e Modificadores
    public int getNumero(){
        return this.numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Item[] getItens() {
        return itens;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido = (Pedido) o;
        return numero == pedido.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numero=" + numero +
                ", itens=" + Arrays.toString(itens) +
                ", qtditens=" + qtditens +
                ", cliente=" + cliente +
                '}';
    }
}
