// 9. Escreva uma função recursiva que implemente a busca binária em um vetor ordenado.

import java.util.Locale;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
       

        sc.close();
    }

    // Função recursiva para busca binária
    public static int buscaBinariaRecursiva(int[] array, int elemento, int inicio, int fim) {
        if (inicio > fim) {
            return -1; // Caso base: elemento não encontrado
        }
        int meio = inicio + (fim - inicio) / 2; // Calcula a posição do elemento do meio
        if (array[meio] == elemento) {
            return meio; // Elemento encontrado
        }
        if (elemento < array[meio]) {
            return buscaBinariaRecursiva(array, elemento, inicio, meio - 1); // Busca na esquerda
        }
        return buscaBinariaRecursiva(array, elemento, meio + 1, fim); // Busca na direita
    }
}
