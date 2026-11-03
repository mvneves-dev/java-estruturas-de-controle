/*
 * Exercício 18 - Estrutura de Repetição While
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que solicite uma senha até que o usuário digite a
 * senha correta.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_WHILE_Ex18_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        String senhaCorreta = "eclipse123";
        String tentativa = "";   // começa diferente da senha para entrar no laço
        int tentativas = 0;
        Scanner entrada = new Scanner(System.in);

        // repete enquanto a senha digitada for diferente da senha correta
        while (!tentativa.equals(senhaCorreta)) {
            System.out.print("Digite a senha: ");
            tentativa = entrada.nextLine();
            tentativas++;

            if (!tentativa.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }
        }

        System.out.println("Senha correta! Acesso liberado.");
        System.out.println("Tentativas realizadas: " + tentativas);
        entrada.close();
    }
}
