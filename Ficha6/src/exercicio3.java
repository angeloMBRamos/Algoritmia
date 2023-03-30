import java.util.Scanner;

//Implemente uma função que determine se um número (passado por argumento) é ou não primo.

public class exercicio3 {

    public static void primo(int n){

        boolean primo = true;
        if(n <= 1){
            primo=false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                primo = false;
            }
        }
        if (primo==true){
            System.out.println(" O numero " + n + " é primo");
        }else {
            System.out.println("O numero " + n + " não é primo");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Introduz um numero");
        n = input.nextInt();

        primo(n);

    }
}
