package ex2;

public class Main {

    public static void main(String[] args) {
        Carro carro = new Carro("BMW", 2020);
        carro.acelerar();
        carro.frear();
        carro.transportar();

        System.out.println("-----------------------------");

        Mota mota = new Mota("Honda", 2015);
        mota.acelerar();
        mota.frear();
        mota.transportar();

    }


}
