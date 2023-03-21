package src;

import java.util.Scanner;
/*Implemente  um  programa  que  peça  ao  utilizador  dois  valores  e  um  carácter  representando
uma das  quatro  operações aritméticas (+, -,  *,  /).  Apresente  o  resultado  de  aplicar a
operação correspondente  aos  valores.  No  final, deverá  perguntar  ao  utilizador  se  deseja  repetir,
permitindo-lhe efetuar novos cálculos.
Exemplo:Deseja continuar? (introduza s/n).
 */
public class exercicio1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1, n2, result;
        String operator, choice;


        do {
            System.out.println("Enter a number");
            n1 = input.nextInt();
            System.out.println("Enter another number");
            n2 = input.nextInt();
            System.out.println("Enter your operator");
            operator= input.next();

            switch (operator){
                case "+":
                    result = n1 + n2;
                    System.out.println(result);
                    break;

                case "-":
                    result = n1 - n2;
                    System.out.println(result);
                    break;

                case "*":
                    result = n1 * n2;
                    System.out.println(result);
                    break;

                case "/":
                    result = n1 / n2;
                    System.out.println(result);
                    break;

                default:
                    System.out.println("Invalid operator");
            }
            System.out.println("Wish to continue?");
            choice = input.next();

        } while (choice.equals("s"));




    }
}
