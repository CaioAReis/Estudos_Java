package Estrutura_de_Dados.Listas;

public class No<T> {
    
    // Atributos
    
    private T element;
    private No<T> proximo;
    private No<T> anterior; // Apenas para Listas Duplamente Encadeada!

// Construtor
    
    public No(T element) {
        this.element = element;
        proximo = null;
        anterior = null;
    }
    
    // Metodos Especiais
    
    public T getElement() {
        return element;
    }

   public void setElement(T element) { 
       this.element = element;
   }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public No<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(No<T> anterior) {
        this.anterior = anterior;
    }

}
