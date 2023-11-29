# Questão 7

Pode-se ter como exemplo um sistema com persistência em banco de dados, em que 
depende do MySQL em sua construção. Só que ao ocorrer a necessidade de mudança 
do sistema do banco (exemplo: PostgreSQL), essa dependência anterior com o MySQL 
torna-se problemática, devendo alterar o código para se adaptar ao novo sistema, 
e isso pode vir a ser problema novamente se precisar de mais mudanças. Isso pode
ser resolvido se houver o uso de interface para a persistência em banco, ou seja, 
não precisaria implementar diretamente no sistema qual banco vai usar, mas usufruir
da abstração da interface e implementar a partir dela qualquer banco que desejar.