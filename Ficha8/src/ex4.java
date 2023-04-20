import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Escreva um programa que leia um ficheiro CSV (Comma-Separated Values) e
imprima o conteúdo na consola.
 */

public class ex4 {

    public static void readCsvFile(String pathFile) throws FileNotFoundException {


        File file = new File(pathFile);
        Scanner  openFile = new Scanner(file);
        String line;
        while(openFile.hasNextLine()){
          line = openFile.nextLine();
            System.out.println(line);
        }
        openFile.close();
    }

    public static void main(String[] args) {

        try {
            File file = new File("exercicio_04.csv");
            readCsvFile(file.getPath());
        }catch (FileNotFoundException exc){
            System.out.println("File not found!!");
        }
    }
}
