package org.example.ex3;

import org.example.ex2.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Tigre", Alimento.CARNE);

        animal.comer(Alimento.FRUTAS);


    }
}
