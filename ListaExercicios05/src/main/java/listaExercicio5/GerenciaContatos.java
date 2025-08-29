package listaExercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class GerenciaContatos {
  private final String path;

  public GerenciaContatos(String path) {
    this.path = path;
  }

  public static void exibirMenu() {
    System.out.println("\n--- MENU DE CONTATOS ---");
    System.out.println("1 - Adicionar Contato");
    System.out.println("2 - Buscar Contato por Nome");
    System.out.println("3 - Exibir Todos os Contatos");
    System.out.println("4 - Atualizar Contato");
    System.out.println("5 - Remover Contato");
    System.out.println("6 - Sair");
    System.out.print("Escolha uma opção: ");
  }

  public static void leitor(String path) throws IOException {
    File arquivo = new File(path);
    if (!arquivo.exists()) {
      throw new FileNotFoundException("Arquivo não encontrado!");
    }

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String linha;
      reader.readLine();

      while ((linha = reader.readLine()) != null) {
        StringTokenizer tokenizer = new StringTokenizer(linha, ";");

        if (tokenizer.countTokens() == 3) {
          String nome = tokenizer.nextToken();
          String telefone = tokenizer.nextToken();
          String email = tokenizer.nextToken();

          System.out.println("Nome: " + nome);
          System.out.println("Telefone: " + telefone);
          System.out.println("Email: " + email);
          System.out.println();
        }
      }
    }
  }

  public static void adicionarContato(String path, Scanner input) throws IOException {
    System.out.print("Digite o nome: ");
    String nome = input.nextLine();
    System.out.print("Digite o telefone: ");
    String telefone = input.nextLine();
    System.out.print("Digite o email: ");
    String email = input.nextLine();

    Contato novoContato = new Contato(nome, telefone, email);

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
      writer.write(novoContato.formataLinhaArquivo());
      writer.newLine();
      System.out.println("Contato adicionado com sucesso!");
    }
  }

  public static void buscarContatoPorNome(String path, Scanner input) throws IOException {
    System.out.print("Digite o nome do contato que deseja buscar: ");
    String nomeBuscado = input.nextLine().trim();

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String linha;
      boolean encontrado = false;
      reader.readLine();
      while ((linha = reader.readLine()) != null) {
        StringTokenizer tokenizer = new StringTokenizer(linha, ";");
        if (tokenizer.countTokens() >= 3) {
          String nome = tokenizer.nextToken();
          String telefone = tokenizer.nextToken();
          String email = tokenizer.nextToken();

          if (nome.equalsIgnoreCase(nomeBuscado)) {
            System.out.println("Nome: " + nome);
            System.out.println("Telefone: " + telefone);
            System.out.println("Email: " + email);
            encontrado = true;
            break;
          }
        }
      }
      if (!encontrado) {
        System.out.println("Contato não encontrado.");
      }
    }
  }

  public void atualizarContato(Scanner input) throws IOException {
    System.out.print("Digite o nome do contato que deseja atualizar: ");
    String nomeAntigo = input.nextLine();

    List<Contato> contatos = new ArrayList<>();
    boolean encontrado = false;

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String linha;
      reader.readLine(); // cabeçalho
      while ((linha = reader.readLine()) != null) {
        StringTokenizer tokenizer = new StringTokenizer(linha, ";");
        if (tokenizer.countTokens() >= 3) {
          String nome = tokenizer.nextToken();
          String telefone = tokenizer.nextToken();
          String email = tokenizer.nextToken();

          if (nome.equalsIgnoreCase(nomeAntigo)) {
            System.out.println("Digite os novos dados:");
            System.out.print("Nome: ");
            String novoNome = input.nextLine();
            System.out.print("Telefone: ");
            String novoTelefone = input.nextLine();
            System.out.print("Email: ");
            String novoEmail = input.nextLine();
            contatos.add(new Contato(novoNome, novoTelefone, novoEmail));
            encontrado = true;
          } else {
            contatos.add(new Contato(nome, telefone, email));
          }
        }
      }
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
      writer.write("Nome;Telefone;Email");
      writer.newLine();
      for (Contato c : contatos) {
        writer.write(c.formataLinhaArquivo());
        writer.newLine();
      }
    }

    if (encontrado) {
      System.out.println("Contato atualizado com sucesso!");
    } else {
      System.out.println("Contato não encontrado.");
    }
  }

  public void deletarContato(Scanner input) throws IOException {
    System.out.print("Digite o nome do contato que deseja remover: ");
    String nomeRemover = input.nextLine();

    List<Contato> contatos = new ArrayList<>();
    boolean contatoRemovido = false;

    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      String linha;
      reader.readLine();
      while ((linha = reader.readLine()) != null) {
        StringTokenizer tokenizer = new StringTokenizer(linha, ";");
        String nome = tokenizer.nextToken();
        String telefone = tokenizer.nextToken();
        String email = tokenizer.nextToken();

        if (!nome.equalsIgnoreCase(nomeRemover)) {
          contatos.add(new Contato(nome, telefone, email));
        } else {
          contatoRemovido = true;
        }
      }
    }

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
      writer.write("Nome;Telefone;Email");
      writer.newLine();
      for (Contato c : contatos) {
        writer.write(c.formataLinhaArquivo());
        writer.newLine();
      }
    }

    if (contatoRemovido) {
      System.out.println("Contato removido com sucesso!");
    } else {
      System.out.println("Contato não encontrado.");
    }
  }
}
