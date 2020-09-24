package POO.Canil;

public class Cachorro {
    //  Atributos
    public String raca;
    public String nome;
    public String sexo;
    public int idade;
    public String cor;
    public double tamanho = 0;
    public double peso;
    private int filhotes = 0;
    public Vacina[] vacinas = new Vacina[6];
    public int qtdVacinas = 0;

    //  Metodos
    public void correr() {
        System.out.println("O cachorro está correndo");
    }

    public void latir() {
        System.out.println("O cachorro está latindo");
    }

    public void cavar() {
        System.out.println("O cachorro está cavando");
    }

    public void comer(double comeu) {
        peso = peso + ((comeu*10) / 100);
        System.out.println("Peso total: " + peso + "kg");
        System.out.println("Ele comeu " + comeu + "kg");
    }

    public boolean crescer(double novoTamanho) {
        if (novoTamanho > tamanho){
            tamanho = novoTamanho;
            return true;
        }
        return false;
    }

    public void vacinar(Vacina v) {
        vacinas[qtdVacinas] = v;
        qtdVacinas++;
    }

    private void terFilhotes(int qtdFilhotes) {
        filhotes += qtdFilhotes;
        System.out.println("A quantidade de filhotes novos: " + qtdFilhotes);
        System.out.println("A quantidade de filhotes ao total: " + (filhotes+qtdFilhotes));
    }
}
