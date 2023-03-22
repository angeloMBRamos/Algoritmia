import java.util.Scanner;

/*
Escreva um programa que indique se um número pedido ao utilizador é primo.
(Chamamos de número primo um número natural que possui dois divisores: 1 e ele mesmo).
 */
public class exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, multiplo=0;

        System.out.println("Enter a number");
        n = input.nextInt();

        if(n < 1){
            multiplo=1;
        }

        for (int i = 2; i < n; i++) {
            if(n%i == 0) {
                multiplo=1;
            }

            }

        if (multiplo == 1){
            System.out.println(" The number " + n + " is not prime");
        }else {
            System.out.println("The number " + n + " is prime");
        }

        }

    }
