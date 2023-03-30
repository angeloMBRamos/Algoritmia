import java.util.Scanner;

//Implemente uma função que determine se um número (passado por argumento) é positivo ou negativo.
public class exercicio2 {

    public static void positivoOuNegativo(int num){
        if(num<0){
            System.out.println("O numero " + num +  " é negativo.");
        }else{
            System.out.println("O número " + num + " é positivo.");
        }
    }
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Introduz um numero");
        num = input.nextInt();
        positivoOuNegativo(num);
    }
}
