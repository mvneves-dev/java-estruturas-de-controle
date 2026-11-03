/*
 * Exercício 26 - Estrutura de Repetição For
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que exiba os números ímpares de 1 a 50.
 */
package MarcusViniciusBarros;

public class MVBarros_FOR_Ex26_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        System.out.println("Números ímpares de 1 a 50:");
        // o passo do contador é 2 (i += 2), partindo do primeiro ímpar
        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
