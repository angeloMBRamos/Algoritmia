package ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String escolha;

        System.out.println("Qual o tipo de Taco (Carne de vaca, Carne de frango, Vegetariano): ");
        escolha = input.nextLine();

        Taco tacoUser = Tacofactory.createTaco(escolha.toUpperCase());

        tacoUser.prepare();
        tacoUser.bake();
        tacoUser.box();


    }
}
