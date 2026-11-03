/*
 * Exercício 25 - Estrutura de Repetição For
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um programa que exiba os números de 1 a 100.
 */
package MarcusViniciusBarros;

public class MVBarros_FOR_Ex25_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        // for (inicialização; condição; atualização)
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%4d", i);   // %4d: cada número ocupa 4 colunas (alinhado)
            if (i % 10 == 0) {
                System.out.println();       // quebra a linha a cada 10 números
            }
        }
    }
}
