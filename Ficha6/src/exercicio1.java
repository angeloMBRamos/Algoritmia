import java.util.Scanner;

//Implemente uma função que determine se um número (passado por argumento) é par ou ímpar.
public class exercicio1 {
   public static boolean parOuImpar(int num){

       if(num%2==0){
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

        if(parOuImpar(num)){
            System.out.println("O numero é par");
        }else {
            System.out.println("O numero é impar");
        }

    }
}