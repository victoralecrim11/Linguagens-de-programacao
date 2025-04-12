
public class Ex01 {
  public static void main(String[] args) {
    divisaoInvalida();
  }

  public static void divisaoInvalida() throws ArithmeticException {
    Scanner scanner = new Scanner(System.in);
    try {
    System.out.print("Digite o primeiro número inteiro: ");
    int a = scanner.nextInt();
    System.out.print("Digite o segundo número inteiro: ");
    int b = scanner.nextInt();

    int resultado = a / b;
    System.out.println("Resultado da divisão: " + resultado);
    } catch (ArithmeticException e) {
    System.out.println("Erro: divisão por zero não é permitida." + e.getMessage());
    }
    scanner.close();

  }
}
