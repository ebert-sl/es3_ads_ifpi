# 2ª Questão

De acordo com o livro "Clean Code", a coesão é importante para reduzir o risco
na adição de novas funcionalidades e manutenção do código, pois criar classes 
com responsabilidades bem definidas, separando-as de acordo com sua função, 
possuindo acoplamento saudável, garante ao desenvolvedor mais segurança em 
alterar ou adicionar modificações sem causar grande comprometimento no 
sistema. Uma dica fornecida pelo autor é observar se o método não utiliza 
todos os atributos da classe e analisar a codependência com outros métodos, 
pois em caso de coesão fragilizada é possível criar uma nova classe que se 
encarregue desse método.

Complementando a definição de coesão, Leandro Luque citou em seu artigo "Coesão e 
Acoplamento em Sistemas Orientados a Objetos", publicado em Março de 2010, 
seis tipos de coesão, sendo três para classes e outros três para métodos,
propostos por Meilir Page-Jones:

- Coesão de Classes:
    - Instância mista - a classe possui características misturadas com definição má executada
    - Domínio misto - a classe une diferentes domínios (de arquitetura, de negócio, etc) que
    podem ser independentes
    - Papel misto - a classe atua em diferentes funções que podem ser independentes
- Coesão de Métodos:
    - Alternada - o método trabalha com funções que alternam a depender do parâmetro fornecido
    - Múltipla - o método é encarregado de diversas funções codependentes
    - Funcional - o método é definido com apenas uma função

Por fim, o livro "Orientação a Objetos e SOLID para Ninjas" cita sobre Single 
Responsibility Principle (SRP), que é o princípio que propõe a definição de 
uma única responsabilidade para cada classe, trabalhando com os conceitos já 
citados anteriormente quanto o papel da coesão na manutenção de classes e do sistema.