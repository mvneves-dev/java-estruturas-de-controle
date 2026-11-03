/*
 * Exercício 36 - Arrays
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um array com cinco elementos, alterar um dos valores e exibir
 * o array atualizado.
 */
package MarcusViniciusBarros;

import java.util.Arrays;

public class MVBarros_ARRAY_Ex36_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int[] vetor = {5, 10, 15, 20, 25};

        // Arrays.toString() converte o array em texto para facilitar a exibição
        System.out.println("Array original:   " + Arrays.toString(vetor));

        vetor[2] = 99; // altera o elemento da posição 2 (terceiro valor)

        System.out.println("Array atualizado: " + Arrays.toString(vetor));
    }
}
