import java.util.Scanner;

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