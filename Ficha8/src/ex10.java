
/*
Escreva um programa que leia um ficheiro CSV contendo informações de vendas (tipo de produto, produto,
quantidade vendida, valor unitario) e calcule o valor total das vendas.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex10 {

    public static void totalSales (String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner readFile = new Scanner(file);


        String line;
        double totalSales=0, totalQuantitySold=0, totalProductPrices=0;
        int totalLines=0, i=0;

        while(readFile.hasNextLine()) {
            readFile.nextLine();
            totalLines++;
        }
        readFile.close();
        System.out.println("Total lines: " + totalLines);

        String[][] matrix = new String[totalLines][4];

        Scanner readFileAgain= new Scanner(file);

        while(readFileAgain.hasNextLine()){
            line = readFileAgain.nextLine();
            String[] itemsOfTheLine = line.split(",");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            matrix[i][2] = itemsOfTheLine[2];
            matrix[i][3] = itemsOfTheLine[3];
            i++;
        }

        //Prints the matrix
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.println("Matrix["+j+"]["+k+"]: "+matrix[j][k]);
            }
            System.out.println("");
        }

        //iterates the matrix and calculates total sales
        for (int j = 1; j < matrix.length; j++) {
            totalSales+=Double.parseDouble(matrix[j][2]) * Double.parseDouble(matrix[j][3]);
        }
        readFileAgain.close();
        System.out.println("Total sales is: " + totalSales);
    }

    public static void main(String[] args) {

        try{
            totalSales("exercicio_10.csv");
        } catch (FileNotFoundException exc) {
            System.out.println("File not found!!!");
        }
    }
}
