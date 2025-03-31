/* 2. Escreva uma função recursiva que receba uma string e a retorne invertida.

 */

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);
    String palavra = "Ana";
    String invertida = inverterString(palavra, palavra.length() - 1);
    System.out.println("String original: " + palavra);
    System.out.println("String invertida: " + invertida);
    sc.close();
  }

  public static String inverterString(String s, int intervalo) {
    if (intervalo < 0) {
      return "";
    }

    return s.charAt(intervalo) + inverterString(s, intervalo - 1);

  }
}
