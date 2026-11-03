/*
 * Exercício 14 - Estrutura de Repetição While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que exiba os números pares de 2 a 20.
 */
package MarcusViniciusBarros;

public class MVBarros_WHILE_Ex14_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int numero = 2; // o primeiro número par

        System.out.println("Números pares de 2 a 20:");
        while (numero <= 20) {
            System.out.print(numero + " ");
            numero += 2; // soma 2 a cada volta para pular de par em par
        }
        System.out.println();
    }
}
