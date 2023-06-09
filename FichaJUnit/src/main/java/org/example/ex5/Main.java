package org.example.ex5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double aumento;

        Funcionario angelo = new Funcionario("Ângelo Miguel",1000, "Dev");

        angelo.exibirDados();
        System.out.println();

        System.out.println("Percentagem de aumento: ");
        aumento=input.nextDouble();

        angelo.aumentarSalario(aumento);
        System.out.println();
        angelo.exibirDados();
    }
}
