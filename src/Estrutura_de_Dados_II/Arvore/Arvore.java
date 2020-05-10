package Estrutura_de_Dados_II.Arvore;

public class Arvore {

    // Atributos

    private No raiz;

    // Construtor

    public Arvore() {
        this.raiz = null;
    }

    // Metodos

    public void add (int valor){

        No novo = new No (valor);

        if ( isEmpy() ) {
            raiz = novo;
            System.out.println(novo.getValor() + " É a RAIZ!!");
        }else {
            add(raiz, novo);
        }

    }

    private void add(No tempR, No novo ) {

        if ( novo.getValor() > tempR.getValor()) {

            if ( tempR.getDireito() == null) {
                tempR.setDireito(novo);
                System.out.println(novo.getValor() + " Adicionado à DIREITA de " + tempR.getValor());
            }else
                add(tempR.getDireito(), novo);
        }else {

            if ( tempR.getEsquerto() == null ) {
                tempR.setEsquerto(novo);
                System.out.println(novo.getValor() + " Adicionado à ESQUERDA de " + tempR.getValor());
            }else
                add(tempR.getEsquerto(), novo);
        }
    }

    public void buscar (int valor) {

        if ( isEmpy() ){
            System.out.println("A arvora está VAZIA!");
        }else
            buscar(raiz, valor);
    }

    private No buscar (No tempR, int valor) {

        if (tempR == null) {
            System.out.println(valor + " NÃO encontrado!");
            return null;
        }
        if ( valor == tempR.getValor() ) {
            System.out.println(tempR.getValor() + " FOI ENCONTRADO!");
            return tempR;
        }else {
            if (valor > tempR.getValor()) {
                buscar(tempR.getDireito(), valor);
            }else
                buscar(tempR.getEsquerto(), valor);
        }
        return null;
    }

    public boolean isEmpy() {
        return ( raiz == null );
    }

    public void emOrdem() {
        printEmOrdem(raiz);
    }   // ORDEM E - R - D

    private void printEmOrdem( No temp ) {

        if ( temp != null ) {
            printEmOrdem( temp.getEsquerto() );
            System.out.print( temp.getValor() + " | " );
            printEmOrdem( temp.getDireito() );
        }
    }

    public void ordemInversa() {
        printOrdemInversa(raiz);
    }   // ORDEM D - R - E

    private void printOrdemInversa(No temp) {

        if ( temp != null ) {
            printOrdemInversa( temp.getDireito() );
            System.out.print( temp.getValor() + " | ");
            printOrdemInversa( temp.getEsquerto() );
        }
    }

    public void ordemEDR() {
        printEDR(raiz);
    }   // ORDEM E - D - R

    private void printEDR(No temp) {

        if (temp != null) {
            printEDR(temp.getEsquerto());
            printEDR(temp.getDireito());
            System.out.print(temp.getValor() + " | ");
        }
    }

    public void ordemRED() {
        printOrdemRED(raiz);
    }   // ORDEM R - E - D

    private void printOrdemRED(No temp) {

        if (temp != null) {
            System.out.print(temp.getValor() + " | ");
            printOrdemRED(temp.getEsquerto());
            printOrdemRED(temp.getDireito());
        }
    }

}