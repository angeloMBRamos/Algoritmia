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
        MountainBike mountainBike2 = new MountainBike(11, 4,"preta", 27, 15, 350, false, 3, MountainBikeSuspension.SIMPLES, bikeTools);

        DeliveryBike deliveryBike = new DeliveryBike(20, 21, "verde", 18, 17, 650, false, 10, false, sponsors, 3);
        DeliveryBike deliveryBike2 = new DeliveryBike(21, 20, "cinzeta", 22, 19, 600, true, 8, true, sponsors, 2);

        mountainBike.descer();

        ArrayList<Bicycle> bicycleArrayList = new ArrayList<>();
        bicycleArrayList.add(mountainBike);
        bicycleArrayList.add(mountainBike2);
        bicycleArrayList.add(deliveryBike);
        bicycleArrayList.add(deliveryBike2);

        BicycleManagment bicycleManagment =new BicycleManagment(bicycleArrayList);
        bicycleManagment.exibirDetalhes();

        System.out.println();

        mountainBike.addBikeTool(BikeTools.AGUA);
        //mountainBike.setBikeTool(BikeTools.KIT);

        bicycleManagment.exibirDetalhes();


    }
}