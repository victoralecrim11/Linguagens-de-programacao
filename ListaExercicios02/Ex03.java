/* 3. Implemente uma função recursiva que receba um número N, 
informado pelo usuário, e imprima uma contagem regressiva até 1.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite um número: "); // Pedindo ao usuário para digitar um número N. // Ex: 5
    int n = sc.nextInt();

    contagemRegressiva(n);
    sc.close();
  }

  public static int contagemRegressiva(int n) {
    // Ex: 5, 4, 3, 2, 1
    if (n >= 1) {
      System.out.println(n);
      contagemRegressiva(n - 1);
    }
    return 0;
  }
}
