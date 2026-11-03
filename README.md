# Estruturas de Controle e Arrays em Java

Atividade de pesquisa/código da disciplina **Elicitação e Programação** (Engenharia de Software, UNICEPLAC).

**Autor:** Marcus Vinícius da Silva Neves Barros  
**RA:** 0028613

São 36 exemplos em Java, 6 para cada um dos 6 temas: `if`, `switch`, `while`, `do while`, `for` e arrays. Cada programa é comentado e exibe o nome e o RA do aluno ao ser executado.

## Estrutura do projeto

```
java-estruturas-de-controle/
├── src/
│   └── MarcusViniciusBarros/   # pacote com os 36 exercícios
├── .classpath / .project       # arquivos do projeto Eclipse
└── README.md
```

Padrão dos nomes das classes: `MVBarros_<TEMA>_Ex<NN>_0028613` (por exemplo, `MVBarros_IF_Ex01_0028613`).

## Exercícios

### Estrutura de decisão `if`

| Nº | Enunciado | Código |
|----|-----------|--------|
| 01 | Criar um programa que verifique se uma pessoa é maior de idade. | [`MVBarros_IF_Ex01_0028613.java`](src/MarcusViniciusBarros/MVBarros_IF_Ex01_0028613.java) |
| 02 | Criar um programa que verifique se um número é positivo. | [`MVBarros_IF_Ex02_0028613.java`](src/MarcusViniciusBarros/MVBarros_IF_Ex02_0028613.java) |
| 03 | Criar um programa que verifique se um aluno foi aprovado com nota igual ou superior a 7. | [`MVBarros_IF_Ex03_0028613.java`](src/MarcusViniciusBarros/MVBarros_IF_Ex03_0028613.java) |
| 04 | Criar um programa que verifique se um número é par. | [`MVBarros_IF_Ex04_0028613.java`](src/MarcusViniciusBarros/MVBarros_IF_Ex04_0028613.java) |
| 05 | Criar um programa que verifique se uma pessoa possui idade suficiente para votar, considerando a regra de idade definida no exercício. | [`MVBarros_IF_Ex05_0028613.java`](src/MarcusViniciusBarros/MVBarros_IF_Ex05_0028613.java) |
| 06 | Criar um programa que verifique se uma senha digitada corresponde à senha cadastrada. | [`MVBarros_IF_Ex06_0028613.java`](src/MarcusViniciusBarros/MVBarros_IF_Ex06_0028613.java) |

### Estrutura de decisão `switch`

| Nº | Enunciado | Código |
|----|-----------|--------|
| 07 | Criar um programa que apresente o dia da semana conforme um número de 1 a 7. | [`MVBarros_SWITCH_Ex07_0028613.java`](src/MarcusViniciusBarros/MVBarros_SWITCH_Ex07_0028613.java) |
| 08 | Criar um programa que apresente o nome de um mês conforme um número de 1 a 12. | [`MVBarros_SWITCH_Ex08_0028613.java`](src/MarcusViniciusBarros/MVBarros_SWITCH_Ex08_0028613.java) |
| 09 | Criar um programa que simule um menu de opções: cadastrar, consultar e sair. | [`MVBarros_SWITCH_Ex09_0028613.java`](src/MarcusViniciusBarros/MVBarros_SWITCH_Ex09_0028613.java) |
| 10 | Criar um programa que identifique o turno de estudo: matutino, vespertino ou noturno. | [`MVBarros_SWITCH_Ex10_0028613.java`](src/MarcusViniciusBarros/MVBarros_SWITCH_Ex10_0028613.java) |
| 11 | Criar um programa que apresente uma operação matemática escolhida pelo usuário. | [`MVBarros_SWITCH_Ex11_0028613.java`](src/MarcusViniciusBarros/MVBarros_SWITCH_Ex11_0028613.java) |
| 12 | Criar um programa que classifique um conceito escolar, utilizando letras como A, B, C e D. | [`MVBarros_SWITCH_Ex12_0028613.java`](src/MarcusViniciusBarros/MVBarros_SWITCH_Ex12_0028613.java) |

### Estrutura de repetição `while`

| Nº | Enunciado | Código |
|----|-----------|--------|
| 13 | Criar um programa que exiba os números de 1 a 10. | [`MVBarros_WHILE_Ex13_0028613.java`](src/MarcusViniciusBarros/MVBarros_WHILE_Ex13_0028613.java) |
| 14 | Criar um programa que exiba os números pares de 2 a 20. | [`MVBarros_WHILE_Ex14_0028613.java`](src/MarcusViniciusBarros/MVBarros_WHILE_Ex14_0028613.java) |
| 15 | Criar um programa que faça uma contagem regressiva de 10 até 1. | [`MVBarros_WHILE_Ex15_0028613.java`](src/MarcusViniciusBarros/MVBarros_WHILE_Ex15_0028613.java) |
| 16 | Criar um programa que calcule a soma dos números de 1 a 100. | [`MVBarros_WHILE_Ex16_0028613.java`](src/MarcusViniciusBarros/MVBarros_WHILE_Ex16_0028613.java) |
| 17 | Criar um programa que apresente a tabuada de um número informado pelo usuário. | [`MVBarros_WHILE_Ex17_0028613.java`](src/MarcusViniciusBarros/MVBarros_WHILE_Ex17_0028613.java) |
| 18 | Criar um programa que solicite uma senha até que o usuário digite a senha correta. | [`MVBarros_WHILE_Ex18_0028613.java`](src/MarcusViniciusBarros/MVBarros_WHILE_Ex18_0028613.java) |

