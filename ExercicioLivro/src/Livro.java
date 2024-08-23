public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Número de Páginas: " + numeroPaginas);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis", 272);
        Livro livro2 = new Livro("Grande Sertão: Veredas", "João Guimarães Rosa", 448);
        Livro livro3 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 304);
        Livro livro4 = new Livro("A Moreninha", "Joaquim Manuel de Macedo", 208);

        livro1.exibirDetalhes();
        System.out.println();
        livro2.exibirDetalhes();
        System.out.println();
        livro3.exibirDetalhes();
        System.out.println();
        livro4.exibirDetalhes();
    }
}
