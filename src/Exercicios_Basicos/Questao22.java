package Exercicios_Basicos;
import java.util.Scanner;
public class Questao22 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        byte idade, notaPeça; // Botei em Byte pq são valores muito pequenos!!
        String identificador, identificadorVelho = null;
        int contNota10 = 0, somaIdade = 0, responderam5 = 0, maiorIdade = 0;
        
        for (int i = 0; i <= 199; i++){
            
            System.out.print("\n\nInforme a idade: ");
            idade = input.nextByte();
            
            System.out.print("Informe o Identificador: ");
            identificador = input.next();
            
            System.out.print("Opinião em relação à peça: ");
            notaPeça = input.nextByte();
            
            System.out.println("-----------------------");
            
            somaIdade += idade;

            // Coletando a quantidade de Respostas 10
            if (notaPeça == 10)
                contNota10++;
            // Coletando a quantidade de pessoas CHATAS que responderam com 5 ou menos
            if (notaPeça <= 5)
                responderam5++;
            // Coletando o COROA da platéia
            if (idade > maiorIdade){
                maiorIdade = idade;
                identificadorVelho = identificador;
            }
        }
        
        System.out.println("\n#########################");
        
        // Letra A
        System.out.println("\nLetra A: "
                + "\nA quantidade de respostas 10: " + contNota10);;
        
        // Letra B
        System.out.println("\nLetra B: "
                + "\nA média de idade das pessoas que responderam o questionário: " + (somaIdade/200) );
        
        // Letra C
        System.out.println("\nLetra C: "
                + "\nA percentagem de pessoas que responderam 5 ou menos para a opinião da peça: " + ((100*responderam5)/200) + "%" );
        
        // Letra D
        System.out.println("\nLetra D: "
                + "\nO identificador da pessoa mais velha: " + identificadorVelho
                + "\nMaior Idade: " + maiorIdade);
        
    }
}
