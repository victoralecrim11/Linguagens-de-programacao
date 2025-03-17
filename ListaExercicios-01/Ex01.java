/* 1. Escreva um programa que crie um vetor de números inteiros, receba 10 valores informados pelo usuário,
 imprima todos os valores pares e depois todos os valores ímpares.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    int vetor[] = new int[10];

    // Recebendo os valores do usuário
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      vetor[i] = sc.nextInt();
    }

    // Imprimindo valores pares
    System.out.println("Valores pares:");
    for (int i = 0; i < 10; i++) {
      if (vetor[i] % 2 == 0) {
        System.out.println(vetor[i]);
      }
    }

    // Imprimindo valores ímpares
    System.out.println("Valores ímpares:");
    for (int i = 0; i < 10; i++) {
      if (vetor[i] % 2 != 0) {
        System.out.println(vetor[i]);
      }
    }

    sc.close(); // Fechar o Scanner após o uso
  }
}
