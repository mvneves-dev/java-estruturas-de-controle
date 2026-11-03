/*
 * Exercício 15 - Estrutura de Repetição While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que faça uma contagem regressiva de 10 até 1.
 */
package MarcusViniciusBarros;

public class MVBarros_WHILE_Ex15_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int contagem = 10;

        System.out.println("Contagem regressiva:");
        while (contagem >= 1) {
            System.out.print(contagem + " ");
            contagem--; // decrementa o contador a cada volta
        }
        System.out.println("Lançamento!");
    }
}
