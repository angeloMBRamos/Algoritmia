import java.util.Scanner;

//Escreva um programa que lê um array de tamanho 10 e calcula a média dos elementos.

public class exercicio5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] array = new double[10];

        double total=0, media;

        for (int i = 0; i < 10; i++) {

            System.out.println("Introduza o numero no array ["+i+"]");
            array[i] = input.nextDouble();
            total = total + array[i];
        }
        media = total/10;
        System.out.println("A média é: " + media);
    }
}
