import java.util.Scanner;

// Implemente um programa que permita adicionar 10 números inteiros
// a um array e que os imprima pela ordem de inserção.

public class exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Introduza o numero no array["+i+"]");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("array["+i+"]: " + array[i]);
            
        }


    }
}