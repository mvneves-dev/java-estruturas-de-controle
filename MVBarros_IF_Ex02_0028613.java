/*
 * Exercício 02 - Estrutura de Decisão If
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que verifique se um número é positivo.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_IF_Ex02_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        // Três caminhos possíveis: positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número " + numero + " é POSITIVO.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é NEGATIVO.");
        } else {
            System.out.println("O número é ZERO (nem positivo nem negativo).");
        }

        entrada.close();
    }
}
