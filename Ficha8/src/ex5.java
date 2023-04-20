import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Escreva um programa que leia um ficheiro de texto contendo números inteiros separados por espaço e
calcule a soma desses números.
 */
public class ex5 {

    public static void readFileAndAddNumbers(String pathfile) throws FileNotFoundException {

        File file = new File(pathfile);
        Scanner openFile = new Scanner(file);

        String line;
        double total=0;

        while(openFile.hasNextLine()){
            line=openFile.nextLine();
            String[] itemsOfTheLine = line.split(" ");
            for (int i = 0; i < itemsOfTheLine.length; i++) {
                total+=Double.parseDouble(itemsOfTheLine[i]);
            }
        }
        openFile.close();
        System.out.println("Total is: " + total);
        }

    public static void main(String[] args) {

        try {
            File file = new File("exercicio_05_1999.txt");
            readFileAndAddNumbers(file.getPath());
        }catch(FileNotFoundException exc) {
            System.out.println("Can't find file!!");
        }
    }

}
