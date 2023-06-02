package ex3;

public abstract class Document {
    private String autor, nome, extensão;

    public Document(String autor, String nome, String extensão) {
        this.autor = autor;
        this.nome = nome;
        this.extensão = extensão;
    }

    public String getAutor() {
        return autor;
    }

    public String getNome() {
        return nome;
    }

    public String getExtensão() {
        return extensão;
    }

    public abstract void open();
    public abstract void save();
    public abstract void close();
}
