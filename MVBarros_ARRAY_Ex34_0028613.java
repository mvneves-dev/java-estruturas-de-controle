/*
 * Exercício 34 - Arrays
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um array de números inteiros e identificar o maior elemento.
 */
package MarcusViniciusBarros;

public class MVBarros_ARRAY_Ex34_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        int[] valores = {23, 7, 91, 45, 18, 66};

        int maior = valores[0]; // assume que o primeiro é o maior
        int posicao = 0;

        for (int i = 1; i < valores.length; i++) {
            if (valores[i] > maior) { // achou um valor maior: atualiza
                maior = valores[i];
                posicao = i;
            }
        }

        System.out.println("Maior elemento: " + maior + " (posição " + posicao + ")");
    }
}
