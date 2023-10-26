package q01;

public class ProcessarPedido {
    public void processarPedido(Cliente cliente, Pedido pedido) {
        cliente.getPedidos().add(pedido);
        pedido.calcularDesconto();
    }
}
