import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
Escreva um programa que leia o conteúdo de um ficheiro de texto e grave apenas
as linhas que contêm uma palavra específica num outro ficheiro.
 */
public class ex8 {

    public static void copyWordsToAnotherFile(String pathFile, String word) throws FileNotFoundException {

        File file = new File(pathFile);
        Scanner readFile = new Scanner(file);
        String line;
        int wordCounter=0;

        File anotherFile = new File("ficheiro1.txt");
        PrintWriter writeFile = new PrintWriter(anotherFile);

        while(readFile.hasNextLine()){
            line= readFile.nextLine();
            String[] array = line.split("[, ]");
            for (int i = 0; i < array.length; i++) {
                //System.out.println("na posição: " + i + " tenho o valor: " + array[i]);
                if(array[i].equals(word)){
                    System.out.println("This is the line with the word: " + line);
                    wordCounter++;
                    writeFile.print(line);
                }
            }
        }
        System.out.println("The word [" +word+ "] appears " + wordCounter + " times in the text.");
        readFile.close();
        writeFile.close();
    }
    public static void main(String[] args) {

        String userWord;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the word you wish to find in the text:");
        userWord = input.next();

        try{
            copyWordsToAnotherFile("exercicio_08.txt", userWord);
        } catch (FileNotFoundException exc) {
            System.out.println("Can't find file!!");
        }
    }
}
