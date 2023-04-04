import java.util.Scanner;

//Escreva um programa que lê um array de tamanho 10 e encontra o maior elemento.


public class exercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[10];
        int maior;

        System.out.println("Introduza o numero no array[0]");
        array[0] = input.nextInt();
        maior = array[0];

        for (int i = 1; i < 10; i++) {
            System.out.println("Introduza o numero no array["+i+"]");
            array[i] = input.nextInt();

            if(array[i] > maior){
                maior = array[i];
            }
        }

        System.out.println("O maior numero é: " + maior);


    }
}
