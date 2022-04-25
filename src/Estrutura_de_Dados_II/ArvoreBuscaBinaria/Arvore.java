package ArvoreBuscaBinaria;

public class Arvore {
    //  Atributos
    private No raiz;

    //  Construtores
    public Arvore(){
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
    public No buscar(int valor){
        if (isEmpty()){
            System.out.println("Árvore vazia!");
            return null;
        }else
            return buscar(raiz, valor);
    }

    private No buscar(No raiz, int valor){
        No achei = null;
        if (raiz != null){
            if (raiz.getValor() == valor){
                return raiz;
            } else {
                if (valor > raiz.getValor()){
                    achei = buscar(raiz.getDireito(),valor);
                } else
                    achei = buscar(raiz.getEsquerdo(),valor);
            }
        }
        return achei;
    }

    public No buscarPai(int valor){
        if (isEmpty()){
            return null;
        }else
            return buscarPai(raiz, valor);
    }

    private No buscarPai(No raiz, int valor){
        No pai = null;
        if (raiz != null){
            if (valor < raiz.getValor()){
                if (raiz.getEsquerdo().getValor() == valor){
                    pai = raiz;
                    return raiz;
                } else
                    pai = buscarPai(raiz.getEsquerdo(), valor);
            } else {
                if (raiz.getDireito().getValor() == valor){
                    pai = raiz;
                    return raiz;
                } else
                    pai = buscarPai(raiz.getDireito(), valor);
            }
        }
        return pai;
    }

    //  REMOÇÃO
    public void remover(int valor){
        if (!isEmpty()){
            No removido = buscar(raiz, valor);
            if (removido == null)
                System.out.println("Valor não encontrado.");
            else if (removido == raiz)
                remover(removido, null);
            else {
                No pai = buscarPai(valor);
                remover(removido, pai);
            }
        }else
            System.out.println("Árvore vazia.");
    }

    private boolean remover(No removido, No paiRemovido){
        No substituto = removido.getEsquerdo(), paiSubstituto = removido;

        //  Se o NO a ser excluido for a RAIZ
        if (removido == raiz){
            while(substituto.existeDireito()){
                paiSubstituto = substituto;
                substituto = substituto.getDireito();
            }
            if (paiSubstituto != removido){
                paiSubstituto.setDireito(substituto.getEsquerdo());
                substituto.setEsquerdo(removido.getEsquerdo());
            }
            substituto.setDireito(removido.getDireito());
            raiz = substituto;
            return true;
        }

        //  Se o NO que será excluído for uma folha
        if (!removido.existeEsquerdo() && !removido.existeDireito()){
            if (paiRemovido.getDireito() == removido) paiRemovido.setDireito(null);
            else paiRemovido.setEsquerdo(null);
            return true;
        }

        //  Se o NO que será excluído tiver apenas um filho independente do lado
        if ((removido.existeEsquerdo() && !removido.existeDireito()) || (!removido.existeEsquerdo() && removido.existeDireito())){
            if (paiRemovido.getEsquerdo() == removido){
                if (removido.existeEsquerdo()) paiRemovido.setEsquerdo(removido.getEsquerdo());
                else paiRemovido.setEsquerdo(removido.getDireito());
            } else {
               if (removido.existeEsquerdo()) paiRemovido.setDireito(removido.getEsquerdo());
               else paiRemovido.setDireito(removido.getDireito());
            }
            return true;
        }

        //  Se o NO a ser excluido tiver dois filhos
        if (removido.existeEsquerdo() && removido.existeDireito()){

            while (substituto.existeDireito()){
                paiSubstituto = substituto;
                substituto = substituto.getDireito();
            }
            if (paiSubstituto != removido){
                paiSubstituto.setDireito(substituto.getEsquerdo());
                substituto.setEsquerdo(removido.getEsquerdo());
            }
            substituto.setDireito(removido.getDireito());
            if (paiRemovido.getEsquerdo() == removido)
                paiRemovido.setEsquerdo(substituto);
            else
                paiRemovido.setDireito(substituto);
            return true;
        }
    return false;
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

    //  Altura
    public int altura(){
        if (!isEmpty())
            return altura(raiz);
        else
            return -1;
    }

    private int altura(No atual){

        if (atual != null){
            int altE = altura(atual.getEsquerdo());
            int altD = altura(atual.getDireito());
            if (altE < altD) return altD + 1;
            else return altE + 1;
        }
        return -1;
    }

    //  Niveis da arvore
    public void niveisArvore(){
        if (isEmpty())
            System.out.println("Árvore vazia!!");
        else
            niveisArvore(raiz);
    }

    private void niveisArvore(No raiz){
        if (raiz != null){
            niveisArvore(raiz.getEsquerdo());
        }
    }

    public boolean isEmpty(){
        return raiz == null;
    }
}
