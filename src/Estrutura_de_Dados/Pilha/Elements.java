package Estrutura_de_Dados.Pilha;

public class Elements {

    // Atributos

    private Object element;
    private Elements proximo;
    private Elements anterior;

    // Construtor

    public Elements(Object element) {
        this.element = element;
        this.proximo = null;
        this.anterior = null;
    }

    // Metodos

    public Object getElement() {
        return element;
    }

//    public void setElement(Object element) {
//        this.element = element;
//    }

    public Elements getProximo() {
        return proximo;
    }

    public void setProximo(Elements proximo) {
        this.proximo = proximo;
    }

    public Elements getAnterior() {
        return anterior;
    }

    public void setAnterior(Elements anterior) {
        this.anterior = anterior;
    }
}
