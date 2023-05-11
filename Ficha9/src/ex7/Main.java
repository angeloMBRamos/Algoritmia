package ex7;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("Biceps in the night", "Pássaro Maluco", "Street art", "ISBN-231-265-125", 50);
        Livro livro2 = new Livro("Nunca matarás", "Júlia Navarro", "Ficção", "ISBN-123-123-125", 700);
        livro1.exibirDetalhes();
        System.out.println();
        livro2.exibirDetalhes();


    }
}
