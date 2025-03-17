
/* Leia um valor X. Coloque este valor na primeira posição de um vetor N de 100 posições.
 Em cada posição subsequente de N (1 até 99), 
coloque a metade do valor armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N. */

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    float vetor[] = new float[100];

    System.out.print("Digite o 1º valor: ");
    // Armazenando os valores dentro do vetor
    vetor[0] = sc.nextInt();

    for (int i = 1; i < 100; i++) {
      // fazendo o calculo das posições
      vetor[i] = vetor[i - 1] / 2;
    }

    System.out.println("Vetor: ");
    for (int i = 0; i < 100; i++) {
      System.out.println(vetor[i]);
    }
    sc.close();
  }
}
