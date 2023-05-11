package poo_fp11.bikeStore;

import java.util.ArrayList;

public class DeliveryBike extends Bicycle{
    private float basketCapacity;
    private boolean isFrontBasket;
    final int sponsorSize = 10;
    private ArrayList<Sponsor> sponsor;
    private int numberOfSponsor;

    public DeliveryBike(int id, int numberOfGears, String mainColor, float wheelSize, float bikeLength, float price, boolean adjustableSeatPost, float basketCapacity, boolean isFrontBasket, ArrayList<Sponsor> sponsor, int numberOfSponsor) {
        super(id, numberOfGears, mainColor, wheelSize, bikeLength, price, adjustableSeatPost);
        this.basketCapacity = basketCapacity;
        this.isFrontBasket = isFrontBasket;
        this.sponsor = sponsor;
        this.numberOfSponsor = numberOfSponsor;
    }

    public float getBasketCapacity() {
        return basketCapacity;
    }

    public boolean isFrontBasket() {
        return isFrontBasket;
    }

    public int getSponsorSize() {
        return sponsorSize;
    }

    public ArrayList<Sponsor> getSponsor() {
        return sponsor;
    }

    public int getNumberOfSponsor() {
        return numberOfSponsor;
    }


}

