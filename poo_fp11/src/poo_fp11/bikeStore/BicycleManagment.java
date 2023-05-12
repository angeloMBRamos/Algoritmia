package poo_fp11.bikeStore;

import java.util.ArrayList;

public class BicycleManagment {
    private ArrayList<Bicycle> bicycles;
    private MountainBike mountainBike;
    private DeliveryBike deliveryBike;

    public BicycleManagment(ArrayList<Bicycle> bicycles) {
        this.bicycles = bicycles;
    }

    public void exibirDetalhes(){
        for (Bicycle bicycle : bicycles) {

            System.out.println("ID: " + bicycle.getId());
            System.out.println("Price: " + bicycle.getPrice());
            System.out.println("Main color: " + bicycle.getMainColor());
            System.out.println("Bike length: " + bicycle.getBikeLength());
            System.out.println("Number of gears: " + bicycle.getNumberOfGears());
            System.out.println("Wheel size: " + bicycle.getWheelSize());
            System.out.println("With adjustable seat post: " + bicycle.isAdjustableSeatPost());

            if(bicycle instanceof MountainBike){
                MountainBike bikeMonte = (MountainBike) bicycle;
                System.out.println("Ferramentas: "+bikeMonte.getBikeTools());
                System.out.println("Suspensao: "+ bikeMonte.getTipoSuspensao());
                System.out.println("Number of lights " + bikeMonte.getNumberOfligths());
                System.out.println();
            }
            if(bicycle instanceof DeliveryBike){
                DeliveryBike bikeEntregas = (DeliveryBike) bicycle;
                System.out.println("Sponsor: " + bikeEntregas.getSponsor());
                System.out.println("Number of sponsors: " + bikeEntregas.getNumberOfSponsor());
                System.out.println("With front basket: " + bikeEntregas.isFrontBasket());
                System.out.println();
            }
        }
    }
}
