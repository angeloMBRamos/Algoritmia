package poo_fp11.bikeStore;

import java.util.ArrayList;

public class BikeDemo {
    public static void main(String[] args) {

        ArrayList<BikeTools> bikeTools = new ArrayList<>();
        bikeTools.add(BikeTools.AGUA);
        bikeTools.add(BikeTools.KIT);


        ArrayList<Sponsor> sponsors = new ArrayList<>();
        sponsors.add(Sponsor.W52);
        sponsors.add(Sponsor.ADIDAS);
        sponsors.add(Sponsor.NIKE);


        MountainBike mountainBike = new MountainBike(10, 18, "azul", 18, 15, 500, true, 2, MountainBikeSuspension.SIMPLES, bikeTools);
        DeliveryBike deliveryBike = new DeliveryBike(20, 21, "verde", 18, 17, 650, false, 10, false, sponsors, 3);

        mountainBike.descer();

        ArrayList<Bicycle> bicycleArrayList = new ArrayList<>();

        BicycleManagment bicycleManagment =new BicycleManagment(bicycleArrayList);

        bicycleArrayList.add(mountainBike);
        bicycleArrayList.add(deliveryBike);

       bicycleManagment.exibirDetalhes();


    }
}