package q06;

public class Servico extends Item {
    private int horas;

    public Servico(String id, String descricao, double valor, int horas) {
        super(id, descricao, valor);
        this.horas = horas;
    }
    
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
}
