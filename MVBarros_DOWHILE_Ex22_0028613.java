/*
 * Exercício 22 - Estrutura de Repetição Do While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que apresente a tabuada de um número informado
 * pelo usuário.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_DOWHILE_Ex22_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número para ver a tabuada: ");
        int numero = entrada.nextInt();

        int fator = 1;
        System.out.println("Tabuada do " + numero + ":");
        do {
            System.out.println(numero + " x " + fator + " = " + (numero * fator));
            fator++;
        } while (fator <= 10);

        entrada.close();
    }
}
