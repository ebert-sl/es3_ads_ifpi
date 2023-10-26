package q01;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        System.out.println("Entrou");
        Pedido pedido = new Pedido(1000.00);
        Cliente cliente = new Cliente("Teste", new ArrayList<>());
        
        ProcessarPedido processamento = new ProcessarPedido();
        processamento.processarPedido(cliente, pedido);

        List<Pedido> pedidos = cliente.getPedidos();
        for (Pedido p: pedidos) {
            System.out.println(p.getValorTotal());
        }
    }
}
