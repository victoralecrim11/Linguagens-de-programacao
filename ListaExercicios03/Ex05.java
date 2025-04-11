public interface Ex05 {
  public static void main(String[] args) {
    try {
      double resultado = calcularRaizQuadrada(-25);
      System.out.println("Raiz quadrada do numero: " + resultado);
    } catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }
  }

  public static double calcularRaizQuadrada(double numero) {
    if (numero < 0) {
      throw new IllegalArgumentException("Numeros negativos não são validos pois não tem raiz real");
    }
    return Math.sqrt(numero);
  }
}
