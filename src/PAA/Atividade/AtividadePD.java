public class AtividadePD {

    public static boolean divisao(int[] s) {
        if (s.length < 3) return false;

        int sum = 0;

        for (int i = 0; i < s.length; i++) sum += s[i];

        if (sum % 3 != 0) return false;

        boolean a = conjunto(s, 0, sum / 3);
        boolean b = conjunto(s, 0, sum / 3);
        boolean c = conjunto(s, 0, sum / 3);

        return a && b && c;
    }

    public static boolean conjunto(int[] array, int position, int soma) {
        if (soma == 0) return true;

        if (position == array.length) return false;

        if (soma - array[position] >= 0)
            conjunto(array, position + 1, soma - array[position]);

        return conjunto(array, position + 1, soma - array[position]);
    }

    public static void main(String args[]) {
        int[] s = { 7, 3, 2, 1, 5, 4, 8 };

        boolean result = divisao(s);

        if (result) System.out.println("\nO conjunto pode ser dividido!");
        else System.out.println("\nO conjunto NÃO pode ser dividido!");
    }
}
