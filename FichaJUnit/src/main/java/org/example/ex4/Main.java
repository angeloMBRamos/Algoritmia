package org.example.ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double largura, altura;

        System.out.println("Insira a largura: ");
        largura= input.nextDouble();

        System.out.println("Insira a altura: ");
        altura= input.nextDouble();

        Rectangulo rectangulo = new Rectangulo(largura, altura);

        System.out.println("A area do rectângulo é: " + rectangulo.areaRectangulo());
        System.out.println();
        System.out.println("O perimetro da rectângulo é: " + rectangulo.perimetroRectangulo());

    }
}
