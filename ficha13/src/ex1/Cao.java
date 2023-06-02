package ex1;

public class Cao extends Animal implements Terrestre{


    public Cao(String nome, String especie) {
        super(nome, especie);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auf Auf..");
    }

    @Override
    public void andar() {
        System.out.println("Cão a andar...");
    }

    @Override
    public void saltar() {
        System.out.println("Cão a saltar...");
    }


}
