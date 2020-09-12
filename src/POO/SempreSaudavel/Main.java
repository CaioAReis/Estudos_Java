package POO.SempreSaudavel;

public class Main {
    public static void main(String[] args) {

        Medico medico = new Medico(111, "Medico 1", 50);
        Pediatria pediatra = new Pediatria(222, "Medico 2", 100, 20);
        ClinicoGeral clinicoGeral = new ClinicoGeral(333, "Medico 3", 20, true);

        Clinica sempreSaudavel = new Clinica("Sempre Saudável", "Casa do KRLH");

        System.out.println(sempreSaudavel.contratarMedico(medico));
        System.out.println(sempreSaudavel.contratarMedico(pediatra));
        System.out.println(sempreSaudavel.contratarMedico(clinicoGeral));
        System.out.println(sempreSaudavel.contratarMedico(clinicoGeral));

        System.out.println(sempreSaudavel.buscarMedico(333));

        System.out.println(sempreSaudavel.marcarConsulta(clinicoGeral));

        System.out.println(sempreSaudavel.PagarConsulta(2,4));
    }
}
