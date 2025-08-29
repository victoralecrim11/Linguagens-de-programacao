import java.util.Scanner;

public class Desafio1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int producao[][] = new int[10][5];
    int defeito[][] = new int[10][5];

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 5; j++) {
        System.out.println("Funcionário " + (i + 1) + " - Peça " + (j + 1) + " produzidas:");
        producao[i][j] = input.nextInt();
        System.out.println("Funcionário " + (i + 1) + " - Peça " + (j + 1) + " com defeito:");
        defeito[i][j] = input.nextInt();
        System.out.print((producao[i][j] - defeito[i][j]) / producao[i][j]);
      }
      System.out.println();
    }

      
    
    input.close(); // Fechando o Scanner para evitar vazamento de recursos
  }
}