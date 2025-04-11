/* 5. Crie uma função recursiva que calcule a^b (a elevado a b)
 sem utilizar a operação de exponenciação direta.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite o primeiro número: ");
    int n1 = sc.nextInt();

    System.out.println("Digite o segundo número: ");
    int n2 = sc.nextInt();

    System.out.println(n1 + " elevado a " + n2 + " é: " + potencia(n1, n2));

    sc.close();
  }

  static int potencia(int base, int expoente) {
    // Comparação para ver se o numero é elevado 0, se sim retorna 1 na resposta
    // pois todo n elevado a zero é 1
    if (expoente == 0) {
      return 1;
    }
    // Caso contrario, multiplica a base pelo resultado da potencia
    // recursiva de base elevada a expoente - 1
    else {
      return base * potencia(base, expoente - 1);
    }

  }
}
