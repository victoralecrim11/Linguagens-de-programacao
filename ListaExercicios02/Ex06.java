/* 6. Escreva uma função recursiva que receba um número inteiro positivo 
e retorne a quantidade de dígitos que ele possui.
 */

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    System.out.println("Digite o primeiro número: "); // Pedindo ao usuário para digitar um número N. // Ex: 5
    int n1 = sc.nextInt();

    System.out.println("Quantidade de dígitos: " + quantidadeDigitos(n1));

    sc.close();
  }

  public static int quantidadeDigitos(int n) {
    /*
     * verifica se o número tem apenas um dígito através da condição n / 10 == 0. Se
     * isso for verdade, retorna 1, pois números de um dígito têm exatamente 1
     * dígito.
     */
    if (n / 10 == 0) {
      return 1;
    }
    /*
     * Senão, divide o número por 10 (removendo o último dígito) e chama a
     * função countDigit novamente, somando 1 ao resultado.
     */
    else {
      return 1 + quantidadeDigitos(n / 10);
    }
  }
}
