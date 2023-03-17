import java.util.Scanner;

/*Escreva um algoritmo que leia uma quantidade desconhecida de números inteiros
 positivos fornecida pelo utilizador e conte quantos deles estão nos seguintes
 intervalos: [0,25], [26,50], [51,75] e [76,100].
 A entrada de dados deve terminar quando for lido um número negativo.
*/
public class exercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, counter1=0, counter2=0, counter3=0, counter4=0;

        System.out.println("Enter a number");
        n = input.nextInt();

        while(n>0){
            if(n>=0 && n<=25){
                counter1++;
                //n = input.nextInt();
            } else if (n>=26 && n<=50) {
                counter2++;
                //n = input.nextInt();
            } else if (n>=51 && n<=75) {
                counter3++;
                //n = input.nextInt();
            } else if (n>=76 && n<=100) {
                counter4++;
                //n = input.nextInt();
            }
            n = input.nextInt();

        }
        System.out.println("You've introduced " + counter1 + " numbers between [0,25]");
        System.out.println("You've introduced " + counter2 + " numbers between [26,50]");
        System.out.println("You've introduced " + counter3 + " numbers between [51,75]");
        System.out.println("You've introduced " + counter4 + " numbers between [76,100]");
    }
}
