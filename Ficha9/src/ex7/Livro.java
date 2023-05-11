package ex7;

public class Livro {
    private String titulo, autor, categoria, ISBN;
    private int numPaginas;

    public Livro(String titulo, String autor, String categoria, String ISBN, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.ISBN = ISBN;
        this.numPaginas = numPaginas;
    }

    public void exibirDetalhes(){
        System.out.println("O titulo do livro é " + this.titulo);
        System.out.println("O autor do livro é " + this.autor);
        System.out.println("A categoria do livro é " + this.categoria);
        System.out.println("O livro tem " + this.numPaginas + " páginas");
        System.out.println("O ISBN do livro é " + this.ISBN);
    }
}
