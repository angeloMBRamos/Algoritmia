import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int menor;

        System.out.println("Introduza o numero no array[0]");
        array[0] = input.nextInt();
        menor = array[0];

        for (int i = 1; i < 10; i++) {
            System.out.println("Introduza o numero no array["+i+"]");
            array[i] = input.nextInt();

            if(array[i] < menor){
                menor = array[i];
            }
        }

        System.out.println("O menor numero é: " + menor);
    }
}
