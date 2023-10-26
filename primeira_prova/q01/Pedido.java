package q01;
public class Pedido {
    private double valorTotal;

    public Pedido(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public double calcularDesconto() {
        return this.getValorTotal() * 0.1;
    }
}
