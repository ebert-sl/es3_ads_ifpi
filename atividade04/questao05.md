# 5ª Questão

Nos meus exemplos, o mais adequado seria modificar a lógica da herança.

No caso da questão 03, poderia tornar a emissão de som uma interface, enquanto
a herança trabalharia com a lógica de classificação de cada animal, algo parecido
com o que será trabalhado na questão 04.

Quanto a questão 04, haverá duas novas classes: VeiculoMotorizado e 
VeiculoNaoMotorizado, ambas herdando de Transporte. Motor já não estaria mais
atrelado a Transporte, e sim a VeiculoMotorizado, e Carro herdaria de
VeiculoMotorizado, enquanto Bicicleta herdará de VeiculoNaoMotorizado.