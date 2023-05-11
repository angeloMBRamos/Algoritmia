package ex1;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Ângelo", 35, 1.80);

        System.out.println("O nome da pessoa é " + pessoa.getNome());
        System.out.println("A idade da pessoa é " + pessoa.getIdade());
        System.out.println("A altura da pessoa é " + pessoa.getAltura());
    }


}