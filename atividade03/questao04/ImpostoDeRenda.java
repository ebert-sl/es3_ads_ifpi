package questao04;

import java.util.List;
import java.util.Arrays;

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
    
    public void processar() throws ValidacaoException {
        VerificarCPFNuloVazio cpfNuloVazio = new VerificarCPFNuloVazio();
        VerificarCPFCaracteres cpfCaracteres = new VerificarCPFCaracteres();
        VerificarValoresRendimentoDespesa valoresRendDesp = new VerificarValoresRendimentoDespesa();
        VerificarQuantidadeRendimento quantRend = new VerificarQuantidadeRendimento();
        
        ValidacaoImpostoDeRenda validacao = new ValidacaoImpostoDeRenda(
            Arrays.asList(cpfNuloVazio, cpfCaracteres, valoresRendDesp, quantRend)
        );
        validacao.validarImposto(this);

        CalculadoraImpostoDeRenda calculadora = new CalculadoraImpostoDeRenda(); 
        double impostoDevido = calculadora.calcularImposto(rendimentos, despesas); 
         
        RelatorioImpostoRenda relatorio = new RelatorioImpostoRenda(); 
        relatorio.gerarRelatorio(this, impostoDevido); 
    }
}
