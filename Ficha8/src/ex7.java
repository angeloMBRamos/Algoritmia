import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima o número de linhas
e o número de palavras presentes nesse ficheiro.
 */

public class ex7 {

    public static void printLinesAndWords(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner openFile = new Scanner(file);



        int totalLines = 0;
        int totalWords= 0;
        String line;

        while(openFile.hasNextLine()){
            openFile.nextLine();
            totalLines++;
        }
        openFile.close();
        System.out.println("The file has " + totalLines + " lines.");

        Scanner openFileAgain = new Scanner(file);

        while(openFileAgain.hasNextLine()){
            line= openFileAgain.nextLine();
            String[] array = line.split(" ");
            for (int i = 0; i < array.length; i++) {
                System.out.println("array na posição " + i + " valor é " + array[i] );
                if(!line.isEmpty()){
                    totalWords++;
                }
            }
        }
        System.out.println("The file has a total words of " + totalWords);
    }

    public static void main(String[] args) {

        try{
            printLinesAndWords("exercicio_07.txt");

        } catch (FileNotFoundException exc) {
            System.out.println("Can't find file!!!");
        }
    }


}
