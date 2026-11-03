/*
 * Exercício 23 - Estrutura de Repetição Do While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que exiba um menu até que o usuário escolha a
 * opção de sair.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_DOWHILE_Ex23_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);
        int opcao;

        // o menu aparece pelo menos uma vez e se repete até o usuário digitar 0
        do {
            System.out.println();
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Consultar");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(">> Cadastro realizado (simulação).");
                    break;
                case 2:
                    System.out.println(">> Consulta realizada (simulação).");
                    break;
                case 0:
                    System.out.println(">> Encerrando o programa...");
                    break;
                default:
                    System.out.println(">> Opção inválida, tente novamente.");
            }
        } while (opcao != 0);

        entrada.close();
    }
}
