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

    public static boolean Palindromo(String str, int posicao) {
        if (str.charAt(posicao) != str.charAt(str.length() - 1 - posicao)) {
            return false;
        }

        if (posicao >= str.length() - 1 - posicao) {
            return true;
        }

        return Palindromo(str, posicao + 1);
    }
}
