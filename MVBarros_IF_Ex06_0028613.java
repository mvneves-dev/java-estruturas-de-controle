/*
 * Exercício 06 - Estrutura de Decisão If
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que verifique se uma senha digitada corresponde à
 * senha cadastrada.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_IF_Ex06_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        String senhaCadastrada = "java2026"; // senha previamente cadastrada
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a senha: ");
        String senhaDigitada = entrada.nextLine();

        // Strings são comparadas com equals(), nunca com ==
        if (senhaDigitada.equals(senhaCadastrada)) {
            System.out.println("Senha correta! Acesso liberado.");
        } else {
            System.out.println("Senha incorreta! Acesso negado.");
        }

        entrada.close();
    }
}
