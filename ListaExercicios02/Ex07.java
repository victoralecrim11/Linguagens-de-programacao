/* 7. Desenvolva uma função recursiva que receba um número inteiro positivo e retorne a soma de seus dígitos.

 */

import java.util.Locale;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        // Código do exercício
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite o primeiro número: "); // Pedindo ao usuário para digitar um número N. // Ex: 5
        int num = sc.nextInt();
        System.out.println("Soma de dígitos do número: " + somaDigitos(num));

        sc.close();
    }

    public static int somaDigitos(int n) {
        int restoDivisao = n % 10;

        if (restoDivisao != 0) {
            return restoDivisao + somaDigitos(n / 10);
        } else {
            return 0;
        }
    }
}
