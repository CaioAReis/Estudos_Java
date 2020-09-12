package POO.SempreSaudavel;

public class Medico {
    // Atributos
    protected int crm;
    protected String nome;
    protected double valorHoraConsulta;

    // Construtor
    public Medico(int crm, String nome, double valorHoraConsulta) {
        this.crm = crm;
        this.nome = nome;
        this.valorHoraConsulta = valorHoraConsulta;
    }

    //  Metodos
    public double TotalConslta(int tempoTotal) {
        return (this.valorHoraConsulta * tempoTotal);
    }

    //  Acessores e Modificadores
    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHoraConsulta() {
        return this.valorHoraConsulta;
    }

    public void setValorHoraConsulta(double valorHoraConsulta) {
        this.valorHoraConsulta = valorHoraConsulta;
    }
}
