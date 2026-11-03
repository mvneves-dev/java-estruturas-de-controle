/*
 * Exercício 20 - Estrutura de Repetição Do While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que apresente os números ímpares de 1 a 19.
 */
package MarcusViniciusBarros;

public class MVBarros_DOWHILE_Ex20_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int impar = 1; // o primeiro número ímpar

        System.out.println("Números ímpares de 1 a 19:");
        do {
            System.out.print(impar + " ");
            impar += 2; // de 2 em 2 mantém a sequência de ímpares
        } while (impar <= 19);
        System.out.println();
    }
}
