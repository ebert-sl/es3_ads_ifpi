package atividade02.questao07.alto_acoplamento;

public class CarrinhoCompras {
    public double calcularTotalPedido() {
        Produtos produtos = new Produtos();
        double totalProdutos = produtos.obterTotalProdutos();

        Frete frete = new Frete();
        double custoFrete = frete.calcularCustoFrete();

        return totalProdutos + custoFrete;
    }
}
