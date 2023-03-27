import java.util.Scanner;

/*
Escreva  um  programa  que  faça  a  soma  de  dois  números  introduzidos  pelo  utilizador.
Apresente  o  resultado da operação.
*/
public class exercico1 {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);

                // Declarar variáveis
                int num1, num2, soma;

                // Ler variável num1
                System.out.println("Enter a number: ");
                num1 = input.nextInt();

                // Ler variável num2
                System.out.println("Enter another number: ");
                num2 = input.nextInt();

                soma = num1 + num2;

                System.out.println("The sum is: " + soma);

            }
        }
