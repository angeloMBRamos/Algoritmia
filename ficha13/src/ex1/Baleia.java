package ex1;

public class Baleia extends Animal implements Aquatico {

    public Baleia(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("Glub Glub..");

    }

    @Override
    public void nadar() {
        System.out.println("Baleia a nadar...");
    }
}
