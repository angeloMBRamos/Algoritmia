import java.util.Scanner;

/*Escreva um programa que leia dois valores inteiros e os armazene na variáveis num1 e num2.
 Permute o valor das variáveis sem criar variáveis adicionais.
 */

public class exercicio6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter first number:");
        num1 = input.nextInt();
        System.out.println("Enter second number:");
        num2 = input.nextInt();

        // Mudar o valor das variáveis

        num1 = num1 - num2;
        num2 = num2 + num1;
        num1 = num2 - num1;

        System.out.println("Your first number is now your second number that is " + num1);
        System.out.println("Your second number is now your first number, that is " + num2);

    }
}

