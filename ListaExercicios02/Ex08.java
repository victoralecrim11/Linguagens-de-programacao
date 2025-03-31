/* 8. Crie uma função recursiva que determine se uma string é um palíndromo
 (ou seja, se ela é igual quando lida de trás para frente).

 */

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        if (Palindromo(palavra, 0)) {
            System.out.println("A palavra " + palavra + " é um palíndromo.");
        } else {
            System.out.println("A palavra " + palavra + " nao é um palíndromo.");
        }

        sc.close();

    }

    public static boolean Palindromo(String t, int indice) {
        boolean p = t.charAt(indice) == t.charAt(t.length() - 1 - indice);

        if (indice < t.length() / 2) {
            return p && Palindromo(t, indice + 1);
        } else {
            return p;
        }
    }
}
