import java.util.Scanner;

public class Ex04 {

  // Classe de exceção deve ser estática para ser usada no contexto estático do main
  public static class IdadeInvalidaException extends Exception {
    public IdadeInvalidaException() {
      super("Idade inválida");
    }
  }

  public static boolean validaIdade(int idade) throws IdadeInvalidaException {
    if (idade < 0 || idade > 150) {
      throw new IdadeInvalidaException();
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a idade a ser validada: ");
    int idade = scanner.nextInt();

    try {
      validaIdade(idade);
      System.out.println("Idade válida!");
    } catch (IdadeInvalidaException e) {
      System.out.println(e.getMessage());
    } catch (Exception e) {
      System.out.println("Erro inesperado: " + e.getMessage());
    }

    scanner.close();
  }
}
