import java.util.Scanner;

public class Ex01 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.print("Digite o primeiro número inteiro: ");
      int a = scanner.nextInt();
      System.out.print("Digite o segundo número inteiro: ");
      int b = scanner.nextInt();

      int resultado = a / b;
      System.out.println("Resultado da divisão: " + resultado);
    } catch (ArithmeticException e) {
      System.out.println("Erro: divisão por zero não é permitida.");
    }
    scanner.close();
  }
}
