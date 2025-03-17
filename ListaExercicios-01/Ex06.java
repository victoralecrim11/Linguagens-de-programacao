/* 6. Crie uma matriz bidimensional quadrada para armazenar 9 valores
 inteiros informados pelo usuário.
 Depois, calcule e mostre na tela o determinante da matriz.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    // Criando a matriz
    int matriz[][] = new int[3][3];

    // For pra percorrer as linhas da matriz
    for (int l = 0; l < matriz.length; l++) {
      // For pra percorrer as colunas da matriz
      for (int c = 0; c < matriz.length; c++) {
        System.out.print("Digite o " + (l + 1) + "º valor: ");
        matriz[l][c] = sc.nextInt();
      }
    }

    // For pra preecher a matriz
    for (int l = 0; l < 3; l++) {
      for (int c = 0; c < 3; c++) {
        System.out.printf("%d\t", matriz[l][c]);
      }
      System.out.println();
    }

    // Variavel pra armazenar o determinante
    int determinante = 0;

    for (int det = 0; det < matriz.length; det++) {
      // variavel para multiplicação
      int multiplicacao = 1;
      for (int linha = 0; linha < matriz.length; linha++) {
        // Multiplica os elementos das diagonais principais e os soma no determinante.
        multiplicacao *= matriz[linha][(det + linha) % 3];
      }

      determinante += multiplicacao;
    }

    for (int det = 0; det < 3; det++) {
      int multiplicacao = 1;
      for (int l = 0; l < 3; l++) {
        // Multiplica os elementos das diagonais principais e subtrai 
        // do determinante.
        multiplicacao *= matriz[l][(2 - l + det) % 3];
      }
      determinante -= multiplicacao;
    }
    System.out.println("O determinante da matriz digitada é: " + determinante);
    sc.close();
  }
}
