package POO.Canil;

public class main {
    public static void main(String[] args) {
        Vacina a = new Vacina();
        Vacina b = new Vacina();
        Vacina c = new Vacina();

        // Primeiro cachorro
        Cachorro dog1 = new Cachorro();
        dog1.correr();
        dog1.cavar();
        dog1.latir();
        dog1.crescer(203);
        dog1.comer(100);

        dog1.vacinar(a);
        dog1.vacinar(b);
        dog1.vacinar(c);
    }
}
