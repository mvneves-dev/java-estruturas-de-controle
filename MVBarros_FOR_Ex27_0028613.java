/*
 * Exercício 27 - Estrutura de Repetição For
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que faça uma contagem regressiva de 20 até 0.
 */
package MarcusViniciusBarros;

public class MVBarros_FOR_Ex27_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        System.out.println("Contagem regressiva:");
        // o contador começa em 20 e é decrementado (i--) até chegar a 0
        for (int i = 20; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Fim da contagem!");
    }
}
