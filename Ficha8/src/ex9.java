
/*
Escreva um programa que leia o conteúdo de um ficheiro de texto e
imprima as dez palavras mais frequentes no ficheiro.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex9 {

    public static void copyWordsToFile(String pathFile) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner openFile = new Scanner(file);
        int wordCounter = 0;
        int totalLines = 0;
        String word = "turma";

        while (openFile.hasNextLine()) {
            openFile.nextLine();
            totalLines++;
        }
        openFile.close();
        System.out.println("Total lines: " + totalLines);

        //String[][] matrix = new String[totalLines][2];

        Scanner openFileAgain = new Scanner(file);

        while (openFileAgain.hasNextLine()) {
            String[] textArray = openFileAgain.nextLine().split("[,. ]");
            for (int j = 0; j < textArray.length; j++) {
                if(!textArray[j].isEmpty()){
                    System.out.println("na posição: " + j + " tenho o valor: " + textArray[j]);
                    wordCounter++;
                }
            }
        }
        System.out.println("the file has a total of " + wordCounter + " words.");

    }



    public static void main(String[] args) {
        try{
            copyWordsToFile("exercicio_09.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!!");
        }
    }


}
