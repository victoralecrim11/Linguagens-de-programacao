import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    operacoes();
  }

  public static void operacoes() {
    int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
    Scanner scanner = new Scanner(System.in);

    try {
      System.out.print("Digite o numerador para a divisão: ");
      int numerador = scanner.nextInt();

      System.out.print("Digite o denominador para a divisão: ");
      int denominador = scanner.nextInt();

      int resultadoDiv = numerador / denominador;
      System.out.println("O resultado da divisão é: " + resultadoDiv);

      System.out.print("Digite um índice para acessar o vetor: ");
      int indice = scanner.nextInt();

      System.out.println("Valor no vetor[" + indice + "] = " + vetor[indice]);

    } catch (ArithmeticException e) {
      System.out.println("Erro de divisão: Tentativa de divisão por zero");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Erro ao acessar o índice do vetor. Índice inválido: " + e.getMessage());
    } catch (Exception e) {
      System.out.println("Erro inesperado: " + e.getMessage());
    }

    scanner.close();
  }
}
