# 8ª Questão

O princípio "Tell, Don't Ask" afirma que um método deve tomar
suas próprias decisões, sem precisar de validações externas, o
que é coerente com o mitigamento do acoplamento entre classes,
pois se um método de uma classe consegue ter pleno funcionamento
com menor condicionamento de classes externas, reduz a interdependência.

Um exemplo que demonstra esse princípio é o da questão 7, onde
a correção por uso de interfaces reduz a dependência de instâncias
de classes externas nos métodos do carrinho de compras, focando 
apenas no uso dos métodos dos objetos passados pelo construtor e
evitando o estilo procedural de programação.