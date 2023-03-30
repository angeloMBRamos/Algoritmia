import java.util.Scanner;

/*Implemente um programa que contenha uma função com menu de opções que permitam invocar as funções
desenvolvidas nos exercícios 1 a 3 (ou 4), devendo o número ser escolhido antes das opções do menu.
 */
public class exercicio5 {

    public static void parOuImpar(int num){
        if(num%2==0){
            System.out.println("The number is par");
        }else{
            System.out.println("The number is impar");
        }
    }

    public static void positivoOuNegativo(int num){
        if(num<0){
            System.out.println("O numero " + num +  " é negativo.");
        }else{
            System.out.println("O número " + num + " é positivo.");
        }
    }

    public static void primo(int num){

        boolean primo = true;
        if(num <= 1){
            primo=false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                primo = false;
            }
        }
        if (primo==true){
            System.out.println(" O numero " + num + " é primo");
        }else {
            System.out.println("O numero " + num + " não é primo");
        }
    }
    public static void menu(){

        int num, op;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Introduz um numero\n");
            num = input.nextInt();

            do {

                System.out.println("Menu");
                System.out.println("1. Par ou impar");
                System.out.println("2. Positivo ou negativo");
                System.out.println("3. Primo");
                System.out.println("4. Sair");

                System.out.println("\nEscolhe uma das opções do menu\n");
                op = input.nextInt();

                if(op < 1 || op > 4) {
                    System.out.println("Escolha uma opção válida do Menu");
                }

            }while(op < 1 || op > 4);

            switch(op){
                case 1:
                    parOuImpar(num);
                    break;
                case 2:
                    positivoOuNegativo(num);
                    break;
                case 3:
                    primo(num);
                    break;
                case 4:
                    System.out.println("4. Sair");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }while(op != 4);

        }

    public static void main(String[] args) {

        menu();

    }
    }


