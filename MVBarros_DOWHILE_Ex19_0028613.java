/*
 * Exercício 19 - Estrutura de Repetição Do While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que exiba os números de 1 a 10.
 */
package MarcusViniciusBarros;

public class MVBarros_DOWHILE_Ex19_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int i = 1;

        System.out.println("Números de 1 a 10:");
        // o bloco executa primeiro; a condição só é testada no final
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
        System.out.println();
    }
}
