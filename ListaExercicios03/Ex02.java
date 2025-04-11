import java.util.Scanner;

public class Ex02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um número:");

    try {
      int numero = Integer.parseInt(scanner.nextLine());
      System.out.println("Você digitou: " + numero);
    } catch (NumberFormatException e) {
      System.out.println("Erro: Entrada inválida. Por favor, insira um número.");
      scanner.close();
    }

  }
}
