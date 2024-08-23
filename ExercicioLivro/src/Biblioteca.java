public class Biblioteca {
    private Livro[] livros;
    private int numeroLivros;

    public Biblioteca(int capacidade) {
        livros = new Livro[capacidade];
        numeroLivros = 0;
    }

    public boolean adicionarLivro(Livro livro) {
        if (numeroLivros < livros.length) {
            livros[numeroLivros++] = livro;
            return true;
        } else {
            System.out.println("Capacidade máxima da biblioteca atingida.");
            return false;
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        for (int i = 0; i < numeroLivros; i++) {
            if (livros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return livros[i];
            }
        }
        return null;
    }

    public void exibirTodosLivros() {
        if (numeroLivros == 0) {
            System.out.println("Nenhum livro disponível na biblioteca.");
        } else {
            for (int i = 0; i < numeroLivros; i++) {
                livros[i].exibirDetalhes();
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca(10);

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 272);
        Livro livro2 = new Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 448);
        Livro livro3 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 304);
        Livro livro4 = new Livro("A Moreninha", "Joaquim Manuel de Macedo", 208);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        System.out.println("Exibindo todos os livros na biblioteca:");
        biblioteca.exibirTodosLivros();

        System.out.println("Buscando livro por título:");
        Livro livroBuscado = biblioteca.buscarLivroPorTitulo("Memórias Póstumas de Brás Cubas");
        if (livroBuscado != null) {
            livroBuscado.exibirDetalhes();
        } else {
            System.out.println("Livro não encontrado.");
        }
    }
}
