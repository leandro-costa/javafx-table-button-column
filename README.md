# Projeto JavaFX com Tabela e Coluna de Botões

## Descrição

Este projeto demonstra como implementar uma aplicação JavaFX que exibe uma tabela de dados com uma coluna contendo botões de ação. O exemplo específico mostra uma tabela de boletos bancários com a possibilidade de realizar a ação de "Pagar" para cada item da lista.

## Funcionalidades

- Exibição de dados em formato de tabela usando TableView do JavaFX
- Implementação de coluna personalizada com botões de ação
- Interação com os dados através de alertas ao clicar nos botões

## Estrutura do Projeto

O projeto é composto por:

- Classe Boleto: modelo de dados para representar um boleto bancário
- Classe HelloController: controlador principal da aplicação que gerencia a interface e as interações

## Como Funciona
A aplicação carrega uma lista de boletos e os exibe em uma tabela com três colunas:

1. Credor: nome do credor do boleto
1. Valor: valor monetário do boleto
1. Ações: coluna contendo um botão "Pagar" para cada boleto

Ao clicar no botão "Pagar", um alerta é exibido com informações sobre o boleto selecionado, simulando uma ação de pagamento.

Implementação Técnica
A implementação da coluna de botões é feita através de uma classe interna `BotaoAcaoCell` que estende `TableCell`. Esta abordagem permite personalizar o conteúdo de cada célula da coluna, adicionando um botão com um evento de clique associado.

## Como Executar

Clone o repositório

```shell
mvn
```

## Conclusão 

Este projeto serve como um exemplo didático de como implementar funcionalidades interativas em tabelas JavaFX, especialmente útil para aplicações que necessitam de ações específicas para cada item em uma lista.