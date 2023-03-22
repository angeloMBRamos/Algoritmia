import java.util.Scanner;

/*
Implemente um programa que leia a opção do menu desejada (opções: 1. Criar, 2. Atualizar, 3. Eliminar, 4. Sair).
Se  uma  das  opções  1,  2  e  3  for  escolhida,  deverá  apresentar  um  texto  com  a  opção  escolhida.
Caso  a  escolha  esteja fora das opções válidas, deverá informar o utilizador.
De seguida, deverá apresentar novamente o menu para poder selecionar novas opções até que a opção 4 seja escolhida.
 */

public class exercicio2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        do {
            do {
            System.out.println("Menu");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");
            System.out.println("Choose an option from the menu");
            num = input.nextInt();

            if(num < 1 || num > 4) {
                System.out.println("Please choose a valid option from the Menu");
            }

            }while(num < 1 || num > 4);

            switch(num){
                case 1:
                    System.out.println("1. Criar");
                    break;
                case 2:
                    System.out.println("2. Atualizar");
                    break;
                case 3:
                    System.out.println("3. Eliminar");
                    break;
                case 4:
                    System.out.println("4. Sair");
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }while(num != 4);

    }
}