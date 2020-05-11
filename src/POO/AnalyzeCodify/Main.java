package POO.AnalyzeCodify;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("000.000.000-00", "Pessoa", 'M', 34);
        System.out.println(pessoa.toString());

        System.out.println("############################################");

        Funcionario funcionario = new Funcionario("111.111.111-111", "Funcionario", 'F', 44, 3, 132);
        System.out.println("Salário Bruto: " + funcionario.getSalarioBruto());
        System.out.println("Desconto: " + funcionario.getDesconto());
        System.out.println("Salário Líquido: " + funcionario.getSalarioLiquido());
        System.out.println(funcionario.toString());

        System.out.println("############################################");

        Coordenador coordenador = new Coordenador("222.222.222-22", "Coordenador", 'M',34, 3, 422, 700, "Compras");
        System.out.println("Salário Bruto: " + coordenador.getSalarioBruto());
        System.out.println("Desconto: " + coordenador.getDesconto());
        System.out.println("Salário Líquido: " + coordenador.getSalarioLiquido());
        System.out.println(coordenador.toString());

        System.out.println("############################################");

        Administrativo administrativo = new Administrativo("333.333.333-33", "ADM", 'F', 43, 5, 4000);
        System.out.println("Aux. Educação: " + administrativo.getAuxilioiEducacao());
        System.out.println("Salário Bruto: " + administrativo.getSalarioBruto());
        System.out.println("Desconto: " + administrativo.getDesconto());
        System.out.println("Salário Líquido: " + administrativo.getSalarioLiquido());
        System.out.println(administrativo.toString());

        System.out.println("############################################");

        RepositorioDeFuncionarios fr = new RepositorioDeFuncionarios();
        System.out.println("ADICIONAR: " + fr.adicionar(funcionario));
        fr.adicionar(coordenador);
        fr.adicionar(administrativo);
        System.out.println("Buscar ADM por nome: " + fr.buscarAdmPorNome("ADM"));
        System.out.println("Buscar COOR por Matricula: " + fr.buscarCoordenadorPorMatricula(0));
        System.out.println("Buscar COOR por Matricula: " + fr.buscarCoordenadorPorMatricula(1));
        System.out.println("Listar ADM por Salario: " + fr.listarAdmPorFaixaSalarial(3000, 6000));
        System.out.println("Listar ADM por dependentes" + fr.listarAdmPorNrDependentes(5));
        System.out.println("Remover: " + fr.remover("333.333.333-33", 0));
        System.out.println("Remover: " + fr.remover("333.333.333-33", 1));

    }
}