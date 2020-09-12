package POO.SempreSaudavel;

public class Consulta {
    //  Atributos
    public int codConsulta;
    public Medico medicoResponsavel;

    //  Construtor
    public Consulta(int codConsulta, Medico medicoResponsavel) {
        this.codConsulta = codConsulta;
        this.medicoResponsavel = medicoResponsavel;
    }

    //  Acessores e Modificadores
    public int getCodConsulta() {
        return this.codConsulta;
    }

    public Medico getMedicoResponsavel() {
        return this.medicoResponsavel;
    }

    public void setMedicoResponsavel(Medico novoResponsavel) {
        this.medicoResponsavel = novoResponsavel;
    }
}