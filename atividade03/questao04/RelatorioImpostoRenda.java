package questao04;

public class RelatorioImpostoRenda {
    public void gerarRelatorio(ImpostoDeRenda impostoDeRenda, double impostoDevido) { 
        System.out.println("CPF: " + impostoDeRenda.getCPF()); 
        System.out.println("Rendimentos: " + impostoDeRenda.getRendimentos()); 
        System.out.println("Despesas: " + impostoDeRenda.getDespesas()); 
        System.out.println("Imposto Devido: " + impostoDevido);
    }
}
