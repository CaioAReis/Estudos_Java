package POO.AnalyzeCodify;

public class Coordenador extends Funcionario{
    // ATRIBUTOS
    private double gratCoordenacao;
    private String setor;

    // Construtores
    public Coordenador(String cpf, String nome, double gratCoordenacao, String setor) {
        super(cpf, nome);
        this.gratCoordenacao = gratCoordenacao;
        this.setor = setor;
    }

    public Coordenador(String cpf, String nome, char sexo, int idade, double gratCoordenacao, String setor) {
        super(cpf, nome, sexo, idade);
        this.gratCoordenacao = gratCoordenacao;
        this.setor = setor;
    }

    public Coordenador(String cpf, String nome, char sexo, int idade, int nrDependentes, double gratProdutividade, double gratCoordenacao, String setor) {
        super(cpf, nome, sexo, idade, nrDependentes, gratProdutividade);
        this.gratCoordenacao = gratCoordenacao;
        this.setor = setor;
    }

    // METODOS

    public double getSalarioBruto() {
        return this.salarioBase + this.gratProdutividade + this.gratCoordenacao;
    }

    public double getDesconto() {
        if (getSalarioBruto() > 2000 && getSalarioBruto() < 4000)
            return (getSalarioBruto() * 10) / 100;
        else if (getSalarioBruto() >= 4000)
            return (getSalarioBruto() * 25) / 100;
        else
            return 0;
    }

    public double getSalarioLiquido() {
        return getSalarioBruto() - getDesconto();
    }

    // ENCAPSULAMENTO
    public double getGratCoordenacao() {
        return gratCoordenacao;
    }

    public void setGratCoordenacao(double gratCoordenacao) {
        this.gratCoordenacao = gratCoordenacao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Coordenador = [" +
                super.toString() +
                "gratCoordenacao=" + gratCoordenacao +
                ", setor='" + setor + '\'' +
                ']';
    }
}