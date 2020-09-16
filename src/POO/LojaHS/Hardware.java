package POO.LojaHS;

public class Hardware extends Produto{
    //  Atributos
    private String tipo;

    //  Construtor
    public Hardware(int id, String nome, double precoUnitario, String tipo) {
        super(id, nome, precoUnitario);
        this.tipo = tipo;
    }

    //  Acessores e Modificadores
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "tipo='" + tipo + '\'' +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precoUnitario=" + precoUnitario +
                '}';
    }
}
