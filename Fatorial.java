import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro para N!:");
        int numero = scanner.nextInt();

       System.out.println(calcularFatorial(numero));

        scanner.close();
    }

    //Funçaõ de calcular o fatorial de um numero 
    public static int calcularFatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}
