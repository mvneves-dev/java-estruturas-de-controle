/*
 * Exercício 24 - Estrutura de Repetição Do While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que solicite um número positivo até que o usuário
 * digite um valor válido.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_DOWHILE_Ex24_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número positivo: ");
            numero = entrada.nextInt();

            if (numero <= 0) {
                System.out.println("Valor inválido! O número deve ser maior que zero.");
            }
        } while (numero <= 0); // repete enquanto o valor for inválido

        System.out.println("Número válido recebido: " + numero);
        entrada.close();
    }
}
