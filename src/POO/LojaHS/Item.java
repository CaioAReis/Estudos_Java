package POO.LojaHS;

public class Item {
    //  Atributos
    private Produto produto;
    private int quantidade;

    //  Metodos
    public Produto getProduto(){
        return this.produto;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    public double totalDoItem(){
        return produto.getPrecoUnitario() * quantidade;
    }
}
