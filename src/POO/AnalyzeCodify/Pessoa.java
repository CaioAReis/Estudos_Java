package POO.AnalyzeCodify;

public class Pessoa {
    // ATRIBUTOS
    private String cpf;
    private String nome;
    private char sexo;
    private int idade;

    // CONSTRUTORES
    public Pessoa(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Pessoa(String cpf, String nome, char sexo, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    // ENCAPSULAMENTO
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return cpf.equals(pessoa.cpf);
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Pessoa = [" +
                "cpf: '" + cpf + '\'' +
                ", nome: '" + nome + '\'' +
                ", sexo: " + sexo +
                ", idade: " + idade +
                ']';
    }
}