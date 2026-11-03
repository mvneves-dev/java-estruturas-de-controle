/*
 * Exercício 05 - Estrutura de Decisão If
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que verifique se uma pessoa possui idade
 * suficiente para votar, considerando a regra de idade definida no exercício.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_IF_Ex05_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        // Regra adotada neste exercício (baseada no art. 14 da Constituição Federal):
        //  - menor de 16 anos ........... NÃO pode votar
        //  - de 16 a 17 e acima de 70 ... voto FACULTATIVO
        //  - de 18 a 70 anos ............ voto OBRIGATÓRIO
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        if (idade < 16) {
            System.out.println("Idade " + idade + ": ainda NÃO pode votar.");
        } else if (idade < 18 || idade > 70) {
            System.out.println("Idade " + idade + ": PODE votar (voto facultativo).");
        } else {
            System.out.println("Idade " + idade + ": PODE votar (voto obrigatório).");
        }

        entrada.close();
    }
}
