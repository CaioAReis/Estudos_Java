package Estrutura_de_Dados.Listas;

public class No {
    
    // Atributos
    
    private Object element;
    private No proximo;
    private No anterior; // Apenas para Listas Duplamente Encadeada!

// Construtor
    
    public No(Object element) {
        this.element = element;
        proximo = null;
        anterior = null;
    }
    
    // Metodos Especiais
    
    public Object getElement() {
        return element;
    }

//    public void setElement(Object element) { 
//        this.element = element;
//    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

}
