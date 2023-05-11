package poo_fp11.bikeStore;

import java.util.ArrayList;

public class MountainBike extends Bicycle{
    private int numberOfligths;
    private MountainBikeSuspension tipoSuspensao;
    private ArrayList<BikeTools> bikeTools;

    public MountainBike(int id, int numberOfGears, String mainColor, float wheelSize, float bikeLength, float price, boolean adjustableSeatPost, int numberOfligths, MountainBikeSuspension tipoSuspensao, ArrayList<BikeTools> bikeTools) {
        super(id, numberOfGears, mainColor, wheelSize, bikeLength, price, adjustableSeatPost);
        this.numberOfligths = numberOfligths;
        this.tipoSuspensao = tipoSuspensao;
        this.bikeTools = bikeTools;
    }

    public int getNumberOfligths() {
        return numberOfligths;
    }

    public MountainBikeSuspension getTipoSuspensao() {
        return tipoSuspensao;
    }

    public ArrayList<BikeTools> getBikeTools() {
        return bikeTools;
    }

}
