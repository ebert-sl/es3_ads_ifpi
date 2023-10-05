package questao02;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        Calculadora calculadora = new Calculadora(Arrays.asList(soma, subtracao, multiplicacao, divisao), 1, 2);
        System.out.println(calculadora.calcular());
    }
}
