import java.util.Scanner;

/*Faça um algoritmo que leia dois números inteiros, representando os valores início e fim
 de um intervalo e imprima os múltiplos de 5 entre eles.
*/

public class exercicio11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Enter your first number");
        n1 = input.nextInt();
        System.out.println("Enter your second number");
        n2 = input.nextInt();

        while(n1 <= n2){
            if(n1%5==0){
                System.out.println(n1);
            }
            n1++;
        }
        while(n1 >= n2){
            if(n1%5==0){
                System.out.println(n1);
            }
            n1--;
        }
    }
}
