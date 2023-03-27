import java.util.Scanner;

/*Escreva um programa que requisite dois valores.
O programa deverá utilizá-los como operandos para as  seguintes  operações  aritméticas:
soma,  subtração,  multiplicação  e  divisão.  Apresente  o  resultado  das operações e
testa os resultados obtidos com vários casos.
 */

public class exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        int num1, num2;

        // Soma
        System.out.println("Enter a number");
        num1 = input.nextInt();
        System.out.println("Enter another number");
        num2 = input.nextInt();
        int soma = num1 + num2;
        System.out.println("The sum is " + soma);

        // Subtração
        System.out.println("Enter a number");
        num1 = input.nextInt();
        System.out.println("Enter another number");
        num2 = input.nextInt();
        int subtraction = num1 - num2;
        System.out.println("The subtraction is " + subtraction);

        // Multiplicação
        System.out.println("Enter a number");
        num1 = input.nextInt();
        System.out.println("Enter another number");
        num2 = input.nextInt();
        int multiply = num1 * num2;
        System.out.println("The multiplication is " + multiply);

        // Division
        System.out.println("Enter a number");
        num1 = input.nextInt();
        System.out.println("Enter another number");
        num2 = input.nextInt();
        double division = num1 / num2;
        System.out.println("The division is " + division);

    }
}
