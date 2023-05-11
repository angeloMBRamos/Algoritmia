package ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Declarar variáveis
        double raio;

        //Ler o raio do utilizador
        System.out.print("Insira o valor do raio: ");
        raio= input.nextDouble();

        Circulo circulo = new Circulo(raio);

        System.out.println("O valor do raio é " + circulo.getRaio());
        System.out.println("Perimetro: " + circulo.circunferenciaCirculo());
        System.out.println("A area: " + circulo.areaCirculo());
        System.out.println();
        circulo.setRaio(3.5);
        System.out.println("O raio foi modificado para " + circulo.getRaio());
        System.out.println("Perimetro: " + circulo.circunferenciaCirculo());
        System.out.println("A area: " + circulo.areaCirculo());

    }
}
