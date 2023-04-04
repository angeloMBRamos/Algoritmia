import java.util.Scanner;

/* Implemente um programa que armazene num array 10 valores pedidos ao utilizador,
e retorne o maior valor par inserido. Caso não exista, deverá informar o utilizador.
 */

public class exercicio7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Introduza valores no array [0]");
        array[0] = input.nextInt();

        int maior=0;

        for (int i = 1; i < array.length ; i++) {
            System.out.println("Introduza valor no array ["+i+"]");
            array[i] = input.nextInt();
        }

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maior && array[i]%2 ==0){
              maior = array[i];
            }
        }

        System.out.println("O maior numero par é o " + maior);
    }
}
