import java.util.Scanner;

//Implemente um programa que leia duas strings e verifique se estas são iguais.

public class exercicio8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] array = new String[2];
        System.out.println("Introduza um character na posição [0]");
        array[0] = input.next();

        for (int i = 1; i < 2 ; i++) {
            System.out.println("Introduza o caracter no array ["+i+"]");
            array[i] = input.next();
        }

            if(array[0].equals(array[1])){
                System.out.println("As palavras são iguais");
            }else {
                System.out.println("As palavras não são iguais");
            }
    }
}
