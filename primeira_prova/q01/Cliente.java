package q01;
import java.util.List;
public class Cliente {
    private String nome;
    private List<Pedido> pedidos;

    public Cliente(String nome, List<Pedido> pedidos) {
        this.nome = nome;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return nome;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}

