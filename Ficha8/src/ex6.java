import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Escreva um programa que leia um ficheiro de texto contendo nomes e idades separados por vírgulas e
imprima o nome da pessoa mais velha na consola.
 */
public class ex6 {

    public static void oldestPerson(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner openfile = new Scanner(file);


        String line, nameOldest=" ";
        int totalLines=0, i=0, oldest=0;


        while(openfile.hasNextLine()) {
            openfile.nextLine();
            totalLines++;
        }
        openfile.close();
        System.out.println("Total lines: " + totalLines);

        String[][] matrix = new String[totalLines][2];

        Scanner openFileAgain= new Scanner(file);

        while(openFileAgain.hasNextLine()){
            line = openFileAgain.nextLine();
            String[] itemsOfTheLine = line.split(",");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            i++;
        }

        //Prints the matrix
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.println("Matrix["+j+"]["+k+"]: "+matrix[j][k]);
            }
            System.out.println("");
        }

        /*Another way to print the matrix
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.print(matrix[j][k]+"\t");
            }
            System.out.println("");
        }*/

        for (int j = 0; j < matrix.length; j++) {
            System.out.println("I'm comparing "+matrix[j][1]+" with "+oldest);
                if(Integer.parseInt(matrix[j][1]) > oldest){
                    System.out.println("A pessoa mais velha mudou, passou a ser "+matrix[j][0]+" que tem "+matrix[j][1]+ " anos...");
                    oldest = Integer.parseInt(matrix[j][1]);
                    nameOldest = matrix[j][0];
                }
            }
        System.out.println("The oldest person is " + nameOldest + " with " + oldest + " years old");
        openFileAgain.close();
            }
    public static void main(String[] args) {

        try{
            File file = new File("exercicio_06.txt");
            oldestPerson(file.getPath());
        }catch (FileNotFoundException exc){
            System.out.println("File not found");
        }

    }

}



