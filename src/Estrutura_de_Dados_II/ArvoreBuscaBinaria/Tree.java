package Estrutura_de_Dados_II.ArvoreBuscaBinaria;

public class Tree {
    //  Atributos
    private No raiz;

    //  Construtores
    public Tree(){
        this.raiz = null;
    }

    //  Metodos
    //  INSERÇÃO
    public void inserir(int valor){
        No novo = new No(valor);
        if (isEmpty()){
            raiz = novo;
            System.out.println(raiz.getValor() + " É RAIZ");
        } else
            inserir(raiz,novo);
    }

    private void inserir(No raiz, No novoNo){
        if (novoNo.getValor() > raiz.getValor()){
            if (raiz.getDireito() == null){
                raiz.setDireito(novoNo);
                System.out.println(novoNo.getValor() + " ADICIONADO Á DIREITA DE " + raiz.getValor());
            }else
                inserir(raiz.getDireito(),novoNo);
        } else {
            if (raiz.getEsquerdo() == null){
                raiz.setEsquerdo(novoNo);
                System.out.println(novoNo.getValor() + " ADICIONADO Á ESQUERDA DE " + raiz.getValor());
            }else
                inserir(raiz.getEsquerdo(), novoNo);
        }
    }

    //  BUSCA
    public void buscar(int valor){
        if (isEmpty()){
            System.out.println("Árvore vazia!");
        }else
            buscar(raiz, valor);
    }

    private No buscar(No raiz, int valor){
        if (raiz == null){
            System.out.println(valor + " NÃO encontrdo!!");
            return null;
        } else if (raiz.getValor() == valor){
            System.out.println(valor + " Encontrado!!");
            return raiz;
        } else {
            if (valor > raiz.getValor()){
                buscar(raiz.getDireito(),valor);
            } else
                buscar(raiz.getEsquerdo(),valor);
        }
        return null;
    }

    //  QUANTIDADE DE NOs
    public int quantidadeNos(){
        if (isEmpty()) return 0;
        else return quantidadeNos(raiz);
    }

    private int quantidadeNos(No raiz){
        if (raiz != null)
            return (quantidadeNos(raiz.getEsquerdo()) + 1 + quantidadeNos(raiz.getDireito()));
        return 0;
    }

    //  EXIBIR ÁRVORE
    public void exibirArvore() {
        if (isEmpty())
            System.out.println("Árvore vazia!!");
        else
            exibirArvore(raiz);
    }

    private void exibirArvore(No raiz){
        if (raiz != null){
            System.out.print(raiz.getValor() + "(");
            exibirArvore(raiz.getEsquerdo());
            exibirArvore(raiz.getDireito());
            System.out.print(")");
        }
    }

    //  IMPRESSÃO DOS VALORES
    public void printOrdemERD(){
        if (isEmpty())
            System.out.println("Árvore vazia!!");
        else
            printOrdemERD(raiz);
    }

    private void printOrdemERD(No raiz){
        if (raiz != null){
            printOrdemERD(raiz.getEsquerdo());
            System.out.print(raiz.getValor() + " | ");
            printOrdemERD(raiz.getDireito());
        }
    }

    public void printOrdemDRE(){
        if (isEmpty())
            System.out.println("Árvore vazia!!");
        else
            printOrdemDRE(raiz);
    }

    private void printOrdemDRE(No raiz){
        if (raiz != null){
            printOrdemDRE(raiz.getDireito());
            System.out.print(raiz.getValor() + " | ");
            printOrdemDRE(raiz.getEsquerdo());
        }
    }

    public void printOrdemEDR(){
        if (isEmpty())
            System.out.println("Árvore vazia!!");
        else
            printOrdemEDR(raiz);
    }

    private void printOrdemEDR(No raiz){
        if (raiz != null){
            printOrdemEDR(raiz.getEsquerdo());
            printOrdemEDR(raiz.getDireito());
            System.out.print(raiz.getValor() + " | ");
        }
    }

    public void printOrdemRED(){
        if (isEmpty())
            System.out.println("Árvore vazia!!");
        else
            printOrdemRED(raiz);
    }

    private void printOrdemRED(No raiz){
        if (raiz != null){
            System.out.print(raiz.getValor() + " | ");
            printOrdemRED(raiz.getEsquerdo());
            printOrdemRED(raiz.getDireito());
        }
    }

    public boolean isEmpty(){
        return raiz == null;
    }
}
