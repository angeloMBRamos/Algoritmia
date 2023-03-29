import java.util.Scanner;

/*
Crie  um  jogo,  que  peça  ao  jogador  1  um  valor  entre  0  e  100.
De  seguida,  deverá  permitir  ao  jogador  2  tentar  acertar no valor inserido pelo jogador 1.
A cada iteração, enquanto o valor não for descoberto, deverá informar se o valor introduzido pelo jogador 2 é inferior
ou superior ao valor inserido pelo jogador 1. No final (quando o valor é descoberto) deverá apresentar o número de
tentativas que o jogador 2 necessitou para acertar.
 */

public class exercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numJogador1, numJogador2, nTentativas=0;

        do {
            System.out.println("\n---------------Let's play the game Guess a number---------------\n");
            System.out.println("Player 1 enter a number between 0 and 100");
            numJogador1 = input.nextInt();
            System.out.println("Player 2 which number player 1 entered?");
            numJogador2 = input.nextInt();

            do {

                if(numJogador2 < numJogador1){
                    System.out.println("Wrong number. Player 1 number is higher\n");
                }else {
                    System.out.println("Wrong number. Player 1 number is lower\n");
                }
                System.out.println("Enter another number");
                numJogador2 = input.nextInt();

                nTentativas++;

            }while(numJogador2 != numJogador1);

            if(numJogador2 == numJogador1){
                System.out.println("Great!! That's the right number and you used " + nTentativas + " attempts to guess it!!!");
            }

        }while (numJogador2 != numJogador1);

    }

}
