import java.util.Scanner;

/*Escreva  um  programa  que  calcule  e  apresente  a  área  e  o  perímetro  de  um  retângulo.
As  dimensões  devem  ser  requisitadas  ao  utilizador.
Crie  programas  adicionais  para  calcular  a  área  das  seguintes  figuras geométricas: circunferência e triangulo.
 */

public class exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double width, height;
        double pi = 3.14;
        double raio;


        // Calcular o perimetro de um rectângulo

        System.out.println("Enter width: ");
        width = input.nextInt();
        System.out.println("Enter height: ");
        height = input.nextInt();
        double perimetro = 2 * (width + height);
        System.out.println("The perimeter of the rectangale is " + perimetro);

        // Calcular a area de um rectangulo

        double areaRectang = width * height;
        System.out.println("The area of you rectangale is " + areaRectang);

        // Calcular a area de um triangulo

        double areaTriang = (width * height) / 2;
        System.out.println("The area of the triangle is " + areaTriang);


        // Calcular a area de uma circunferência

        System.out.println("Enter the raio:");
        raio = input.nextInt();
        double areaCircunf = pi * raio * raio;
        System.out.println("The area of the circumference is " + areaCircunf);
    }
}
