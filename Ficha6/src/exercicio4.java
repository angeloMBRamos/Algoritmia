import java.util.Scanner;

//Implemente uma função que determine se um número (passado por argumento) é perfeito

public class exercicio4 {

    public static void perfeito(int n){

        int soma=0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                soma = soma + i;
            }
        }
        if (soma==n){
            System.out.println(" O numero " + n + " é perfeito");
        }else {
            System.out.println("O numero " + n + " não é perfeito");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        System.out.println("Introduz um numero");
        n = input.nextInt();

        perfeito(n);

    }


}
