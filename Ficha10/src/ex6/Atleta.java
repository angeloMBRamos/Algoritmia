package ex6;

public class Atleta {
    private String nome, modalidade, origem;
    private double altura, peso;

    public Atleta(String nome, String modalidade, String origem, double altura, double peso) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.origem = origem;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public String getOrigem() {
        return origem;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
}
