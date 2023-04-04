import java.util.Scanner;

//Implemente um programa que permita adicioanr o preço de produtos
// a um array de tamanho 10 e calcular o seu total.

public class exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double[] precos = new double[10];

        double total=0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Introduza o preço nos preços ["+i+"]");
            precos[i] = input.nextDouble();
            total = total + precos[i];
        }

        System.out.println("O total dos preços introduzidos é: " + total);

    }
}
