package Arvore;

public class Arvore {

  No raiz;

  public Arvore() {

  }

  public void adicionar(int valor) {
    this.raiz = adicionar(raiz, valor);
  }

  private No adicionar(No atual, int valor) {
    if (atual == null)
      return new No(valor);

    if (valor < atual.valor)
      atual.esquerda = adicionar(atual.esquerda, valor);
    else if (valor > atual.valor)
      atual.direita = adicionar(atual.direita, valor);
    else
      return atual;
    return atual;
  }

  public No buscarValor(int valor) {
    return buscarValor(raiz, valor);
  }

  private No buscarValor(No atual, int valor) {
    if (atual != null) {
      if (valor == atual.valor) return atual;
      else if (valor > atual.valor) return buscarValor(atual.direita, valor);
      else if (valor < atual.valor) return buscarValor(atual.esquerda, valor);
      else return null;
    }
    return null;
  }

  public void preOrdem() {
    preOrdem(raiz);
  }

  public void emOrdem() {
    emOrdem(raiz);
  }

  public void posOrdem() {
    posOrdem(raiz);
  }

  private void preOrdem(No atual) {
    if (atual != null) {
      System.out.print(" " + atual.valor);
      preOrdem(atual.esquerda);
      preOrdem(atual.direita);
    }
  }

  private void emOrdem(No atual) {
    if (atual != null) {
      emOrdem(atual.esquerda);
      System.out.print(" " + atual.valor);
      emOrdem(atual.direita);
    }
  }

  private void posOrdem(No atual) {
    if (atual != null) {
      emOrdem(atual.esquerda);
      emOrdem(atual.direita);
      System.out.println(" " + atual.valor);
    }
  }

  public static void main(String[] args) {
    Arvore a = new Arvore();

    a.adicionar(1);
    a.adicionar(3);
    a.adicionar(6);
    a.adicionar(2);
    a.adicionar(4);
    a.adicionar(7);
    a.adicionar(9);

    System.out.print("\n\nEm Ordem: ");
    a.emOrdem();

    System.out.print("\nPré-Ordem: ");
    a.preOrdem();

    System.out.print("\nPós-Ordem: ");
    a.posOrdem();
  }
}
