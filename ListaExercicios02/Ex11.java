<<<<<<< HEAD
// 11. Escreva uma função recursiva que conte quantas vezes um determinado número aparece em um array.

import java.util.Locale;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        // System.out.print("Digite um numéro: ");
        // int num = sc.nextInt();

        int v[] = { 1, 2, 3, 4, 5, 5, 6, 6, 5 };
        System.out.println(contarRepeticoes(5, v, 8));

        sc.close();

    }

    public static int contarRepeticoes(int numDig, int v[], int i) {

        if (i == 0) {
            if (v[i] == numDig) {
                return 1;
            }

            return 0;
        }

        if (v[i] == numDig) {
            return 1 + contarRepeticoes(numDig, v, i - 1);
        }

        return 0 + contarRepeticoes(numDig, v, i - 1);

    }
}
=======
public class Ex11 {
    public static void main(String[] args) {
        // Código do exercício
        System.out.println("Exercício 11");
    }
}
>>>>>>> ea52e1f148d61551f05f6f15a718ec827cc7d973
