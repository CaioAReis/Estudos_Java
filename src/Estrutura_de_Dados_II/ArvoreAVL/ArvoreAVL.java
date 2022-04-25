package ArvoreAVL;

public class ArvoreAVL {
    //  Atributo
    private No raiz;

    //  Construtor
    public ArvoreAVL(){
        this.raiz = null;
    }

    //  Métodos

    //  Pegar a Raiz
    public No getRaiz(){
        return raiz;
    }

    //  Alterar raiz
    private void setRaiz(No novo){
        this.raiz = novo;
    }

    //  Limpar Árvore
    public void clear(){
        raiz = null;
    }

    //  Altura de um NO
    public int height(No temp){
        return temp == null ? -1 : heigthRoot(temp);
    }

    //  Maior valor
    public int maxHeight(int ladoEsquerdo, int ladoDireito){
        return Math.max(ladoEsquerdo, ladoDireito);
    }

    //  Verificar valor para o tipo de balanceamento
    public int balanceValue(No temp){
        return heigthRoot(temp.getEsquerdo()) - heigthRoot(temp.getDireito());
    }

    //  Balanceamento
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

    //  Inserir um novo NO
    public void add(int value){
        No novo = new No(value);
        if (isEmpty()){
            raiz = novo;
            System.out.println(raiz.getValor() + " É Raiz");
        }else
            add(raiz, novo);
    }
    private No add(No temp, No novo){
        if (temp == null) temp = novo;
        else if (novo.getValor() < temp.getValor())
            temp.setEsquerdo(add(temp.getEsquerdo(), novo));
        else if (novo.getValor() > temp.getValor())
            temp.setDireito(add(temp.getDireito(), novo));
        temp = balance(temp);
        return temp;
    }

    //  Remover um NO
    public void remove(int value){
        No removed = searchNo(value);
        if (isEmpty()) System.out.println("Árvore vazia!");
        else if (removed == null) System.out.println("Valor não encontrado");
        else if (removed == raiz) remove(removed, null);
        else {
            No father = searchFather(value);
            remove(removed, father);
        }
    }
    private boolean remove(No removed, No father){
        No substituto, paiSubstituto, avo;
        //  Se o No a ser removido for a RAIZ
        if (removed == raiz){
            substituto = buscarSubstituto(removed.getEsquerdo());
            paiSubstituto = searchFather(substituto.getValor());
            if (paiSubstituto != removed){
                paiSubstituto.setDireito(substituto.getEsquerdo());
                substituto.setEsquerdo(removed.getEsquerdo());
            }
            substituto.setDireito(removed.getDireito());
            raiz = balance(substituto);
            return true;
        }
        //  Se o No a ser removido for uma folha
        if (!removed.existeEsquerdo() && !removed.existeDireito()){
            if (father.getEsquerdo() == removed) father.setEsquerdo(null);
            else father.setDireito(null);
            if (father != raiz){
                avo = searchFather(father.getValor());
                if (avo.getEsquerdo() == father) avo.setEsquerdo(balance(father));
                else avo.setDireito(balance(father));
            } else father = balance(father);
            return true;
        }
        //  Se o No a ser removido tiver apenas um filho
        if (!removed.existeEsquerdo() || !removed.existeDireito()){
            if (father.getEsquerdo() == removed){
                if (removed.existeEsquerdo()) father.setEsquerdo(removed.getEsquerdo());
                else father.setEsquerdo(removed.getDireito());
            } else {
                if (removed.existeEsquerdo()) father.setDireito(removed.getEsquerdo());
                else father.setDireito(removed.getDireito());
            }
            father = balance(father);
            return true;
        }
        //  Se o No a ser removido tiver dois filhos
        if (removed.existeEsquerdo() && removed.existeDireito() && removed != raiz){
            substituto = buscarSubstituto(removed.getEsquerdo());
            paiSubstituto = searchFather(substituto.getValor());
            if (paiSubstituto != removed){
                paiSubstituto.setDireito(substituto.getEsquerdo());
                substituto.setEsquerdo(removed.getEsquerdo());
            }
            substituto.setDireito(removed.getDireito());
            if (father.getEsquerdo() == removed) father.setEsquerdo(substituto);
            else father.setDireito(substituto);
            father = balance(father);
            return true;
        }
        return false;
    }

    //  Buscar NO substituto - método auxiliar p/ o método de remoção
    private No buscarSubstituto(No temp){
        if (temp.existeDireito()) temp = buscarSubstituto(temp.getDireito());
        return temp;
    }

    //  Altura da árvore
    public int heigthRoot(){
        if (!isEmpty())
            return heigthRoot(raiz);
        return -1;
    }
    private int heigthRoot(No temp){
        if (temp != null){
            int altE = heigthRoot(temp.getEsquerdo());
            int altD = heigthRoot(temp.getDireito());
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
                if (value > temp.getValor()) found = searchNo(temp.getDireito(), value);
                else found = searchNo(temp.getEsquerdo(), value);
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
        No father = null;
        if (temp != null){
            if (value < temp.getValor()){
                if (temp.getEsquerdo().getValor() == value) return temp;
                else father = searchFather(temp.getEsquerdo(), value);
            } else {
                if (temp.getDireito().getValor() == value) return temp;
                else father = searchFather(temp.getDireito(), value);
            }
        }
        return father;
    }

    //  Exibir árvore
    public void printTree(){
        printTree(raiz);
    }
    private void printTree(No temp){
        if (temp != null){
            System.out.print(temp.getValor() + "(");
            printTree(temp.getEsquerdo());
            printTree(temp.getDireito());
            System.out.print(")");
        }
    }

    //  Verificar se a árvore está vazia
    private boolean isEmpty(){
        return raiz == null;
    }
}