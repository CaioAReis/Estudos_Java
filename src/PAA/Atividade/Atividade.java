
public class Atividade {

    public static boolean achou = false;

    public static void main(String[] args) {
        String x = "Brasil";
        String n[] = { "Portugal", "Chile", "Argentina", "Cuba", "Paraguai", "Brasil", "Venezuela" };

        System.out.println("\n");
        int forcabruta = forcabruta(x, n);
        int divisaoEConquista = divisaoEConquista(x, n);

        System.out.println("Força Bruta: " + forcabruta);
        System.out.println("Divisão e Conquista: " + divisaoEConquista);
    }

    // -------------------------------------------------

    public static int forcabruta(String x, String[] n) {
        for (int i = 0; i < n.length; i++) {
            if (x.equalsIgnoreCase(n[i]))
                return 1;
        }
        return 0;
    }

    // -------------------------------------------------

    public static int divisaoEConquista(String x, String[] n) {
        divisao(x, n);
        return achou ? 1 : 0;
    }

    public static void Conquista(String x, String[] n) {
        if (n.length == 1) {
            if (x.equalsIgnoreCase(n[0])) achou = true;
        }
    }

    public static void divisao(String x, String n[]) {
        if (n.length >= 2 && !achou) {
            int meio = n.length / 2;
            String vetorA[] = new String[meio];
            String vetorB[] = new String[n.length - meio];

            for (int i = 0; i < meio; i++)
                vetorA[i] = n[i];
            for (int i = meio; i < n.length; i++)
                vetorB[i - meio] = n[i];

            divisao(x, vetorA);
            divisao(x, vetorB);
        }
        Conquista(x, n);
    }
}