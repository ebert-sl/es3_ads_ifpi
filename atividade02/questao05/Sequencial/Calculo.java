package atividade02.questao05.Sequencial;

public class Calculo {
    private double[] numeros;

    public Calculo(double[] numeros) {
        this.numeros = numeros;
    }

    public double calcularMedia() {
        double soma = 0;

        for (int i = 0; i < this.numeros.length; i++) {
            soma += numeros[i];
        }

        return soma / this.numeros.length;
    } 
 
    public double calcularDesvioPadrão() { 
        double media = calcularMedia(); // utiliza outro método pra calcular a média
        double somaQuadrados = 0;

        for (int i = 0; i < this.numeros.length; i++) {
            somaQuadrados += Math.pow(numeros[i] - media, 2);
        }
        
        return Math.pow(somaQuadrados / this.numeros.length, 0.5);
    }  
}
