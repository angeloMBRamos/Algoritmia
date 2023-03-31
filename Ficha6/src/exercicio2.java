import java.util.Scanner;

//Implemente uma função que determine se um número (passado por argumento) é positivo ou negativo.
public class exercicio2 {

    public static boolean positivoOuNegativo(int num){
        if(num<0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Introduz um numero");
        num = input.nextInt();

        if(positivoOuNegativo(num)){
            System.out.println("O numero é negativo.");
        }else {
            System.out.println("O número é positivo.");
        }
        }
    }

