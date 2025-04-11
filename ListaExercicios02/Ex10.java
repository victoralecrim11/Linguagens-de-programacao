<<<<<<< HEAD
import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // System.out.print("Digite o primeiro número (a): ");
        // int a = sc.nextInt();

        // System.out.print("Digite o segundo número (b): ");
        // int b = sc.nextInt();

        int resultado = multiplicaNumeros(5, 5);

        // Exibindo o resultado
        System.out.println(resultado);

        sc.close();
    }

    public static int multiplicaNumeros(int a, int b) {
        if (b == 0) {
            return 0; // Caso base
        }
        if (b > 0) {
            return a + multiplicaNumeros(a, b - 1);

        }
        return -multiplicaNumeros(a, -b); // Caso para números negativos
    }
}
=======
import java.util.Locale;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        // System.out.print("Digite o primeiro número (a): ");
        // int a = sc.nextInt();

        // System.out.print("Digite o segundo número (b): ");
        // int b = sc.nextInt();

        int resultado = multiplicaNumeros(5, 5);

        // Exibindo o resultado
        System.out.println(resultado);

        sc.close();
    }

    public static int multiplicaNumeros(int a, int b) {
        if (b == 0) {
            return 0; // Caso base
        }
        if (b > 0) {
            return a + multiplicaNumeros(a, b - 1);

        }
        return -multiplicaNumeros(a, -b); // Caso para números negativos
    }
}
>>>>>>> ea52e1f148d61551f05f6f15a718ec827cc7d973
