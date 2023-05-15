package poo_fp11.farm;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cao bolas = new Cao();
        Galinha galinha = new Galinha();
        Gato gato = new Gato();
        Porco porco = new Porco();
        Vaca vaca = new Vaca();

        ArrayList<Animal> animalArrayList = new ArrayList<>();
        animalArrayList.add(new Cao());
        animalArrayList.add(galinha);
        animalArrayList.add(gato);
        animalArrayList.add(porco);
        animalArrayList.add(vaca);
        animalArrayList.add(new Pato());

        Farm farm = new Farm(animalArrayList);
        farm.makeNoise();

    }
}
