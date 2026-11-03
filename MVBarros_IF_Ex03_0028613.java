/*
 * Exercício 03 - Estrutura de Decisão If
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que verifique se um aluno foi aprovado com nota
 * igual ou superior a 7.
 */
package MarcusViniciusBarros;

import java.util.Locale;
import java.util.Scanner;

public class MVBarros_IF_Ex03_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // aceita nota com ponto decimal (ex.: 7.5)

        System.out.print("Digite a nota do aluno (0 a 10): ");
        double nota = entrada.nextDouble();

        // Primeiro valida a nota; depois compara com a média de aprovação (7)
        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! Informe um valor entre 0 e 10.");
        } else if (nota >= 7) {
            System.out.println("Nota " + nota + ": aluno APROVADO.");
        } else {
            System.out.println("Nota " + nota + ": aluno REPROVADO.");
        }

        entrada.close();
    }
}
