package poo_fp11.farm;

import java.util.ArrayList;

public class Farm {

    ArrayList<Animal> animais;

    public Farm(ArrayList<Animal> quinta) {
        this.animais = quinta;
    }

    public void makeNoise(){
        for(Animal farm : this.animais ){
           farm.fazerBarulho();
        }
    }
}
