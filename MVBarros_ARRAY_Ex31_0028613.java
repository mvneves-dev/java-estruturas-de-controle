/*
 * Exercício 31 - Arrays
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um array com cinco números inteiros e exibir todos os seus
 * elementos.
 */
package MarcusViniciusBarros;

public class MVBarros_ARRAY_Ex31_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        // declaração e inicialização de um array com 5 posições (índices de 0 a 4)
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println("Quantidade de elementos: " + numeros.length);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("numeros[" + i + "] = " + numeros[i]);
        }
    }
}
