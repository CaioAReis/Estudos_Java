package POO.LojaHS;

import java.util.Arrays;

public class Loja {
    //  Atributos
    private Pedido[] pedidos;
    private int qtdPedidos;

    //  Construtor
    public Loja(){
        this.pedidos = new Pedido[10];
        this.qtdPedidos = 0;
    }

    //  Metodos
    public boolean existePedido(Pedido pedido){
        if (qtdPedidos > 0){
            for (int i = 0; i < qtdPedidos; i++){
                if (pedidos[i].equals(pedido)) return true;
            }
        }
        return false;
    }

    public int buscarPedido(Pedido pedido){
        for (int i = 0; i < qtdPedidos; i++){
            if (pedidos[i].equals(pedido)) return pedidos[i].getNumero();
        }
        return 0;
    }

    public boolean cadastrarPedido(Pedido pedido){
        if (qtdPedidos < pedidos.length){
            pedidos[qtdPedidos] = pedido;
            qtdPedidos++;
            return true;
        }
        return false;
    }

    public Pedido removerPedido(Pedido pedido){
        for (int i = 0; i < qtdPedidos; i++){
            if (pedidos[i].equals(pedido)){
                Pedido removido = pedidos[i];
                pedidos[i] = pedidos[qtdPedidos - 1];
                qtdPedidos--;
                return removido;
            }
        }
        return null;
    }

    public Pedido consultarPedido(int id){
        for (int i = 0; i < qtdPedidos; i++) {
            if (pedidos[i].getNumero() == id) return pedidos[i];
        }
        return null;
    }

    public Pedido[] listarPedidos(){
        return pedidos;
    }

    public Pedido[] listarPedidosComSoftware(){
//        Pedido[] pedidosComSoftware = new Pedido[10];
//        for (int i = 0; i < qtdPedidos; i++){
//            if (pedidos[i]. instanceof Software)
//        }
        return null;
    }

    public Pedido listarPedidosDeHardwareMaisCaro() {
        return null;
    }

    public Pedido[] listarPedidosDeHardwareDoCliente(Cliente cliente){
        return null;
    }

    public Pedido listarPedidoMaisBaratoDoCliente(Cliente cliente){
        return null;
    }

    @Override
    public String toString() {
        return "Loja{" +
                "pedidos=" + Arrays.toString(pedidos) +
                ", qtdPedidos=" + qtdPedidos +
                '}';
    }
}
