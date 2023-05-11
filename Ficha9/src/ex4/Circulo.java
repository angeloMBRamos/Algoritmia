package ex4;

public class Circulo {

    //Atributos de instância/objecto
    private double raio;
    //Atributos de classe
    private static double pi=3.141592;

    public Circulo(double raio) {
        this.raio = raio;
    }
    public double getRaio() {
        return this.raio;
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    public double areaCirculo(){
        return pi*(this.raio*this.raio);
    }
    public double circunferenciaCirculo(){
        return 2*this.pi*this.raio;
    }
}
