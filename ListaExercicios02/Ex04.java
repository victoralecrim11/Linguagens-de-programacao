/* 4. Utilize o Algoritmo de Euclides para calcular o MDC de dois números a e b recursivamente.

*/

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Digite o primeiro número: "); // Pedindo ao usuário para digitar um número N. // Ex: 5
    int n1 = sc.nextInt();

    System.out.println("Digite o segundo número: "); // Pedindo ao usuário para digitar um número N. // Ex: 5
    int n2 = sc.nextInt();

    System.out.println("MDC de " + n1 + " e " + n2 + " é: " + mdc(n1, n2));
    sc.close();
  }

  public static int mdc(int n1, int n2) {
    if (n1 == 0) {
      return n2;

    } else if (n2 == 0) {
      return n1;
    } else
      return mdc(n2, n1 % n2);
  }
}
