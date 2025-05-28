import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GerarArquivoLeituraEscrita {
  public static void main(String[] args) {
    String path = "C:\\Users\\victo\\Documents\\TESTE\\arquivo.csv";
    Scanner ler = new Scanner(System.in);

    // Verifica e cria o arquivo com cabeçalho
    File arquivo = new File(path);
    if (!arquivo.exists()) {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
        writer.write("Nome;Telefone;Email");
        System.out.println("");
        writer.newLine();
        System.out.println("Arquivo criado com sucesso!");
      } catch (IOException e) {
        System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        return;
      }
    }

    int opcao;

    do {
      System.out.println("1 - Adicionar Nome, telefone e email:");
      System.out.println("2 - Exibir o nome e os dados de uma pessoa:");
      System.out.println("3 - Exibir TODOS os dados do arquivo: ");
      System.out.println("4 - Sair ");
      System.out.print("Escolha uma opção: ");
      opcao = ler.nextInt();
      ler.nextLine();

      switch (opcao) {
        case 1 -> {
          try {
            escritor(path, ler);
          } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
          }
        }

        case 2 -> {
          try {
            buscarDadosPessoa(path, ler);
          } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
          }
        }
        case 3 -> {
          try {
            leitor(path);
          } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
          }
        }
        case 4 -> System.out.println("Saindo...");
        default -> System.out.println("Opção inválida!");
      }
    } while (opcao != 4);

    ler.close(); // Fecha somente ao final do programa
  }

  private static void leitor(String path) throws IOException {
    File arquivo = new File(path);
    if (arquivo.exists()) {
      BufferedReader reader = new BufferedReader(new FileReader(path));
      String linha;
      while ((linha = reader.readLine()) != null) {
        System.out.println(linha);
      }
      reader.close();
    } else {
      throw new FileNotFoundException("Arquivo não encontrado!");
    }
  }

  private static void escritor(String path, Scanner input) throws IOException {
    BufferedWriter writer = new BufferedWriter(new FileWriter(path, true));
    System.out.print("Digite o nome: ");
    String nome = input.nextLine();
    System.out.print("Digite o telefone: ");
    String telefone = input.nextLine();
    System.out.print("Digite o email: ");
    String email = input.nextLine();
    writer.write(nome + ";" + telefone + ";" + email); 
    writer.newLine();
    writer.close();
  }

  private static void buscarDadosPessoa(String path, Scanner scanner) throws IOException {
    System.out.print("Informe o nome a ser buscado: ");
    String nomeBusca = scanner.nextLine().toLowerCase();

    boolean encontrada = false;

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String linha;

      while ((linha = reader.readLine()) != null) {
        StringTokenizer tokenizer = new StringTokenizer(linha, ";");

        if (tokenizer.hasMoreTokens()) {
          String nomeBuscado = tokenizer.nextToken();

          if (nomeBuscado.toLowerCase().contains(nomeBusca)) {
            String telefone = "";
            if (tokenizer.hasMoreTokens()) {
              telefone = tokenizer.nextToken();
            }

            String email = "";
            if (tokenizer.hasMoreTokens()) {
              email = tokenizer.nextToken();
            }
            System.out.println("\n--- Pessoa Encontrada ---");
            System.out.println("Nome: " + nomeBuscado);
            System.out.println("Telefone: " + telefone);
            System.out.println("Email: " + email);
            encontrada = true;
            break;
          }
        }
      }

      if (!encontrada) {
        System.out.println("Pessoa não encontrada.");
      }
    }
  }
}
