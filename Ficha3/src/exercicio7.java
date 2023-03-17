import java.util.Scanner;

/*Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1.
 O computador deve dizer a média dos números introduzidos (excluindo o -1).
*/
public class exercicio7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, counter=0, soma=0;
        double average;

        System.out.println("Enter a number");
        n = input.nextInt();

//Ciclo executa até o utilizador introduzir o numero 1

        while(n!=-1){
            soma = soma + n;
            counter++;
            n = input.nextInt();
        }
        average = soma / counter;
        System.out.print(average);
    }
}
