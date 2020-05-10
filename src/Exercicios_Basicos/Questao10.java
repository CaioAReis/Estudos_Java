package Exercicios_Basicos;
import java.util.Scanner;
public class Questao10 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        
        System.out.print("Informe o índice de poluição: ");
        float indice = input.nextFloat();
        
        if(indice < 0.3)
            System.out.println("Tudo normal por aqui!!");
        else if(indice > 0.29 && indice < 0.4)
            System.out.println("O 1º grupo será intimado!!");
        else if( indice > 0.39 && indice < 0.5)
            System.out.println("As indústrias 1º e 2º serão intimádas!!");
        else if(indice > 0.49)
            System.out.println("Todos os grupos serão intimados!!");
        
        
        
    }
}
