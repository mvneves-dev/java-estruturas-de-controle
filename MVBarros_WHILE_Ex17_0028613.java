/*
 * Exercício 17 - Estrutura de Repetição While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que apresente a tabuada de um número informado
 * pelo usuário.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_WHILE_Ex17_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = entrada.nextInt();

        int fator = 1;
        System.out.println("Tabuada do " + numero + ":");
        while (fator <= 10) {
            System.out.println(numero + " x " + fator + " = " + (numero * fator));
            fator++;
        }

        entrada.close();
    }
}
