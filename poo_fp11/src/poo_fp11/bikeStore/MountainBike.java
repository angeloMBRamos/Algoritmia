package poo_fp11.bikeStore;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void setBikeTools(ArrayList<BikeTools> bikeTools) {
        this.bikeTools = bikeTools;
    }

    public void descer(){
        System.out.println("Desceu a montanha!");
    }

    public void addBikeTool(BikeTools toolToAdd){
        this.bikeTools.add(toolToAdd);
    }
    public void addBikeTool(ArrayList<BikeTools> toolsToAdd){
        for (BikeTools tools : toolsToAdd) {
            this.bikeTools.add(tools);
        }
    }
    /**
     * IMprimir os Biketools com o respectivo index
     */
    public void printBikeTools(){
        int contador=0;
        System.out.println("Ferramentas da bicicleta: ");
        for(BikeTools tools : this.bikeTools){
            System.out.println(contador+". "+tools);
            contador++;
        }
    }
    /**
     * Método para substituir uma ferramenta das Biketools
     * @param toolToSet
     */
    public void setBikeTool(BikeTools toolToSet){
        Scanner input = new Scanner(System.in);
        printBikeTools();
        System.out.println("Qual a ferramenta que quer substituir: ");
        int opcao = input.nextInt();
        this.bikeTools.set(opcao, toolToSet);
    }

    public void removeBikeTool(){
        Scanner input = new Scanner(System.in);
        printBikeTools();
        System.out.println("Qual a ferramenta que quer remover: ");
        int opcao = input.nextInt();
        this.bikeTools.remove(opcao);
    }

}
