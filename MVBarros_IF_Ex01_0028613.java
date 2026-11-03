/*
 * Exercício 01 - Estrutura de Decisão If
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que verifique se uma pessoa é maior de idade.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_IF_Ex01_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        // A condição (idade >= 18) decide qual bloco será executado
        if (idade >= 18) {
            System.out.println("Resultado: pessoa MAIOR de idade.");
        } else {
            System.out.println("Resultado: pessoa MENOR de idade.");
        }

        entrada.close();
    }
}
