package POO.AnalyzeCodify;

public class Administrativo extends Funcionario {

    // CONSTRUTORES
    public Administrativo(String cpf, String nome) {
        super(cpf, nome);
    }

    public Administrativo(String cpf, String nome, char sexo, int idade) {
        super(cpf, nome, sexo, idade);
    }

    public Administrativo(String cpf, String nome, char sexo, int idade, int nrDependentes, double gratProdutividade) {
        super(cpf, nome, sexo, idade, nrDependentes, gratProdutividade);
    }

    // METODOS
    public double getAuxilioiEducacao() {
        double auxilio = getNrDependentes() * 60;
        if (auxilio >= 300)
            return 300;
        else
            return auxilio;
    }

    public double getSalarioBruto() {
        return getSalarioBase() + getGratProdutividade() + getAuxilioiEducacao();
    }

    public double getDesconto() {
        if (getSalarioBruto() >= 2000 && getSalarioBruto() < 4000)
            return (getSalarioBruto() * 10) / 100;
        else if (getSalarioBruto() > 4000)
            return (getSalarioBruto() * 25) / 100;
        else
            return 0;
    }

    public double getSalarioLiquido() {
        return getSalarioBruto() - getDesconto();
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Administrativo = [" + super.toString() + ']';
    }
}