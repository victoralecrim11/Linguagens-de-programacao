public class Ex01RevisaoExemplo {
  public static void main(String[] args) {
    
    // Vetor original com alguns valores duplicados
    int vet[] = { 5, 3, 8, 5, 2, 8, 1, 4, 3, 6 };

    // Vetor auxiliar para marcar quais posições são duplicatas
    int vetCopia[] = new int[vet.length];

    // Percorre o vetor original e marca como 1 no vetCopia as posições de duplicatas
    for (int i = 0; i < vet.length; i++) {
      for (int j = i + 1; j < vet.length; j++) {
        if (vet[i] == vet[j]) {
          vetCopia[j] = 1; // Marca a segunda ocorrência como duplicada
        }
      }
    }

    // Conta quantos elementos NÃO são duplicados (ou seja, vetCopia[i] == 0)
    int tamanho = 0;
    for (int i = 0; i < vetCopia.length; i++) {
      if (vetCopia[i] == 0) {
        tamanho++; // Aumenta o tamanho final do vetor sem duplicatas
      }
    }

    // Cria um novo vetor com apenas os valores únicos (sem duplicatas)
    int j = 0;
    int vetResultado[] = new int[tamanho];
    for (int i = 0; i < vet.length; i++) {
      if (vetCopia[i] == 0) {
        vetResultado[j] = vet[i]; // Copia o valor único para o vetor final
        j++;
      }
    }

    // Imprime os valores sem duplicatas em uma única linha
    System.out.println("Valores sem duplicatas:");
    for (int i = 0; i < vetResultado.length; i++) {
      System.out.print(vetResultado[i] + " ");
    }

    System.out.println(); // Apenas para pular linha
  }

  // Função recursiva que conta quantos números negativos existem em um vetor
  public static int contarNegativos(int vetor[], int posicao) {
    // Caso base: chegou ao final do vetor
    if (posicao == vetor.length) {
      return 0;
    } else {
      // Se o valor atual for negativo, soma 1 e continua recursivamente
      if (vetor[posicao] < 0) {
        return 1 + contarNegativos(vetor, posicao + 1);
      }
      // Se não for negativo, apenas continua a recursão
      return contarNegativos(vetor, posicao + 1);
    }
  }

  // Versão iterativa da contagem de números negativos
  public static int contarNegativosIterativo(int vetor[]) {
    int cont = 0; // Contador de negativos
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] < 0) {
        cont++; // Incrementa o contador se for negativo
      }
    }
    return cont;
  }
}
