package questao03;

import java.util.List;

public class ImpostoDeRenda {
    private String cpfContribuinte; 
    private List<Double> rendimentos; 
    private List<Double> despesas; 
 
    public ImpostoDeRenda(String cpfContribuinte,  List<Double> rendimentos,  List<Double> despesas) { 
        this.cpfContribuinte = cpfContribuinte; 
        this.rendimentos = rendimentos; 
        this.despesas = despesas; 
    }

    public String getCPF() {
        return this.cpfContribuinte;
    }

    public List<Double> getRendimentos() {
        return this.rendimentos;
    }

    public List<Double> getDespesas() {
        return this.despesas;
    }
    
    public void processar() {
        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda(); 
        double impostoDevido = calculadora.calcularImposto(rendimentos, despesas); 
         
        RelatorioImpostoRenda relatorio = new RelatorioImpostoRenda(); 
        relatorio.gerarRelatorio(this, impostoDevido); 
    }
}
