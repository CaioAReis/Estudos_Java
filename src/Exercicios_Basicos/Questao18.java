package Exercicios_Basicos;

public class Questao18 {
    public static void main(String[] args) {
        
        float s = 0;
        int cont = 1;
        
        for(int i = 1; i <= 99; i+=2){
            
            s = (i/cont) + s;
            
            System.out.print("(" + i + " / " + cont + ") + ");
            
            //System.out.println(i);
            //System.out.println(cont);
            
            cont++;
            
        }
        
        System.out.println("\nO valor de S equilave a: " + s);
        
    }
}
