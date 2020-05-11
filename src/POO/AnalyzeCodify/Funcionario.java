package POO.AnalyzeCodify;

import java.util.Random;

public class Funcionario extends Pessoa{

    Random random = new Random();

    // ATRIBUTOS
    private int matricula;
    private double salarioBase;
    private int nrDependentes;
    private double gratProdutividade;

    // CONSTRTORES
    public Funcionario(String cpf, String nome) {
        super(cpf, nome);
    }

    public Funcionario(String cpf, String nome, char sexo, int idade) {
        super(cpf, nome, sexo, idade);
    }

    public Funcionario(String cpf, String nome, char sexo, int idade, int nrDependentes, double gratProdutividade) {
        super(cpf, nome, sexo, idade);
        this.matricula = random.nextInt(1);
        this.salarioBase = 954;
        this.nrDependentes = nrDependentes;
        this.gratProdutividade = gratProdutividade;
    }
    
    // MÉTODOS
    public double getSalarioBruto() {
        return this.salarioBase + this.gratProdutividade;
    }

    public double getDesconto() {

        if (getSalarioBruto() >= 2000 && getSalarioBruto() < 4000)
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
    public int getMatricula() {
        return matricula;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getNrDependentes() {
        return nrDependentes;
    }

    public void setNrDependentes(int nrDependentes) {
        this.nrDependentes = nrDependentes;
    }

    public double getGratProdutividade() {
        return gratProdutividade;
    }

    public void setGratProdutividade(double gratProdutividade) {
        this.gratProdutividade = gratProdutividade;
    }

    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Funcionario that = (Funcionario) o;
        return matricula == that.matricula && getCpf().equals(that.getCpf());
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Funcionario = [ " +
                super.toString() +
                ", matricula: " + matricula +
                ", salarioBase: " + salarioBase +
                ", nrDependentes: " + nrDependentes +
                ", gratProdutividade: " + gratProdutividade +
                ']';
    }
}