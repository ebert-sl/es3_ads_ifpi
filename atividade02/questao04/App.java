package atividade02.questao04;

public class App {
    public static void main(String[] args) {
        OrdemPalavras test = new OrdemPalavras(new String[]{"C", "A", "E", "D", "B"});
        test.ordenar();
        test.embaralhar();

        Calculo test2 = new Calculo(new double[]{10000, 30000, 90000, 30000});
        System.out.println(test2.calcularMedia());
        System.out.println(test2.calcularDesvioPadrão());

        FormatarPalavras test3 = new FormatarPalavras("    Teste de   Varias  Palavras  ");
        System.out.println(test3.removerEspacos());
        System.out.println(test3.quebrarEmPalavras());
    }   
}
