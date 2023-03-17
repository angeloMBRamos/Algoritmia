import java.util.Scanner;

/*Faça um programa que leia um número inteiro e imprima os números pares entre 2 e o número lido inclusive.
 Suponha que o número lido da entrada será maior que 2.
*/
public class exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, n1=2;

        System.out.println("Enter a number");
        n = input.nextInt();


        while(n1 <= n){
            System.out.println(n1);
            n1 = n1 + 2;

        }
    }
}
