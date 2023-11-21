Pois ContaPoupanca está modificando um comportamento do método herdado "sacar",
lançando uma exceção em que a classe original não é ciente, quebrando a lógica
do Princípio de Substituição de Liskov. Para resolver isso, o ideal é utilizar composição.