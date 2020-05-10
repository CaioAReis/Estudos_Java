package Estrutura_de_Dados.Listas;

public interface ILista {
    
    // Adicionar
    void adicionarFim(Object o);                       // OK
    void adicionarPosicao(int position, Object o);       // OK
    void adicionarInicio(Object o);                        // OK
    // Remover
    void removerFim();                               // OK
    void removerPosicao(int position);              // OK
    void removerInicio();                             // OK
    // Pegar Dado
    No get(int position);                       // OK
    // Total de NOs
    int getQtd();                                   // OK
    // Encontrar Dado
    boolean encontrarElemento(Object o);                  // OK
    // Listar / Exibir Lista
    void listar();                                  // OK
}
