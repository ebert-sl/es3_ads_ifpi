package q06;

public class Produto extends Item {
    private double taxa;

    public Produto(String id, String descricao, double valor, double taxa) {
        super(id, descricao, valor);
        this.taxa = taxa;
    }
    
    public double getTaxa() {
        return taxa;
    }
    
    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }
}
