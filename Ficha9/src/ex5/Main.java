package ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Insira a marca: ");
        String marca = input.next();
        System.out.println();
        System.out.print("Insira o modelo: ");
        String modelo = input.next();
        System.out.println();
        System.out.print("Insira o ano: ");
        int ano = input.nextInt();


        Carro carro = new Carro(marca, modelo, ano);

        System.out.println("Deseja ligar o carro? (s/n)");
        String escolha = input.next();

        if(escolha.equals("s")){
            carro.ligar();
        }
    }
}
