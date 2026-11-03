/*
 * Exercício 16 - Estrutura de Repetição While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que calcule a soma dos números de 1 a 100.
 */
package MarcusViniciusBarros;

public class MVBarros_WHILE_Ex16_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int contador = 1;
        int soma = 0; // acumulador: guarda o total parcial

        while (contador <= 100) {
            soma = soma + contador; // acumula o valor atual
            contador++;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}
