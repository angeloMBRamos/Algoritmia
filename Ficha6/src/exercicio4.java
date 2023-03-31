import java.util.Scanner;

//Implemente uma função que determine se um número (passado por argumento) é perfeito

public class exercicio4 {

    public static boolean perfeito(int n) {

        //Declarar a variável
        int soma = 0;

        //Cilco for que vai percorrer todos os numeros até ao número introduzido
        for (int i = 1; i < n; i++) {
            //Condição que vai verificar se o numero introduzido é resto zero
            if (n % i == 0) {
                soma = soma + i;
                //Condição que vai verificar se a varável soma é igual ao numero introduzido
                if(soma == n) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Declarar varável
        int n;

        //Ler numero inteiro do utilizador
        System.out.println("Introduz um numero");
        n = input.nextInt();

        //Invocação da função
        if (perfeito(n)){
            System.out.println(" O numero " + n + " é perfeito");
        }else {
            System.out.println("O numero " + n + " não é perfeito");
        }
    }
}
