package ex5;

public class Pessoa {

    private String nome, email, telemovel;
    private int idade;

    public Pessoa(String nome, String email, String telemovel, int idade) {
        this.nome = nome;
        this.email = email;
        this.telemovel = telemovel;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelemovel() {
        return telemovel;
    }

    public int getIdade() {
        return idade;
    }


}
