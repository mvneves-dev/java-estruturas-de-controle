/*
 * Exercício 11 - Estrutura de Decisão Switch
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que apresente uma operação matemática escolhida
 * pelo usuário.
 */
package MarcusViniciusBarros;

import java.util.Locale;
import java.util.Scanner;

public class MVBarros_SWITCH_Ex11_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        System.out.print("Digite o primeiro número: ");
        double a = entrada.nextDouble();
        System.out.print("Digite o segundo número: ");
        double b = entrada.nextDouble();
        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = entrada.next().charAt(0);

        switch (operacao) {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f%n", a, b, a + b);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f%n", a, b, a - b);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f%n", a, b, a * b);
                break;
            case '/':
                if (b != 0) { // evita divisão por zero
                    System.out.printf("%.2f / %.2f = %.2f%n", a, b, a / b);
                } else {
                    System.out.println("Erro: não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operação inválida! Use +, -, * ou /.");
        }

        entrada.close();
    }
}
