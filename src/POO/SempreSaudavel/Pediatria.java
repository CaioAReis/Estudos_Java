package POO.SempreSaudavel;

public class Pediatria extends Medico{
    // Atributos
    public int anosExperiencia;

    //  Construtor
    public Pediatria(int crm, String nome, double valorHoraConsulta, int anosExperiencia) {
        super(crm, nome, valorHoraConsulta);
        this.anosExperiencia = anosExperiencia;
    }

    //  Metodos
    @Override
    public double TotalConslta(int tempoTotal) {
        if (this.anosExperiencia >= 10)
            return ((this.valorHoraConsulta * tempoTotal) * 2);
        else
            return super.TotalConslta(tempoTotal);
    }

    //  Acessores e Modificadores
    @Override
    public int getCrm() {
        return super.getCrm();
    }

    @Override
    public void setCrm(int crm) {
        super.setCrm(crm);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public double getValorHoraConsulta() {
        return super.getValorHoraConsulta();
    }

    @Override
    public void setValorHoraConsulta(double valorHoraConsulta) {
        super.setValorHoraConsulta(valorHoraConsulta);
    }
}