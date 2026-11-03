/*
 * Exercício 07 - Estrutura de Decisão Switch
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que apresente o dia da semana conforme um número
 * de 1 a 7.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_SWITCH_Ex07_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int dia = entrada.nextInt();

        // switch compara o valor de "dia" com cada case; break encerra o case
        switch (dia) {
            case 1:
                System.out.println("Dia 1: Domingo");
                break;
            case 2:
                System.out.println("Dia 2: Segunda-feira");
                break;
            case 3:
                System.out.println("Dia 3: Terça-feira");
                break;
            case 4:
                System.out.println("Dia 4: Quarta-feira");
                break;
            case 5:
                System.out.println("Dia 5: Quinta-feira");
                break;
            case 6:
                System.out.println("Dia 6: Sexta-feira");
                break;
            case 7:
                System.out.println("Dia 7: Sábado");
                break;
            default: // executado quando nenhum case corresponde
                System.out.println("Número inválido! Digite um valor de 1 a 7.");
        }

        entrada.close();
    }
}
