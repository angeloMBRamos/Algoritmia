import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;

/*
Escreva um programa que leia o conteúdo de um ficheiro de texto e
grave-o num outro arquivo.
 */

public class ex3 {

    public static void readCopyFile(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner openFile = new Scanner(file);
        String line;

        File anotherFile = new File("ficheiro.txt");
       PrintWriter createFile = new PrintWriter(anotherFile);

        while(openFile.hasNextLine()){
            line=openFile.nextLine();
            createFile.print(line);
        }
        openFile.close();
        createFile.close();
    }

    public static void main(String[] args) throws FileNotFoundException {

        try{
            readCopyFile("exercicio_01.txt");

        }catch (FileNotFoundException exc){
            System.out.println("Can´t copy file!");
        }
    }
}
