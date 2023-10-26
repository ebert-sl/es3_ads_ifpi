package q06;

public class Doacao extends Item {
    private double bonus;

    public Doacao(String id, String descricao, double valor, double bonus) {
        super(id, descricao, valor);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}