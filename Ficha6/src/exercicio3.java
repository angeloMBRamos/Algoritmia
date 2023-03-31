import java.util.Scanner;

//Implemente uma função que determine se um número (passado por argumento) é ou não primo.

public class exercicio3 {

    /**
     * Função que verifica se um número é primo
     * @param n
     * @return true se primo || false se não primo
     */
    public static boolean primo(int n) {

        //Condição que vai verificar as exceções como 0, 1 e números negativos que não são primos
        if(n<=1){
            return false;
        }

        //ciclo for que vai percorrer todos os numeros até ao numero introduzido.

        for (int i = 2; i < n; i++) {
            //Condição que vai verificar se o numero introduzido é resto zero, se for não é primo
            if (n % i == 0) {
                return false;
            }
        }
        return true;
        }

    public static void main(String[] args) {

        //Declarar o Scanner
        Scanner input = new Scanner(System.in);
        //Declarar a variável
        int n;

        //Ler numero inteiro do utilizador
        System.out.println("Introduz um numero");
        n = input.nextInt();

        //Invocar a função "primo"
        if (primo(n)) {
            System.out.println(" O numero é primo");
        } else {
            System.out.println("O numero não é primo");
        }

    }
}

