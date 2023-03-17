import java.util.Scanner;

/*Escreva um programa que leia uma sequência de números inteiros do
 utilizador   e determine se a sequência está em ordem crescente.
*/
public class exercicio12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int quant, contador=1, numAntigo, numNovo;
        boolean crescente = true;

        System.out.println("Quantos numeros quer introduzir?");
        quant = input.nextInt();

        System.out.println("Introduz um numero");
        numAntigo = input.nextInt();

        while(contador < quant){
            System.out.println("introduz outro numero");
            numNovo= input.nextInt();
            contador++;
            if(numNovo <= numAntigo){
                crescente=false;
            }
            numAntigo=numNovo;
        }
        if(crescente==true){
            System.out.println("Sequência crescente");
        }else {
            System.out.println("Sequência de números não crescente");
        }


    }
}
