package POO.SempreSaudavel;

public class ClinicoGeral extends Medico {
    // Atributos
    public boolean realizaCirurgia;

    //  Construtor
    public ClinicoGeral(int crm, String nome, double valorHoraConsulta, boolean realizaCirurgia) {
        super(crm, nome, valorHoraConsulta);
        this.realizaCirurgia = realizaCirurgia;
    }

    //  Metodos
    @Override
    public double TotalConslta(int tempoTotal) {
        if (this.realizaCirurgia)
            return super.TotalConslta(tempoTotal) + 1000;
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