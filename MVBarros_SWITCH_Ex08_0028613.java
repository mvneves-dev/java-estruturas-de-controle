/*
 * Exercício 08 - Estrutura de Decisão Switch
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que apresente o nome de um mês conforme um número
 * de 1 a 12.
 */
package MarcusViniciusBarros;

import java.util.Scanner;

public class MVBarros_SWITCH_Ex08_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número do mês (1 a 12): ");
        int mes = entrada.nextInt();

        switch (mes) {
            case 1:  System.out.println("Mês 1: Janeiro");   break;
            case 2:  System.out.println("Mês 2: Fevereiro"); break;
            case 3:  System.out.println("Mês 3: Março");     break;
            case 4:  System.out.println("Mês 4: Abril");     break;
            case 5:  System.out.println("Mês 5: Maio");      break;
            case 6:  System.out.println("Mês 6: Junho");     break;
            case 7:  System.out.println("Mês 7: Julho");     break;
            case 8:  System.out.println("Mês 8: Agosto");    break;
            case 9:  System.out.println("Mês 9: Setembro");  break;
            case 10: System.out.println("Mês 10: Outubro");  break;
            case 11: System.out.println("Mês 11: Novembro"); break;
            case 12: System.out.println("Mês 12: Dezembro"); break;
            default:
                System.out.println("Mês inválido! Digite um valor de 1 a 12.");
        }

        entrada.close();
    }
}
