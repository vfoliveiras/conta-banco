# Controle de Fluxo com Loop e Exceções Personalizadas.

Nesta resolução de desafio, utilizei as habilidades adquiridas em controle de fluxo em Java para criar um programa que realiza uma contagem controlada a partir de dois números inteiros fornecidos via terminal. Para isso, desenvolvi um projeto que demonstra a aplicação de conceitos como entrada de dados, uso de loops `for` e tratamento de exceções personalizadas.

A classe `Contador.java` é a peça central dessa implementação. Através dela, é possível inserir os parâmetros de entrada e observar o programa executar a contagem, imprimindo os números incrementados no console. Uma das inovações é o uso do loop `for` para percorrer os valores e realizar a contagem de forma eficiente.

Ao mesmo tempo, a resolução abrange o tratamento de uma situação especial: quando o primeiro parâmetro é maior que o segundo. Utilizei uma exceção customizada chamada `ParametrosInvalidosException` para lidar com esse caso, de acordo com as diretrizes do desafio.

Além disso, adicionei um refinamento extra à solução. Quando o primeiro parâmetro é inválido, o código entra em um loop `do-while`, permitindo que o usuário insira novamente os valores até que a condição seja satisfeita. Isso garante que apenas valores válidos sejam utilizados para a contagem.

A resolução deste desafio me proporcionou a oportunidade de consolidar meus conhecimentos em controle de fluxo, aplicando-os a um contexto real. Ao utilizar loops, exceções personalizadas e estruturas de repetição, pude aprimorar minha habilidade em criar programas mais robustos e interativos em Java.