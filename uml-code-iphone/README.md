# Projeto iPhone - Diagramação UML e Código em Java

![screen](https://t2.tudocdn.net/638725?w=1920)

Este projeto tem como objetivo criar a modelagem e diagramação em **UML** de um iPhone, representando suas funcionalidades principais, como **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**. Além disso, o projeto inclui a implementação em **Java** das interfaces e classes correspondentes.

## Motivação

A motivação por trás deste projeto é aprender e demonstrar conceitos de modelagem **UML**, **POO** e como **interfaces** podem ser usadas para representar comportamentos específicos em um objeto.

## Diagrama UML

Aqui está a representação visual do diagrama UML que descreve as interfaces e as relações entre elas:

![screen](https://uploaddeimagens.com.br/images/004/600/673/full/Diagrama_em_branco_%281%29.png?1694102093)

## Implementação

A implementação do projeto inclui as seguintes interfaces e classe:

- `ReprodutorMusical`: Interface que define métodos relacionados à reprodução de música.
- `AparelhoTelefonico`: Interface que define métodos relacionados às funcionalidades de telefone.
- `NavegadorInternet`: Interface que define métodos relacionados à navegação na Internet.
- `Iphone`: Classe que implementa as interfaces acima e representa um iPhone com todas essas funcionalidades.

## Exemplo de Uso

Aqui está um exemplo de como usar a classe Iphone para testar as funcionalidades:

```
public static void main(String[] args) {
    Iphone iphone = new Iphone();

    // Testando o Reprodutor Musical
    iphone.tocarMusica();
    iphone.pausarMusica();
    iphone.selecionarMusica();

    // Testando o Aparelho Telefônico
    iphone.fazerLigacao();
    iphone.atenderChamada();
    iphone.iniciarCorreioVoz();

    // Testando o Navegador
    iphone.exibirPagina();
    iphone.adicionarAba();
    iphone.atualizarPagina();
}
```

## Conclusão

Neste desafio, criei um modelo de iPhone com suas principais funcionalidades usando **UML** e implementei esse modelo em **Java**. Primeiro, defini três interfaces: `ReprodutorMusical`, `AparelhoTelefonico` e `NavegadorInternet`. Depois, implementei essas interfaces em uma classe chamada `Iphone`, onde adicionei as funcionalidades específicas de cada uma delas.

Para ter certeza de que tudo estava funcionando como deveria, fiz alguns testes simples para verificar se as funcionalidades estavam corretas. Este desafio foi uma ótima oportunidade para praticar **programação orientada a objetos** e **Modelagem UML**, resultando em um projeto funcional e bem estruturado.