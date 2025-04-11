/* 13. Implemente uma função recursiva para verificar se um número N é primo.*/

import java.util.Locale;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite um número: ");
        int num = sc.nextInt();

        System.out.println(num + " é primo: " + ehPrimo(num, num - 1));
        sc.close();
    }

    // 13. Função recursiva para verificar se um número é primo
    public static boolean ehPrimo(int n, int divisor) {
        if (n < 2)
            return false; // Números menores que 2 não são primos
        if (divisor == 1)
            return true; // Caso base: só divisível por 1 e por ele mesmo
        if (n % divisor == 0)
            return false; // se for divisível não é primo
        return ehPrimo(n, divisor - 1);
    }
}
