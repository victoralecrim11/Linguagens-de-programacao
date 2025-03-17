/* Faça um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido. 
Lembre-se que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele. 
Todos os valores de Fibonacci calculados neste problema devem caber em um inteiro de 64 bits sem sinal. */

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    System.out.print("Digite um número N para encontrar o N-ésimo número de Fibonacci: ");
    int num = sc.nextInt();

    long a, b, c;
    a = 0;
    b = 1;
    c = 2;

    for (int i = 3; i <= num; i++) {
      c = a + b;
      a = b;
      b = c;
    }

    System.out.println("O Valor de fibonnaci para o numero: " + num + " é: " + c);

    sc.close();
  }
}