### Estrutura de repetição `do while`

| Nº | Enunciado | Código |
|----|-----------|--------|
| 19 | Criar um programa que exiba os números de 1 a 10. | [`MVBarros_DOWHILE_Ex19_0028613.java`](src/MarcusViniciusBarros/MVBarros_DOWHILE_Ex19_0028613.java) |
| 20 | Criar um programa que apresente os números ímpares de 1 a 19. | [`MVBarros_DOWHILE_Ex20_0028613.java`](src/MarcusViniciusBarros/MVBarros_DOWHILE_Ex20_0028613.java) |
| 21 | Criar um programa que faça uma contagem regressiva de 5 até 1. | [`MVBarros_DOWHILE_Ex21_0028613.java`](src/MarcusViniciusBarros/MVBarros_DOWHILE_Ex21_0028613.java) |
| 22 | Criar um programa que apresente a tabuada de um número informado pelo usuário. | [`MVBarros_DOWHILE_Ex22_0028613.java`](src/MarcusViniciusBarros/MVBarros_DOWHILE_Ex22_0028613.java) |
| 23 | Criar um programa que exiba um menu até que o usuário escolha a opção de sair. | [`MVBarros_DOWHILE_Ex23_0028613.java`](src/MarcusViniciusBarros/MVBarros_DOWHILE_Ex23_0028613.java) |
| 24 | Criar um programa que solicite um número positivo até que o usuário digite um valor válido. | [`MVBarros_DOWHILE_Ex24_0028613.java`](src/MarcusViniciusBarros/MVBarros_DOWHILE_Ex24_0028613.java) |

### Estrutura de repetição `for`

| Nº | Enunciado | Código |
|----|-----------|--------|
| 25 | Criar um programa que exiba os números de 1 a 100. | [`MVBarros_FOR_Ex25_0028613.java`](src/MarcusViniciusBarros/MVBarros_FOR_Ex25_0028613.java) |
| 26 | Criar um programa que exiba os números ímpares de 1 a 50. | [`MVBarros_FOR_Ex26_0028613.java`](src/MarcusViniciusBarros/MVBarros_FOR_Ex26_0028613.java) |
| 27 | Criar um programa que faça uma contagem regressiva de 20 até 0. | [`MVBarros_FOR_Ex27_0028613.java`](src/MarcusViniciusBarros/MVBarros_FOR_Ex27_0028613.java) |
| 28 | Criar um programa que apresente a tabuada de um número informado pelo usuário. | [`MVBarros_FOR_Ex28_0028613.java`](src/MarcusViniciusBarros/MVBarros_FOR_Ex28_0028613.java) |
| 29 | Criar um programa que calcule o fatorial de um número inteiro não negativo. | [`MVBarros_FOR_Ex29_0028613.java`](src/MarcusViniciusBarros/MVBarros_FOR_Ex29_0028613.java) |
| 30 | Criar um programa que calcule a soma dos números pares de 1 a 100. | [`MVBarros_FOR_Ex30_0028613.java`](src/MarcusViniciusBarros/MVBarros_FOR_Ex30_0028613.java) |

### Arrays

| Nº | Enunciado | Código |
|----|-----------|--------|
| 31 | Criar um array com cinco números inteiros e exibir todos os seus elementos. | [`MVBarros_ARRAY_Ex31_0028613.java`](src/MarcusViniciusBarros/MVBarros_ARRAY_Ex31_0028613.java) |
| 32 | Criar um array com cinco nomes de pessoas e apresentar cada nome. | [`MVBarros_ARRAY_Ex32_0028613.java`](src/MarcusViniciusBarros/MVBarros_ARRAY_Ex32_0028613.java) |
| 33 | Criar um array com seis notas e calcular a média dos valores. | [`MVBarros_ARRAY_Ex33_0028613.java`](src/MarcusViniciusBarros/MVBarros_ARRAY_Ex33_0028613.java) |
| 34 | Criar um array de números inteiros e identificar o maior elemento. | [`MVBarros_ARRAY_Ex34_0028613.java`](src/MarcusViniciusBarros/MVBarros_ARRAY_Ex34_0028613.java) |
| 35 | Criar um array de dez números e contar quantos são pares. | [`MVBarros_ARRAY_Ex35_0028613.java`](src/MarcusViniciusBarros/MVBarros_ARRAY_Ex35_0028613.java) |
| 36 | Criar um array com cinco elementos, alterar um dos valores e exibir o array atualizado. | [`MVBarros_ARRAY_Ex36_0028613.java`](src/MarcusViniciusBarros/MVBarros_ARRAY_Ex36_0028613.java) |

## Como executar

### Eclipse

1. Clone ou baixe o repositório e extraia a pasta.
2. Vá em **File > Import > General > Existing Projects into Workspace** e selecione a pasta do projeto.
3. No Package Explorer, clique com o botão direito no arquivo desejado e escolha **Run As > Java Application**.

### Terminal (JDK 17 ou superior)

```bash
javac -encoding UTF-8 -d bin src/MarcusViniciusBarros/*.java
java -cp bin MarcusViniciusBarros.MVBarros_IF_Ex01_0028613
```

Os exercícios que pedem dados ao usuário (idade, nota, senha, tabuada etc.) usam `Scanner`; digite os valores quando o programa solicitar. Notas decimais usam ponto (por exemplo, `7.5`).
