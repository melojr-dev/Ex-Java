import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca(10);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Exibir todos os livros");
            System.out.println("2. Adicionar novo livro");
            System.out.println("3. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após a opção

            switch (opcao) {
                case 1:
                    biblioteca.exibirTodosLivros();
                    break;

                case 2:
                    System.out.print("Digite o título do livro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Digite o número de páginas do livro: ");
                    int numeroPaginas = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha após o número de páginas

                    Livro novoLivro = new Livro(titulo, autor, numeroPaginas);
                    if (biblioteca.adicionarLivro(novoLivro)) {
                        System.out.println("Livro adicionado com sucesso.");
                    } else {
                        System.out.println("Não foi possível adicionar o livro. Capacidade máxima atingida.");
                    }
                    break;

                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}