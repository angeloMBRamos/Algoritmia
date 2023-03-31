import java.util.Scanner;

//Escreva uma função que recebe um array de inteiros como parâmetro e retorna o menor valor do array.
public class exercicio7 {

    public static int menor(int[] arr){

        int menor= arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < menor ){
                menor = arr[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduz um numero no array [" + i + "]");
            arr[i] = input.nextInt();
        }
        System.out.println("O menor numero que está no array é " + menor(arr) + ".");
    }

}
