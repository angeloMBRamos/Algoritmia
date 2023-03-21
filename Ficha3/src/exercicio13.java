import java.util.Scanner;

/*Escreva um programa que calcule e imprima o fatorial de um
número inteiro não-negativo n. Utilize o ciclo while.
 */
public class exercicio13 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, fatorial=1, control=1;

        System.out.println("Enter a number");
        n = input.nextInt();

        while(control <= n){
            fatorial = fatorial * control;
            control++;
        }
        System.out.println("The fatorial of " + n + " is " + fatorial);

    }
}
