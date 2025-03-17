/* 2. Escreva um programa que leia 10 valores inteiros, informados pelo usuário e armazene-os em um vetor. 
Após isso, lendo o vetor uma única vez e sem criar outros vetores, 
mostre na tela a média dos valores armazenados no vetor ponderados 
pelos índices nos quais estão armazenados. */

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    int vetor[] = new int[11];
    vetor[10] = 0;

    // Recebendo os valores do usuário
    for (int i = 0; i < 10; i++) {
      System.out.print("Digite o " + (i + 1) + "º valor: ");
      // Armazenando os valores dentro do vetor
      vetor[i] = sc.nextInt();
    }

    // Calculando a média ponderada
    for (int i = 0; i < 10; i++) {
      // Armazenando a média ponderada
      vetor[10] += vetor[i] * (i + 1);
    }
    // Mostrando a média ponderada
    System.out.println("Média ponderada: " + vetor[10] / 55);

    sc.close();
  }
}
