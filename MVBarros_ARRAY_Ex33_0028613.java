/*
 * Exercício 33 - Arrays
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um array com seis notas e calcular a média dos valores.
 */
package MarcusViniciusBarros;

public class MVBarros_ARRAY_Ex33_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        double[] notas = {7.5, 8.0, 6.5, 9.0, 5.5, 10.0};
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
            soma += notas[i]; // acumula as notas
        }

        double media = soma / notas.length;
        System.out.printf("Média das notas: %.2f%n", media);
    }
}
