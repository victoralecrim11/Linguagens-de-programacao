/* 7. Escreva um programa que receba um número inteiro 2≤𝑁≤5, crie uma matriz quadrada 𝑁×𝑁, 
preencha a matriz com valores de 1 até 𝑁2, calcule o quadrado da matriz criada e exiba o resultado na tela.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    int num = 0;

    while (num < 2 || num > 5) {
      System.out.println("Digite um numero inteiro entre 2 E 5: ");
      num = sc.nextInt();
    }

    int[][] matriz = new int[num][num];
    int valor = 1;

    System.out.println("\nMatriz Original:");
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        matriz[i][j] = valor++;
        System.out.printf("%d\t", matriz[i][j]);
      }
      System.out.println();
    }

    // Calculando o quadrado da matriz (multiplicação de matriz)
    int[][] matrizQuadrada = new int[num][num];

    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        matrizQuadrada[i][j] = 0;
        for (int k = 0; k < num; k++) {
          matrizQuadrada[i][j] += matriz[i][k] * matriz[k][j];
        }
      }
    }

    // Exibindo a matriz quadrada
    System.out.println("\nMatriz ao Quadrado:");
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num; j++) {
        System.out.printf("%d\t", matrizQuadrada[i][j]);
      }
      System.out.println();
    }

    sc.close();
  }
}
