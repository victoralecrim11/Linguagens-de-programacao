/*  Leia um valor e faça um programa que coloque o valor lido na primeira posição de um vetor de 10 posições.
 Em cada posição subsequente, coloque o dobro do valor da posição anterior. 
Por exemplo, se o valor lido for 1, 
os valores do vetor devem ser 1, 2, 4, 8 e assim sucessivamente. Mostre o vetor em seguida. */

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    int vetor[] = new int[10];

    System.out.print("Digite o 1º valor: ");
    // Armazenando os valores dentro do vetor
    vetor[0] = sc.nextInt();

    for (int i = 1; i < 10; i++) {
      // fazendo o calculo das posições
      vetor[i] = vetor[i - 1] * 2;
    }

    System.out.println("Vetor: ");
    for (int i = 0; i < 10; i++) {
      System.out.println(vetor[i]);
    }

    sc.close();
  }
}
