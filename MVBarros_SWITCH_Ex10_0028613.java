/*
 * Exercício 10 - Estrutura de Decisão Switch
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que identifique o turno de estudo: matutino,
 * vespertino ou noturno.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_SWITCH_Ex10_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.println("Turnos: M - Matutino | V - Vespertino | N - Noturno");
        System.out.print("Informe a letra do seu turno: ");
        // pega o primeiro caractere digitado e converte para maiúscula
        char turno = Character.toUpperCase(entrada.next().charAt(0));

        // switch também funciona com o tipo char
        switch (turno) {
            case 'M':
                System.out.println("Turno de estudo: MATUTINO.");
                break;
            case 'V':
                System.out.println("Turno de estudo: VESPERTINO.");
                break;
            case 'N':
                System.out.println("Turno de estudo: NOTURNO.");
                break;
            default:
                System.out.println("Turno inválido! Use M, V ou N.");
        }

        entrada.close();
    }
}
