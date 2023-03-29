import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        boolean crescente = true;

        System.out.println("Introduza o numero no array[0]");
        array[0] = input.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println("Introduza o numero no array["+i+"]");
            array[i] = input.nextInt();

            if(array[i] < array[i - 1]){
                System.out.println("Deixou de ser crescente");
                crescente = false;
            }
        }

        if(crescente){
            System.out.println("Os elementos estão em ordem crescente");
        }else {
            System.out.println("Os elementos não estão em ordem crescente");
        }
    }
}
