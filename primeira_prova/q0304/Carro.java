package q0304;

public class Carro {
    double quantidadeCombustivel;
    double capacidadeMaxima = 50; // em litros

    public Carro(double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public double getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void validar(double quantidade) throws CapacidadeError {
        if (this.quantidadeCombustivel >= this.capacidadeMaxima * 0.1) {
            throw new CapacidadeError("Não é necessario abastecer.");
        }
        if ((this.quantidadeCombustivel + quantidade) > this.capacidadeMaxima) {
            throw new CapacidadeError("Capacidade máxima do tanque ultrapassada.");
        }

    }
    public void abastecer(double quantidade) throws CapacidadeError {
        this.validar(quantidade);
        this.quantidadeCombustivel += quantidade;     
    }
}

