/* 8. Escreva um programa que calcule a multiplicação entre duas matrizes quaisquer. 
Seu programa deve determinar se é possível executar a multiplicação,
 e mostrar o resultado do cálculo para os casos possíveis.
Quando não for possível efetuar a operação, uma mensagem deve ser exibida na tela.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Digite o número de linhas e colunas da primeira matriz:");
    int linhas1 = sc.nextInt();
    int colunas1 = sc.nextInt();

    int[][] matriz1 = new int[linhas1][colunas1];
    System.out.print("Digite os elementos da primeira matriz:");
    for (int i = 0; i < linhas1; i++) {
      for (int j = 0; j < colunas1; j++) {
        matriz1[i][j] = sc.nextInt();
      }
    }

    System.out.print("Digite o número de linhas e colunas da segunda matriz:");
    int linhas2 = sc.nextInt();
    int colunas2 = sc.nextInt();

    int[][] matriz2 = new int[linhas2][colunas2];
    System.out.print("Digite os elementos da segunda matriz:");
    for (int i = 0; i < linhas2; i++) {
      for (int j = 0; j < colunas2; j++) {
        matriz2[i][j] = sc.nextInt();
      }
    }

    if (colunas1 != linhas2) {
      System.out.println(
          "A multiplicação não é possível: o número de colunas da primeira matriz é diferente do número de linhas da segunda matriz.");
    } else {
      int[][] resultado = new int[linhas1][colunas2];

      // Multiplicação das matrizes
      for (int i = 0; i < linhas1; i++) {
        for (int j = 0; j < colunas2; j++) {
          resultado[i][j] = 0;
          for (int k = 0; k < colunas1; k++) {
            resultado[i][j] += matriz1[i][k] * matriz2[k][j];
          }
        }
      }

      // Exibição do resultado no formato matricial
      System.out.println("Resultado da multiplicação das matrizes:");
      System.out.println("[");
      for (int i = 0; i < linhas1; i++) {
        System.out.print("  [ ");
        for (int j = 0; j < colunas2; j++) {
          System.out.print(resultado[i][j] + " ");
        }
        System.out.println("]");
      }
      System.out.println("]");
    }

    sc.close();
  }
}