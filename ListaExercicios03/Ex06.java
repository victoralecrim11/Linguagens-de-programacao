public class Ex06 {
  public static void main(String[] args) {
    int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };

    try {
      int resultadoDiv = 20 / 0;
      System.out.println("O resultado da divisão é: " + resultadoDiv);
      System.out.println("Indice invalido: " + vetor[12]);

    } catch (ArithmeticException e) {
      System.out.println("Erro de divisão: " + e.getMessage());

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Erro ao acessar o indice do vetor, Indice é invalido!. " + e.getMessage());

    }
  }
}
