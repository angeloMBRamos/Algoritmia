package ex3;

public class Rectangulo {
    private double largura;
    private double altura;
    private double area, perimetro;

    public Rectangulo(double largura, double altura){
        this.largura=largura;
        this.altura=altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getAltura() {
        return this.altura;
    }

    public double areaRectangulo(){
        double area= this.largura*this.altura;
        return area;
    }
    public double perimetroRectangulo(){
        double perimetro = (this.largura*2)+(this.altura*2);
       return perimetro;
    }
}
