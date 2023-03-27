import java.util.Scanner;

/*Escreva um programa que requisite ao utilizador o preço de 3 produtos adquiridos.
 Apresente o valor a pagar, considerando que deverá ter um desconto de 10% sobre o total dos produtos.
 */


public class exercicio7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2, num3;

        System.out.println("Enter the value of the first product:");
        num1 = input.nextInt();
        System.out.println("Enter the value of the second product");
        num2 = input.nextInt();
        System.out.println("Enter the value of the third product");
        num3 = input.nextInt();

        int totalPrice = num1 + num2 + num3;
        double discount = totalPrice - (totalPrice * 0.1);
        System.out.println("The final price of your product with discount is " + discount);
    }
}
