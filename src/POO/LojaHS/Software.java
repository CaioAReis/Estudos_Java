package POO.LojaHS;

public class Software extends Produto {
    //  Atributos
    private int versao;

    //  Construtor
    public Software(int id, String nome, double precoUnitario, int versao) {
        super(id, nome, precoUnitario);
        this.versao = versao;
    }

    //  Acessores e Modificadores
    public int getVersao() {
        return versao;
    }

    public void setVersao(int versao) {
        this.versao = versao;
    }

    @Override
    public String toString() {
        return "Software{" +
                "versao=" + versao +
                ", id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", precoUnitario=" + precoUnitario +
                '}';
    }
}