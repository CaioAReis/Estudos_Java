package Exercicios_Basicos;
import java.util.Scanner;
public class Questao21 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        int idade, qtdLivros, livros10anos = 0, qtdMulheres5 = 0,
            somaIdades = 0, qtdHomens5 = 0, burros = 0, totalPessoas = 0;
        char sexo;
        
        do {
            
            System.out.print("\n\nInforme a IDADE: ");
            idade = input.nextInt();
            
            if (idade > 0){
                
                System.out.print("Informe o SEXO: ");
                sexo = input.next().charAt(0);
                
                System.out.print("Quantidade de livros lidos em 2017: ");
                qtdLivros = input.nextInt();
                
                // Letra A
                if (idade < 10)
                    livros10anos += qtdLivros;
                
                // Letra B
                if (sexo == 'f' && qtdLivros >= 5)
                    qtdMulheres5++;
                
                // Letra C
                if (sexo == 'm' && qtdLivros < 5){
                    somaIdades += idade;
                    qtdHomens5++;
                }
                
                // Letra D
                if (qtdLivros == 0)
                    burros++;
                
                // Total Pessoas
                totalPessoas++;
            }
            
        } while (idade > 0);
        
        System.out.println("\n--------------------");
        System.out.println("RESULTADO");
        System.out.println("--------------------");
        
        System.out.println("Letra A: ");
        System.out.println("A quantidade total de livros lidos pelos entrevistados menores de 10 anos: " + livros10anos);
        
        System.out.println("Letra B: ");
        System.out.println("A quantidade de mulheres que leram 5 livros ou mais: " + qtdMulheres5);
        
        System.out.println("Letra C: ");
        System.out.println("A média de idade dos homens que leram menos que 5 livros: " + (somaIdades/qtdHomens5));
        
        System.out.println("Letra D: ");
        System.out.println("O percentual de pessoas que não leram livros: " + ((100*burros)/totalPessoas) + "%");
        
    }
}
