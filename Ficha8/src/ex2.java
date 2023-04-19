import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class ex2 {

    public static void createFile(String pathFile) throws FileNotFoundException {

        String fileContent = "We are the champions!";

        Formatter formatter = new Formatter(new File(pathFile));
        formatter.format(fileContent);
        formatter.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        try {
            createFile("C:/Users/sdev0223/Desktop/Algoritmia/Ficha8/newFile.txt");
            File newFile = new File("newFile.txt");
            Scanner openFile = new Scanner(newFile);
            System.out.println(openFile.nextLine());

        } catch (FileNotFoundException exc) {
            System.out.println("Can't create file");
        }
    }

}
