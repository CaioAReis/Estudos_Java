package Estrutura_de_Dados_II.ArvoreAVL;

public class ArvoreAVL {
    //  Atributo
    private No raiz;

    //  Construtor
    public ArvoreAVL(){
        this.raiz = null;
    }

    //  Métodos

    //  Inserção
    public void inserir(int valor){
        No novo = new No(valor);
        if (isEmpty()){
            raiz = novo;
            System.out.println(raiz.getValor() + " É Raiz");
        }else
            inserir(raiz, novo);
    }

    private void inserir(No atual, No novo){
        if (novo.getValor() > atual.getValor()){
            if (atual.existeDireito()) {
                System.out.println(novo.getValor() + " ADICIONADO À DIREITA DE " + atual.getValor());
                atual.setDireito(novo);
            }else
                inserir(atual.getDireito(), novo);
            //  Verificar balanceamento
            if (altura(atual.getDireito())-altura(atual.getEsquerdo())==2){
                if (novo.getValor() > atual.getDireito().getValor()){
                    System.out.println("DESBALANCEADA!!\nRotação SIMPLES à esquerda.");
                    atual = rotacaoEsquerda(atual);
                }else{
                    System.out.println("DESBALANCEADA!!\nRotação DUPLA direita-esquerda.");
                    atual = rotacaoDireitaEsquerda(atual);
                }
            }
        } else {
            if (atual.existeEsquerdo()){
                System.out.println(novo.getValor() + " ADICIONADO À ESQUERDA DE " + atual.getValor());
                atual.setEsquerdo(novo);
            }else
                inserir(atual.getEsquerdo(), novo);
            //  Verificar balancamento
            if (altura(atual.getEsquerdo())-altura(atual.getDireito())==2){
                if (novo.getValor() < atual.getEsquerdo().getValor()) {
                    System.out.println("DESBALANCEADA!!\nRotação SIMPLES à direita.");
                    atual = rotacaoDireita(atual);
                }else {
                    System.out.println("DESBALANCEADA!!\nRotação DUPLA esquerda-direita.");
                    atual = rotacaoEsquerdaDireita(atual);
                }
            }
        }
        atual.setAltura(max(altura(atual.getEsquerdo()),altura(atual.getDireito()))+1);
    }


    //  ROTAÇÕES
        //  DIREITA
    private No rotacaoDireita(No atual){
        No auxiliar = atual.getEsquerdo();
        atual.setEsquerdo(auxiliar.getDireito());
        auxiliar.setDireito(atual);

        atual.setAltura(max(altura(atual.getDireito()),altura(atual.getEsquerdo()))+1);
        auxiliar.setAltura(max(altura(auxiliar.getEsquerdo()),atual.getAltura())+1);
        return atual;
    }

        //  ESQUERDA
    private No rotacaoEsquerda(No atual){
        No auxiliar = atual.getDireito();
        atual.setDireito(auxiliar.getEsquerdo());
        auxiliar.setEsquerdo(atual);

        atual.setAltura(max(altura(atual.getDireito()),altura(atual.getEsquerdo()))+1);
        auxiliar.setAltura(max(altura(auxiliar.getDireito()),atual.getAltura())+1);
        return atual;
    }

        //  ESQUERDA-DIREITA
    private No rotacaoEsquerdaDireita(No atual){
        atual.setEsquerdo(rotacaoEsquerda(atual.getEsquerdo()));
        return rotacaoDireita(atual);
    }

        //  DIREITA-ESQUERDA
    private No rotacaoDireitaEsquerda(No atual){
        atual.setDireito(rotacaoDireita(atual.getDireito()));
        return rotacaoEsquerda(atual);
    }

    private int max(int a, int b){
        if (a < b) return a;
        return b;
    }

    //  Altura
    public int altura(){
        if (!isEmpty())
            return altura(raiz);
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

    private boolean isEmpty(){
        return raiz==null;
    }
}
