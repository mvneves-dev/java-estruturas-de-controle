/*
 * Exercício 35 - Arrays
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um array de dez números e contar quantos são pares.
 */
package MarcusViniciusBarros;

public class MVBarros_ARRAY_Ex35_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int[] numeros = {12, 7, 8, 21, 34, 5, 16, 9, 40, 3};
        int quantidadePares = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) { // número par
                System.out.println(numeros[i] + " é par");
                quantidadePares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);
    }
}
