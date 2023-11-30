# Jogo de Adivinhação de Palavras em Java - Documentação

## 1. Objetivo do Projeto:

O objetivo deste projeto foi criar um jogo simples de adivinhação de palavras em Java. O jogo apresenta uma palavra aleatória ao jogador, que tenta adivinhar a palavra em um número limitado de tentativas.

## 2. Estruturas de Dados:

Array de Palavras: Um array foi utilizado para armazenar as palavras possíveis para a adivinhação. Isso proporciona simplicidade e eficiência no acesso aleatório às palavras.

Array de Caracteres (char): Um array de caracteres foi usado para representar a palavra a ser adivinhada e a palavra de tentativa do jogador. Essa escolha permite manipular individualmente cada caractere da palavra.

Boolean Array: Para acompanhar os acertos na adivinhação, um array de booleanos foi utilizado. Cada posição no array indica se o caractere correspondente na palavra foi adivinhado corretamente.

## 3. Algoritmos e Justificativas:

Escolha Aleatória de Palavra: A escolha aleatória da palavra para adivinhar foi implementada usando a classe Random em Java. Isso proporciona uma distribuição uniforme e eficiente na escolha das palavras.

Verificação de Acertos: O jogo verifica os acertos na adivinhação comparando os caracteres da palavra do jogador com a palavra a ser adivinhada. A abordagem de comparação direta é eficiente, pois tem complexidade O(n), onde n é o comprimento da palavra.

Feedback ao Jogador: O jogo fornece feedback ao jogador sobre letras corretas na posição correta e letras corretas em posições diferentes. Isso é feito de maneira eficiente, iterando sobre os caracteres da palavra.

## 4. Utilização de Estruturas de Dados em Memória:

O jogo utiliza estruturas de dados em memória para armazenar e manipular informações durante a execução. Os arrays de palavras, caracteres e booleanos são alocados na memória durante a execução do programa. A manipulação dessas estruturas em tempo de execução permite o gerenciamento eficiente dos dados do jogo.

## Conclusão:

O projeto do jogo de adivinhação de palavras em Java foi desenvolvido com base em escolhas que buscam eficiência e simplicidade. As estruturas de dados e algoritmos escolhidos permitem uma experiência de jogo suave e responsiva para o jogador. A utilização de estruturas de dados em memória oferece uma abordagem eficiente para gerenciar o estado do jogo durante a execução.
