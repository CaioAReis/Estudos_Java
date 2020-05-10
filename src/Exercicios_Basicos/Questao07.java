package Exercicios_Basicos;
import java.util.Scanner;
public class Questao07 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        System.out.print("Informe a 1ª nota: ");
        int nota1 = input.nextInt();
        System.out.print("Informa a 2ª nota: ");
        int nota2 = input.nextInt();
        
        System.out.print("Informe o nº de aulas ministradas: ");
        double aulas = input.nextDouble();
        System.out.print("Informe a quantidade de aulas assistidas: ");
        double aulasAssis = input.nextDouble();
        
        if(((100*aulasAssis)/aulas) >= (aulas*0.75) ){
            
            if(nota1 + nota2 >= 6)
                System.out.println("Aluno APROVADO");
            else 
                System.out.println("Aluno REPROVADO");
        }else 
            System.out.println("Aluno Reprovado por falta");
        
        System.out.println("Porcentagem de frequencia: " + ((100*aulasAssis)/aulas) + "%" );
    }
}
