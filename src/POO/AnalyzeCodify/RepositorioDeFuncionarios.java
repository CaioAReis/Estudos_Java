package POO.AnalyzeCodify;

public class RepositorioDeFuncionarios {

    private Funcionario[] funcionarios = new Funcionario[16];
    private int qtdFuncionarios = 0;

    //METODOS
    public boolean adicionar( Funcionario funcionario ) {
        if (qtdFuncionarios != funcionarios.length) {
            funcionarios[qtdFuncionarios] = funcionario;
            qtdFuncionarios++;
            return true;
        }
        else
            return false;
    }
    // PRECISA DE UMA ANALISE PROFUNDA
    public boolean remover( String cpf, int matricula ) {
        for (int i = 0; i < qtdFuncionarios; i++) {
            if (funcionarios[i].getCpf().equals(cpf) && funcionarios[i].getMatricula() == matricula) {
                funcionarios[i] = funcionarios[qtdFuncionarios];
                qtdFuncionarios--;
                return true;
            }
        }
        return false;
    }

    public Funcionario buscarCoordenadorPorMatricula( int matricula ) {
        for (int i = 0; i < qtdFuncionarios; i++) {
            if (funcionarios[i] instanceof Coordenador && funcionarios[i].getMatricula() == matricula)
                return funcionarios[i];
        }
        return null;
    }

    public Funcionario buscarAdmPorNome( String nome ) {
        for (int i = 0; i < qtdFuncionarios; i++) {
            if (funcionarios[i] instanceof Administrativo && funcionarios[i].getNome().equals(nome))
                return funcionarios[i];
        }
        return null;
    }

    public Funcionario[] listarAdmPorFaixaSalarial( double min, double max ) {

        Funcionario[] listaADM = new Funcionario[16];
        int qtdADM = 0;

        for (int i = 0; i < qtdFuncionarios; i++) {
            if (funcionarios[i] instanceof Administrativo) {
                if (funcionarios[i].getSalarioLiquido() >= min && funcionarios[i].getSalarioLiquido() <= max) {
                    listaADM[qtdADM] = funcionarios[i];
                    qtdADM++;
                }
            }
        }
        if (qtdADM == 0)
            return null;
        else
            return listaADM;
    }

    public Funcionario[] listarAdmPorNrDependentes( int nrDependentes) {

        Funcionario[] listaADM = new Funcionario[16];
        int qtdADM = 0;

        for (int i = 0; i < qtdFuncionarios; i++) {
            if (funcionarios[i] instanceof Administrativo && funcionarios[i].getNrDependentes() == nrDependentes){
                listaADM[qtdADM] = funcionarios[i];
                qtdADM++;
            }
        }
        if (qtdADM == 0)
            return null;
        else
            return listaADM;
    }
}
