/*
 * Exercício 04 - Estrutura de Decisão If
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que verifique se um número é par.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_IF_Ex04_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        // O operador % devolve o resto da divisão; resto 0 na divisão por 2 = número par
        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é PAR.");
        } else {
            System.out.println("O número " + numero + " é ÍMPAR.");
        }

        entrada.close();
    }
}
