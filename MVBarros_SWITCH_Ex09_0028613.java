/*
 * Exercício 09 - Estrutura de Decisão Switch
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que simule um menu de opções: cadastrar,
 * consultar e sair.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_SWITCH_Ex09_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.println("===== MENU PRINCIPAL =====");
        System.out.println("1 - Cadastrar");
        System.out.println("2 - Consultar");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Opção CADASTRAR selecionada.");
                break;
            case 2:
                System.out.println("Opção CONSULTAR selecionada.");
                break;
            case 3:
                System.out.println("Opção SAIR selecionada. Programa encerrado.");
                break;
            default:
                System.out.println("Opção inválida! Escolha 1, 2 ou 3.");
        }

        entrada.close();
    }
}
