package ex1;

import java.sql.SQLOutput;

public class Carro {

private String marca, modelo;
private int anoFabrico, potencia;
private double cilindrada, consumo;
private Combustivel combustivel;

    public Carro(String marca, String modelo, int anoFabrico, int potencia, double cilindrada, double consumo, Combustivel combustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabrico = anoFabrico;
        this.potencia=potencia;
        this.cilindrada=cilindrada;
        this.consumo=consumo;
        this.combustivel=combustivel;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    public int getAnoFabrico() {
        return anoFabrico;
    }

    public double getPotencia() {
        return potencia;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public int calcularIdade(){
        return 2023-anoFabrico;
    }

    public void ligar(){
        // Dividir por idade
        if(calcularIdade()>30) { // Mais de 30 anos
            if (this.combustivel.equals(Combustivel.DIESEL)) { // Combustivel é Diesel
                System.out.println("Deita um pouco de fumo...Custa a pegar...O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            } else { // Combustivel não é diesel
                System.out.println("Custa a pegar...O carro está ligado!");
                System.out.println("Vrum-vrum-vrum");
            }
        }else{ // Menos de 30 anos
            if(this.potencia<250){ // Menos de 250 cavalos
                System.out.println("O carro está ligado!");
                System.out.println("Vrummmmmmmmmmm");
            }else{ // 250 cavalos ou mais
                System.out.println("O carro está ligado!");
                System.out.println("VRUUUMMMMM");
            }
        }
    }

    public void exibirDetalhes(){
        System.out.println("Marca: "+ this.marca);
        System.out.println("Modelo: "+ this.modelo);
    }
    public Carro corrida(Carro adversario){

        if(this.potencia>adversario.potencia){ // Ganha o Carro por potencia
            return this;
        } else if (this.potencia<adversario.potencia) { // Ganha o adversário por potencia
            return adversario;
        }else{ // Empate de potência
            if(this.cilindrada>adversario.cilindrada){ // Ganha o Carro por cilindrada
                return this;
            } else if (this.cilindrada<adversario.cilindrada) { // Ganha o adversário por cilindrada
                return adversario;
            }else{ // Empate de cilindrada
                if(this.anoFabrico>adversario.anoFabrico){ // Ganha o Carro por recente
                    return this;
                } else if (this.anoFabrico<adversario.anoFabrico) { // Ganha o adversário por recente
                    return adversario;
                }
            }
        }
        return null;
    }

    public static Carro torneio(Carro carro1, Carro carro2, Carro carro3, Carro carro4){

        Carro vencedor1=carro1.corrida(carro2);
        System.out.println("Corrida 1 a acontecer...");
        if(vencedor1==null){
            System.out.println("Empate!");
        }else {
            System.out.println("Vencedor 1/2 Final:");
            vencedor1.exibirDetalhes();
        }

        Carro vencedor2=carro3.corrida(carro4);
        System.out.println("Corrida 2 a acontecer...");
        if(vencedor2==null){
            System.out.println("Empate!");
        }else {
            System.out.println("Vencedor 1/2 Final:");
            vencedor2.exibirDetalhes();
        }

        Carro vencedorTorneio=vencedor1.corrida(vencedor2);
        System.out.println("Corrida 3 (Final) a acontecer...");
        if(vencedorTorneio==null){
            System.out.println("Empate!");
        }else {
            System.out.println("Vencedor Final:");
            vencedorTorneio.exibirDetalhes();
        }
        return vencedorTorneio;
    }

    public double consumo(int km){
        return km*consumo/100;
    }

}
