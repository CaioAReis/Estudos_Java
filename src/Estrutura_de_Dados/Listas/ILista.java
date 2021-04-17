package Estrutura_de_Dados.Listas;

public interface ILista<T> {
    
    // Adicionar
    void adicionarFim(T o);                       // OK
    void adicionarPosicao(int position, T o);       // OK
    void adicionarInicio(T o);                        // OK
    // Remover
    void removerFim();                               // OK
    void removerPosicao(int position);              // OK
    void removerInicio();                             // OK
    // Pegar Dado
    No<T> get(int position);                       // OK
    // Total de NOs
    int getQtd();                                   // OK
    // Encontrar Dado
    boolean encontrarElemento(T o);                  // OK
    // Listar / Exibir Lista
    void listar();                                  // OK
}
