import java.util.Scanner;

//Leia dois números inteiros e escreva o maior deles

public class exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1, num2;

        System.out.println("Enter your first number:");
        num1 = input.nextInt();
        System.out.println("Enter your second number:");
        num2 = input.nextInt();

        if(num1 == num2){
            System.out.println("The numbers are equal!!");
        } else if(num1 > num2){
            System.out.print("The biggest number is " + num1);
        } else {
            System.out.print("The biggest number is " + num2);
        }
    }
}