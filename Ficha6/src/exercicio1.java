import java.util.Scanner;

//Implemente uma função que determine se um número (passado por argumento) é par ou ímpar.
public class exercicio1 {
   public static void parOuImpar(int num){
       if(num%2==0){
           System.out.println("The number is par");
       }else{
           System.out.println("The number is impar");
       }
   }
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        int num;

        System.out.println("Introduz um numero");
        num = input.nextInt();

        parOuImpar(num);

    }
}