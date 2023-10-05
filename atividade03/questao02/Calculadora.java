package questao02;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {
    private final double a; 
    private final double b;
    private List<Operacao> operacoes;

    public Calculadora(List<Operacao> operacoes, double a, double b) {
        this.operacoes = operacoes;
        this.a = a; 
        this.b = b; 
    }

    public List<Double> calcular() {
        List<Double> resultados = new ArrayList<>();

        for (Operacao operacao : operacoes) {
            Double resultado = operacao.executar(a, b);
            resultados.add(resultado);
        }

        return resultados;
    }
}
