package POO.AnalyzeCodify;

import java.util.Objects;
import java.util.Random;

public class Funcionario extends Pessoa{

    Random random = new Random();

    // ATRIBUTOS
    int matricula;
    double salarioBase;
    int nrDependentes;
    double gratProdutividade;

    // CONSTRTORES
    public Funcionario(String cpf, String nome) {
        super(cpf, nome);
    }

    public Funcionario(String cpf, String nome, char sexo, int idade) {
        super(cpf, nome, sexo, idade);
    }

    public Funcionario(String cpf, String nome, char sexo, int idade, int nrDependentes, double gratProdutividade) {
        super(cpf, nome, sexo, idade);
        this.matricula = random.nextInt(10);
        this.salarioBase = 954;
        this.nrDependentes = nrDependentes;
        this.gratProdutividade = gratProdutividade;
    }
    
    // MÉTODOS

    public double getSalarioBruto() {
        return salarioBase + gratProdutividade;
    }

    public double getDesconto() {
        return 0;
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
        return matricula == that.matricula && cpf.equals(that.cpf);
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