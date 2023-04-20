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

        String line;
        int totalLines=0, i=0;
        int oldest;

        while(openfile.hasNextLine()) {
            openfile.nextLine();
            totalLines++;
        }
        System.out.println("Total lines: " + totalLines);

        String[][] matrix = new String[totalLines][2];

        while(openfile.hasNextLine()){
            line = openfile.nextLine();
            String[] itemsOfTheLine = line.split(",");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            i++;
        }
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



