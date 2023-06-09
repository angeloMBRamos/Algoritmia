package org.example.ex4;

public class Rectangulo {

    private double largura;
    private double altura;
    private double area, perimetro;

    public Rectangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double areaRectangulo() {
        double area = this.largura * this.altura;
        return area;
    }

    public double perimetroRectangulo() {
        if (this.largura > 0 && this.altura > 0) {
            double perimetro = (this.largura * 2) + (this.altura * 2);
            return perimetro;
        } else {
            throw new IllegalArgumentException("Nao pode ser 0 ou inferior");
        }
    }
}
