package listaExercicio5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws IOException {
    String path = "C:\\Desenvolvimento\\Java\\Linguagens de Programação\\ListaExercicios05\\contatos.csv";
    Scanner ler = new Scanner(System.in);
    GerenciaContatos gerenciaContatos = new GerenciaContatos(path);

    // Verifica e cria o arquivo se não existir
    File arquivo = new File(path);
    if (!arquivo.exists()) {
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
        writer.write("Nome;Telefone;Email");
        writer.newLine();
        System.out.println("Arquivo criado com sucesso!");
      } catch (IOException e) {
        System.err.println("Erro ao criar o arquivo: " + e.getMessage());
        return;
      }
    }

    int opcao;
    do {
      GerenciaContatos.exibirMenu();
      opcao = ler.nextInt();
      ler.nextLine();

      switch (opcao) {
        case 1 -> GerenciaContatos.adicionarContato(path, ler);
        case 2 -> GerenciaContatos.buscarContatoPorNome(path, ler);
        case 3 -> GerenciaContatos.leitor(path);
        case 4 -> gerenciaContatos.atualizarContato(ler);
        case 5 -> gerenciaContatos.deletarContato(ler);
        case 6 -> System.out.println("Sair do programa.");
        default -> System.out.println("Opção inválida!.");
      }
    } while (opcao != 6);

    ler.close();
  }
}
