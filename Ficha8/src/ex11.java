
/*
Escreva um programa que leia um ficheiro CSV contendo informações de músicas (nome, artista, género,
duração) para uma matriz.
a. Crie um menu com opções, sendo que cada uma delas albergará as seguintes alíneas.
b. Pesquisar por músicas de um determinado género.
c. Pesquisar músicas de um determinado artista.
d. Pesquisar música com maior duração.
e. Pesquisar músicas com duração acima de um valor especificado.
f. Número de músicas no ficheiro.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ex11 {

    public static void readFile() throws FileNotFoundException {


        File file = new File("exercicio_11.csv");
        Scanner readFile = new Scanner(file);

        String line;
        int totalLines=0, i=0;

        while (readFile.hasNextLine()) {
            readFile.nextLine();
            totalLines++;
        }
        readFile.close();
        System.out.println("Total lines: " + totalLines);

        String[][] matrix = new String[totalLines][4];

        Scanner readFileAgain = new Scanner(file);

        while (readFileAgain.hasNextLine()) {
            line = readFileAgain.nextLine();
            String[] itemsOfTheLine = line.split(",");
            matrix[i][0] = itemsOfTheLine[0];
            matrix[i][1] = itemsOfTheLine[1];
            matrix[i][2] = itemsOfTheLine[2];
            matrix[i][3] = itemsOfTheLine[3];
            i++;
        }

        //Prints the matrix
        for (int j = 0; j < matrix.length; j++) {
            for (int k = 0; k < matrix[0].length; k++) {
                System.out.println("Matrix["+j+"]["+k+"]: " + matrix[j][k]);
            }
            System.out.println("");
        }
        readFileAgain.close();
    }

    public static void menu(){

        int op;

        Scanner input = new Scanner(System.in);

        do {
            //System.out.println("Introduz um numero\n");
            //num = input.nextInt();
            do {
                System.out.println("Menu");
                System.out.println("1. Pesquisar por músicas de um determinado género");
                System.out.println("2. Pesquisar músicas de um determinado artista");
                System.out.println("3. Pesquisar música com maior duração");
                System.out.println("4. Pesquisar músicas com duração acima de um valor especificado");
                System.out.println("5. Número de músicas no ficheiro");
                System.out.println("6. Sair");

                System.out.println("\nEscolhe uma das opções do menu");
                op = input.nextInt();
                System.out.println("Escolheu a opção " +"'"+op+"'" +" do menu\n");

                if(op < 1 || op > 6) {
                    System.out.println("Escolha uma opção válida do Menu");
                }
            }while(op < 1 || op > 6);

            switch(op){
                case 1:
                    System.out.println("Pesquisar por músicas de um determinado género\n");
                    break;
                case 2:
                    System.out.println("Pesquisar músicas de um determinado artista");
                    break;
                case 3:
                    System.out.println("Pesquisar música com maior duração");
                    break;
                case 4:
                    System.out.println("Pesquisar músicas com duração acima de um valor especificado");
                    break;
                case 5:
                    System.out.println("Número de músicas no ficheiro");
                    break;
                case 6:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        }while(op != 6);
    }



    public static void main(String[] args) {

           menu();

    }
}
