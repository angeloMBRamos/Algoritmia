import java.util.Scanner;

//Faça um programa que leia um número inteiro e imprima os números inteiros de 0 até este número.
public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("Enter your number");
        n = input.nextInt();

        while(n >= 0){
            System.out.println(n);
            n--;
        }
    }
}
