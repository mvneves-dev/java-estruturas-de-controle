/*
 * Exercício 21 - Estrutura de Repetição Do While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que faça uma contagem regressiva de 5 até 1.
 */
package MarcusViniciusBarros;

public class MVBarros_DOWHILE_Ex21_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int contagem = 5;

        System.out.println("Contagem regressiva:");
        do {
            System.out.print(contagem + " ");
            contagem--;
        } while (contagem >= 1);
        System.out.println("Fim!");
    }
}
