# Descrição
O projeto consiste na implementação de testes de unidade para a disciplina de Engenharia de Software 1 da Universidade Federal de São Carlos.
Este código contem classes que simulam o funcionamento de um mercado, com as funções de adicionar um produto, consultar seu preço, verificar estoque e realizar uma venda.
Os testes combrem as 4 classes: Produto, Estoque, Mercado e Simulador Mercado.

# Como utilizar:

#### Importante
Para utilizar é necessário ter instalado em sua máquina o Java Vesão 17 e o Maven!

Para rodar os testes basta clonar o repositório, navegar até a pasta ./JUnityTests-ES1 e rodar o comando:

```shell
mvn test
```

Para usar o sistema utilize o comando:

```shell
mvn package
```

em seguida navegue até a pasta /JUnityTests-ES1/target e rode:

```shell
java -jar JUnityTests-ES1-1.0.jar 
```
