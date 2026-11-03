/*
 * Exercício 29 - Estrutura de Repetição For
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que calcule o fatorial de um número inteiro não
 * negativo.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_FOR_Ex29_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro não negativo: ");
        int n = entrada.nextInt();

        if (n < 0) {
            System.out.println("Erro: o fatorial não é definido para números negativos.");
        } else {
            long fatorial = 1; // long comporta até 20!
            // n! = 1 x 2 x 3 x ... x n  (0! e 1! valem 1)
            for (int i = 2; i <= n; i++) {
                fatorial = fatorial * i;
            }
            System.out.println(n + "! = " + fatorial);
        }

        entrada.close();
    }
}
