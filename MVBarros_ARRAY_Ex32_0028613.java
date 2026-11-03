/*
 * Exercício 32 - Arrays
 * Aluno: Marcus Vinícius da Silva Neves Barros - RA: 0028613
 * Enunciado: Criar um array com cinco nomes de pessoas e apresentar cada nome.
 */
package MarcusViniciusBarros;

public class MVBarros_ARRAY_Ex32_0028613 {

    public static void main(String[] args) {
        System.out.println("ALUNO: Marcus Vinícius da Silva Neves Barros - RA: 0028613");

        String[] nomes = {"Ana", "Bruno", "Carla", "Diego", "Elisa"};

        System.out.println("Lista de nomes:");
        // for aprimorado (for-each): percorre cada elemento sem usar índice
        for (String nome : nomes) {
            System.out.println("- " + nome);
        }
    }
}
