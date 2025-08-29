public class Desafio2 {
  public static void main(String[] args) {
    int[][] matriz = {
        { 1, 892, 3 },
        { 4, 5, 6 },
        { 7, 8, 9 }
    };
    System.out.println("O maior elemento da matriz é: " + buscaMaiorElem(matriz, 0, 0, matriz[0][0]));

  }

  public static int buscaMaiorElem(int[][] mat, int linha, int coluna, int maiorAtual) {
    if (linha >= mat.length) {
      return maiorAtual;
    }

    if (coluna >= mat[linha].length) {
      return buscaMaiorElem(mat, linha + 1, 0, maiorAtual);
    }

    if (mat[linha][coluna] > maiorAtual) {
      maiorAtual = mat[linha][coluna];
    }

    return buscaMaiorElem(mat, linha, coluna + 1, maiorAtual);
  }
}
