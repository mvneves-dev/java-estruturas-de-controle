/*
 * Exercício 30 - Estrutura de Repetição For
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que calcule a soma dos números pares de 1 a 100.
 */
package MarcusViniciusBarros;

public class MVBarros_FOR_Ex30_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int soma = 0;

        // começa em 2 e avança de 2 em 2, passando só pelos pares
        for (int i = 2; i <= 100; i += 2) {
            soma += i;
        }

        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
