import java.util.Scanner;

//Escreva uma função que recebe um array de inteiros como parâmetro e retorna o maior valor do array.

public class exercicio6 {

    /**
     * Esta função recebe um array de inteiros como parâmetro e retorna o maior valor do array
     * @return o maior valor do array
     */
    public static int maior (int[] arr){

        int max= arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Declarar variável
        int size;
        //Ler a variável introduzida
        size = input.nextInt();
        //Criação de um array com o tamanho definido na variável size
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduza o numero no array ["+i+"]: ");
            arr[i]=input.nextInt();
        }

        System.out.println("O maior numero que está no array é " + maior(arr) + ".");

    }
}
