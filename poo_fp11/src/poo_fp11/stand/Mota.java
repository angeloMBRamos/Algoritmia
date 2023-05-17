package poo_fp11.stand;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Mota extends Veículo{


    public Mota(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo) {
        super(marca, modelo, anoFabrico, potencia, cilindrada, consumo);
    }

    public void imprimirFicheiro(String file) {

        try {
            Scanner readFile = new Scanner(new File(file));
            while (readFile.hasNext()) {
                System.out.println(readFile.nextLine());
            }
            readFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
