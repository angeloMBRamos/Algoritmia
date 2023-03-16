

//Faça um programa que imprima os números pares no intervalo de 1 a 300 inclusive.

public class exercicio1 {
    public static void main(String[] args) {

        int n=0;

        while(n <= 300){
            if(n%2 == 0 ){
                System.out.println(n);
            }
            n++;
        }

    }
}
