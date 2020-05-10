package Estrutura_de_Dados.Fila;

public class Element {

    // Atributos

    private Object element;
    private Element proximo;
    private Element anterior;

    // Construtor

    public Element(Object element) {
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

    public Element getProximo() {
        return proximo;
    }

    public void setProximo(Element proximo) {
        this.proximo = proximo;
    }

    public Element getAnterior() {
        return anterior;
    }

    public void setAnterior(Element anterior) {
        this.anterior = anterior;
    }
}
