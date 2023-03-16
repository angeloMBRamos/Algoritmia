import java.util.Scanner;

//Faça um programa que leia dois números inteiros, representando os valores início e fim de um intervalo e imprima os números inteiros neste intervalo.
public class exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Enter the first number");
        n1 = input.nextInt();
        System.out.println("Enter the second number");
        n2 = input.nextInt();

        while(n1 < n2){
            System.out.println(n1);
            n1++;
        }
        while(n1 > n2){
            System.out.println(n1);
            n1--;
        }
    }
}
