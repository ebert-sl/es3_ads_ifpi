package q0304;

class TestaCarro {
    public static void main(String[] args) throws CapacidadeError {
        Carro c = new Carro(4);
        c.abastecer(46);
        System.out.println(c.capacidadeMaxima);
        System.out.println(c.quantidadeCombustivel);
    }
}