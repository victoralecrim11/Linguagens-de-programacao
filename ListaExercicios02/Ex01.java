/* 1. Implemente uma função recursiva que receba um número N, 
informado pelo usuário, e retorne a soma dos primeiros
 N números naturais (1 + 2 + 3 + 4 + ... + n-1 +n).

 */

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite um número: "); // Pedindo ao usuário para digitar um número N. // Ex: 5
    int n = sc.nextInt();
    System.out.println(somaNaturais(n));

    sc.close();
  }
  
  public static int somaNaturais(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + somaNaturais(n - 1);
    }
  }
}
