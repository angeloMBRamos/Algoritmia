import java.util.Scanner;

/*Escreva um programa que determine a média aritmética de um conjunto de 3 valores introduzidos pelo utilizador.
Tendo  em  consideração  os  valores  introduzidos,  deverá  também  apresentar  a  média  ponderada
considerando as seguintes ponderações: 20%, 30%, 50%.
 */

public class exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Enter your first number:");
        num1 = input.nextInt();
        System.out.println("Enter your second number:");
        num2 = input.nextInt();
        System.out.println("Enter your third number:");
        num3 = input.nextInt();
        double average = (num1 + num2 + num3)/3;
        System.out.println("The average is " + average);
        double  weightedAverage = (num1 * 0.2) + (num2 * 0.3) + (num3 * 0.5);
        System.out.println("The weighted average is " + weightedAverage);
    }
}
