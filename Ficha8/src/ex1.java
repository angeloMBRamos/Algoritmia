import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
Escreva um programa que leia o conteúdo de um ficheiro de texto e imprima
na consola. Escreva um programa que leia o conteúdo de um ficheiro de texto e
imprima na consola.
 */

public class ex1 {

    public static void readFile() throws FileNotFoundException {

        File file = new File("exercicio_01_Alternativa02.txt");
        Scanner openFile = new Scanner(file);
        while(openFile.hasNext()){
            System.out.println(openFile.nextLine());
        }
        openFile.close();
    }


    public static void main(String[] args) {

      try {
          readFile();
      }catch (FileNotFoundException exc){
          System.out.println("File not found");
      }
    }

}