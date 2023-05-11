package ex2;

public class Main {
    public static void main(String[] args) {

        Cao cao1 = new Cao("Boby", "Pastor alemão");
        Cao cao2 = new Cao("Bolinhas", "Buldog");
        Cao cao3 = new Cao("Vegeta", "Guerreiro do espaço");

        System.out.println("O nome do primeiro cão é " + cao1.getNome());
        System.out.println("A raça deste cão é " + cao1.getRaca());
        System.out.println();
        cao1.setNome("Passaro maluco");
        System.out.println("O cão pasou a chamar-se "+ cao1.getNome());
        System.out.println();
        System.out.println("O nome do 2º cão é " + cao2.getNome());
        System.out.println("A raça deste cão é " + cao2.getRaca());
        cao2.setRaca("chiaua");
        System.out.println("A raça deste cão passou a ser " + cao2.getRaca());
        System.out.println();
        System.out.println("O nome do 3º cão é " + cao3.getNome());
        System.out.println("A raça deste cão é " + cao3.getRaca());

        cao1.ladrar();
    }
}
