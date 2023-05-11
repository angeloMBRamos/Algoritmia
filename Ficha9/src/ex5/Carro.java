package ex5;

public class Carro {
    private String marca;
    private String modelo;
    private int anoFabrico;

    public Carro(String marca, String modelo, int anoFabrico) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
    }

    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAnoFabrico() {
        return this.anoFabrico;
    }

    public void ligar(){
        System.out.println("O carro está ligado");
    }
}
