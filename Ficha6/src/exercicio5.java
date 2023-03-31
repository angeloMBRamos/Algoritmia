import java.util.Scanner;

/*Implemente um programa que contenha uma função com menu de opções que permitam invocar as funções
desenvolvidas nos exercícios 1 a 3 (ou 4), devendo o número ser escolhido antes das opções do menu.
 */
public class exercicio5 {

    public static int impar;

    public static boolean parOuImpar(int num){

        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean positivoOuNegativo(int num){
        if(num<0){
            return true;
        }else{
            return false;
        }
    }

    public static boolean primo(int n) {

        if(n<=1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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
                System.out.println("Escolheu a opção " + op + " do menu\n");

                if(op < 1 || op > 4) {
                    System.out.println("Escolha uma opção válida do Menu");
                }
            }while(op < 1 || op > 4);

            switch(op){
                case 1:
                    if(parOuImpar(num))
                        System.out.println("Numero é par");
                    else
                        System.out.println("Numero é impar");
                    break;
                case 2:
                    if(positivoOuNegativo(num))
                        System.out.println("Numero é positivo");
                    else
                        System.out.println("Numero é negativo");
                    break;
                case 3:
                    if(primo(num))
                        System.out.println("Numero é primo");
                    else
                        System.out.println("Numero não é primo");
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


