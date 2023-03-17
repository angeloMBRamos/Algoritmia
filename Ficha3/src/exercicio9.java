import java.util.Scanner;

/*Faça um programa que leia um número inteiro (variável limite), um incremento (variável salto) e imprima os números inteiros de 0 até limite inclusive, com incremento de salto.
        Suponha que limite e salto são maiores que zero.
        Exemplo:
        Valores lidos:
        10 (limite) e 3 (salto)Saída do algoritmo: 0 3 6 9
*/

public class exercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n=0,n1,jump;

        System.out.println("Enter your number");
        n1 = input.nextInt();
        System.out.println("Enter the jump number");
        jump = input.nextInt();

        while(n < n1 ){
                n = n + jump;
                System.out.println(n);

        }


        }
    }
