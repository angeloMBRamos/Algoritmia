
//Faça um programa que imprima os números ímpares no intervalo de 531 a 750 inclusive.
public class exercicio2 {
    public static void main(String[] args) {
        int n = 532;

        while (n < 750){
            if(n%2 != 0){
                System.out.println(n);
            }
            n++;
        }
    }
}
