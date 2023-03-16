import java.util.Scanner;

//Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.
public class exercicio6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, anterior, seguinte;

        System.out.println("Enter a number");
        n = input.nextInt();
        anterior = n - 5;
        seguinte = n + 5;

        while(anterior <= seguinte ){
            if(anterior != n)
                System.out.println(anterior);
            anterior++;
        }
    }
}
