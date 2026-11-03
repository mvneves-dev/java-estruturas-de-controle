/*
 * Exercício 13 - Estrutura de Repetição While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que exiba os números de 1 a 10.
 */
package MarcusViniciusBarros;

public class MVBarros_WHILE_Ex13_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int i = 1; // inicialização do contador

        System.out.println("Números de 1 a 10:");
        // a condição é testada ANTES de cada execução do bloco
        while (i <= 10) {
            System.out.print(i + " ");
            i++; // atualização do contador (sem ela o laço seria infinito)
        }
        System.out.println();
    }
}
