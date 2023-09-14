package atividade02.questao07.baixo_acoplamento;

public class CarrinhoCompras {
    private final ProvedorProdutos produtos;
    private final CalculadorFrete frete;

    public CarrinhoCompras(ProvedorProdutos produtos, CalculadorFrete frete) {
        this.produtos = produtos;
        this.frete = frete;
    }

    public double calcularTotalPedido() {
        double totalProdutos = produtos.obterTotalProdutos();
        double custoFrete = frete.calcularCustoFrete();

        return totalProdutos + custoFrete;
    }
}

