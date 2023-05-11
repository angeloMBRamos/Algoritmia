package ex6;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.adição(10, 20));
        System.out.println(calculadora.subtração(10, 20));
        System.out.println(calculadora.divisao(10, 20));
        System.out.println(calculadora.multiplicação(10, 20));
    }
}
