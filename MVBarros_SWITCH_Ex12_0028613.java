/*
 * Exercício 12 - Estrutura de Decisão Switch
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que classifique um conceito escolar, utilizando
 * letras como A, B, C e D.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_SWITCH_Ex12_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o conceito do aluno (A, B, C ou D): ");
        char conceito = Character.toUpperCase(entrada.next().charAt(0));

        switch (conceito) {
            case 'A':
                System.out.println("Conceito A: EXCELENTE (nota de 9,0 a 10,0).");
                break;
            case 'B':
                System.out.println("Conceito B: BOM (nota de 7,0 a 8,9).");
                break;
            case 'C':
                System.out.println("Conceito C: REGULAR (nota de 5,0 a 6,9).");
                break;
            case 'D':
                System.out.println("Conceito D: INSUFICIENTE (nota abaixo de 5,0).");
                break;
            default:
                System.out.println("Conceito inválido! Use A, B, C ou D.");
        }

        entrada.close();
    }
}
