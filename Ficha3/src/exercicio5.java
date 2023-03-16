//Faça um programa que imprima os números inteiros de 1 a 100 inclusive, e no final imprima também o valor do seu somatório.
public class exercicio5 {
    public static void main(String[] args) {
        int n1=1, n2= 100, result=0;

        while (n1 <= n2){
            System.out.println(n1);
            result = result+n1;
            n1++;
        }
        System.out.println(result);
    }
}
