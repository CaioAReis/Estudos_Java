package Estrutura_de_Dados_II.ArvoreAVL;

public class ArvoreAVL {
    //  Atributo
    private No raiz;

    //  Construtor
    public ArvoreAVL(){
        this.raiz = null;
    }

    //  Métodos

    //  Limpar Árvore
    public void clear(){
        raiz = null;
    }

    //  Pegar a Raiz
    public No getRaiz(){
        return raiz;
    }

    //  Alterar raiz
    private void setRaiz(No novo){
        this.raiz = novo;
    }

    //  Altura de um NO
    public int height(No temp){
        return temp == null ? -1 : temp.getAltura();
    }

    //  Maior valor
    public int maxHeight(int ladoEsquerdo, int ladoDireito){
        return Math.max(ladoEsquerdo, ladoDireito);
    }

    //  Verificar balanceamento
    public int balanceValue(No temp){
        return height(temp.getEsquerdo()) - height(temp.getDireito());
    }

    //  Balanço
    public No balance(No temp){
        if (balanceValue(temp) == 2){
            if (balanceValue(temp.getEsquerdo()) > 0) {
                System.out.println("DESBALANCEADA!\nROTAÇÃO SIMPLES À DIREITA");
                temp = simpleRightRotation(temp);
            } else {
                System.out.println("DESBALANCEADA!\nROTAÇÃO DUPLA ESQUERDA-DIREITA");
                temp = doubleLeftRightRotation(temp);
            }
        } else if (balanceValue(temp) == -2) {
            if (balanceValue(temp.getDireito()) < 0) {
                System.out.println("DESBALANCEADA!\nROTAÇÃO SIMPLES À ESQUERDA");
                temp = simpleLeftRotation(temp);
            } else {
                System.out.println("DESBALANCEADA!\nROTAÇÃO DUPLA DIREITA-ESQUERDA");
                temp = doubleRightLeftRotation(temp);
            }
        }
        temp.setAltura( maxHeight(height(temp.getEsquerdo()), height(temp.getDireito())) +1);
        return temp;
    }

    //  Rotação Simples Direita
    private No simpleRightRotation(No temp){
        No auxiliar = temp.getEsquerdo();
        temp.setEsquerdo(auxiliar.getDireito());
        auxiliar.setDireito(temp);

        temp.setAltura(maxHeight(height(temp.getEsquerdo()), height(temp.getDireito()))+1);
        auxiliar.setAltura(maxHeight(height(auxiliar.getEsquerdo()), temp.getAltura())+1);

        if (temp == raiz) {
            setRaiz(auxiliar);
            return raiz;
        }
        return auxiliar;
    }

    //  Rotação Simples Esquerda
    private No simpleLeftRotation(No temp){
        No auxiliar = temp.getDireito();
        temp.setDireito(auxiliar.getEsquerdo());
        auxiliar.setEsquerdo(temp);

        temp.setAltura(maxHeight(height(temp.getEsquerdo()), height(temp.getDireito()))+1);
        auxiliar.setAltura(maxHeight(height(auxiliar.getEsquerdo()), temp.getAltura())+1);

        if (temp == raiz) {
            setRaiz(auxiliar);
            return raiz;
        }

        return auxiliar;
    }

    //  Rotação Dupla Esquerda-Direita
    private No doubleLeftRightRotation(No temp){
        temp.setEsquerdo(simpleLeftRotation(temp.getEsquerdo()));
        return simpleRightRotation(temp);
    }

    //  Rotação Dupla Direita-Esquerda
    private No doubleRightLeftRotation(No temp){
        temp.setDireito(simpleRightRotation(temp.getDireito()));
        return  simpleLeftRotation(temp);
    }

    //  Inserir
    public void inserir(int valor){
        No novo = new No(valor);
        if (isEmpty()){
            raiz = novo;
            System.out.println(raiz.getValor() + " É Raiz");
        }else
            inserir(raiz, novo);
    }
    private No inserir(No atual, No novo){
        if (atual == null) atual = novo;
        else if (novo.getValor() < atual.getValor())
            atual.setEsquerdo(inserir(atual.getEsquerdo(), novo));
        else if (novo.getValor() > atual.getValor())
            atual.setDireito(inserir(atual.getDireito(), novo));
        atual = balance(atual);
        return atual;
    }

    //  Altura da árvore
    public int heigthRoot(){
        if (!isEmpty())
            return heigthRoot(raiz);
        return -1;
    }
    private int heigthRoot(No atual){
        if (atual != null){
            int altE = heigthRoot(atual.getEsquerdo());
            int altD = heigthRoot(atual.getDireito());
            if (altE < altD) return altD + 1;
            else return altE + 1;
        }
        return -1;
    }
    
    //  Buscar um No
    public No searchNo(int valor){
        if (isEmpty()) return null;
        else return searchNo(raiz, valor);
    }
    private No searchNo(No temp, int value){
        No found = null;
        if (temp != null){
            if (temp.getValor() == value) return temp;
            else {
                if (value > temp.getValor()) found = searchNo(raiz.getDireito(), value);
                else found = searchNo(raiz.getEsquerdo(), value);
            }
        }
        return found;
    }

    //  Buscar Pai de um No
    public No searchFather(int value){
        if (isEmpty())  return null;
        else return searchFather(raiz, value);
    }
    private No searchFather(No temp, int value){
        No pai = null;
        if (temp != null){
            if (value < temp.getValor()){
                if (temp.getEsquerdo().getValor() == value) return temp;
                else pai = searchFather(temp.getEsquerdo(), value);
            } else {
                if (temp.getDireito().getValor() == value) return temp;
                else pai = searchFather(temp.getDireito(), value);
            }
        }
        return pai;
    }

    //  Exibir árvore
    public void printTree(){
        printTree(raiz);
    }
    private void printTree(No atual){
        if (atual != null){
            System.out.print(atual.getValor() + "(");
            printTree(atual.getEsquerdo());
            printTree(atual.getDireito());
            System.out.print(")");
        }
    }

    //  Verificar se a árvore está vazia
    private boolean isEmpty(){
        return raiz == null;
    }
}