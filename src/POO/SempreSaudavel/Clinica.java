package POO.SempreSaudavel;

import java.util.Random;

public class Clinica {

    Random aleatorio = new Random();

    //  Atributos
    public String nomeClinica;
    public String endereco;
    public Medico[] listaMedicos;
    public Consulta[] listaConsultas;
    public int qtdMedicos = 0;
    public int qtdConsultas = 0;

    //  Construtor
    public Clinica(String nomeClinica, String endereco) {
        this.nomeClinica = nomeClinica;
        this.endereco = endereco;
        this.listaMedicos = new Medico[5];
        this.listaConsultas = new Consulta[5];
    }

    //  Metodos
    public boolean contratarMedico(Medico novoMedico) {
        if (qtdMedicos != listaMedicos.length){
            for (int i = 0; i != qtdMedicos; i++) {
                if (novoMedico.getCrm() == listaMedicos[i].getCrm()) {
                    System.out.println("O médico " + novoMedico.getNome() + " já está cadastrado!!");
                    return false;
                }
            }
            listaMedicos[qtdMedicos] = novoMedico;
            qtdMedicos++;
            return true;
        } else
            return false;
    }

    public Medico buscarMedico(int crm) {
        for (int i = 0; i <= qtdMedicos; i++) {
            if (listaMedicos[i].getCrm() == crm)
                return listaMedicos[i];
        }
        return null;
    }

    public int marcarConsulta(Medico medico) {
        if (qtdConsultas != listaConsultas.length) {
            int codConsulta = aleatorio.nextInt(2)+1;
            Consulta novaConsulta = new Consulta(codConsulta, medico);
            listaConsultas[qtdConsultas] = novaConsulta;
            qtdConsultas++;
            return codConsulta;
        }
        return 0;
    }

    public double PagarConsulta(int codConsulta, int tempoConsulta) {
        for (int i = 0; i < listaConsultas.length; i++) {
            if (codConsulta == listaConsultas[i].getCodConsulta()) {
                return listaConsultas[i].getMedicoResponsavel().TotalConslta(tempoConsulta);
            }
        }
        System.out.println("A consulta não foi encontrada!!");
        return 0;
    }

    //  Acessores e Modificadores
    public String getNomeClinica() {
        return nomeClinica;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String novoEndereco) {
        this.endereco = novoEndereco;
    }

    public int getQtdMedicos() {
        return qtdMedicos;
    }

    public int getQtdConsultas() {
        return qtdConsultas;
    }
}