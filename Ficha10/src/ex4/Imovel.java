package ex4;

import java.util.concurrent.ThreadPoolExecutor;

public class Imovel {
    private String rua, porta, cidade;
    double area=0, areaPiscina, valorImovel;
    int nQuarto, nWC;
    Tipo tipo;
    Acabamento acabamento;
    boolean comprada;

    public Imovel(String rua, String porta, String cidade, double area, double areaPiscina, int nQuarto, int nWC, Tipo tipo, Acabamento acabamento) {
        this.rua = rua;
        this.porta = porta;
        this.cidade = cidade;
        this.area = area;
        this.areaPiscina = areaPiscina;
        this.nQuarto = nQuarto;
        this.nWC = nWC;
        this.tipo = tipo;
        this.acabamento = acabamento;
    }

    public String getRua() {
        return rua;
    }

    public String getPorta() {
        return porta;
    }

    public String getCidade() {
        return cidade;
    }

    public double getArea() {
        return area;
    }

    public double getAreaPiscina() {
        return areaPiscina;
    }

    public double getValorImovel() {
        return valorImovel;
    }

    public int getnQuarto() {
        return nQuarto;
    }

    public int getnWC() {
        return nWC;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public Acabamento getAcabamento() {
        return acabamento;
    }

    public double calcularValor(){
         if(this.tipo.equals(Tipo.APARTAMENTO)){
             this.valorImovel=area*1000 + nQuarto*7500 + nWC*10500 + areaPiscina*1000;
             if(this.acabamento.equals(Acabamento.RESTAURO)){
                 this.valorImovel*=0.5;
             } else if (this.acabamento.equals(Acabamento.USADA)) {
                 this.valorImovel*=0.90;
             } else if (this.acabamento.equals(Acabamento.LUXO)) {
                 this.valorImovel*=1.25;
             }
         }
         if (this.tipo.equals(Tipo.CASA)) {
             this.valorImovel=area*3000 + nQuarto*7500 + nWC*10500 + areaPiscina*1000;
             if(this.acabamento.equals(Acabamento.RESTAURO)){
                 this.valorImovel*=0.5;
             } else if (this.acabamento.equals(Acabamento.USADA)) {
                 this.valorImovel*=0.90;
             } else if (this.acabamento.equals(Acabamento.LUXO)) {
                 this.valorImovel*=1.25;
             }
         }
         if (this.tipo.equals(Tipo.MANSAO)) {
             this.valorImovel=area*5000 + nQuarto*7500 + nWC*10500 + areaPiscina*1000;
             if(this.acabamento.equals(Acabamento.RESTAURO)){
                 this.valorImovel*=0.5;
             } else if (this.acabamento.equals(Acabamento.USADA)) {
                 this.valorImovel*=0.90;
             } else if (this.acabamento.equals(Acabamento.LUXO)) {
                 this.valorImovel*=1.25;
             }
         }
         return valorImovel;
    }

    public void setAcabamento(Acabamento acabamento) {
        this.acabamento = acabamento;
    }

    public void exibirDetalhes(){
        System.out.println("Rua " + this.rua);
        System.out.println("Cidade " + this.cidade);
    }

    public Imovel compararImovel(Imovel imovel2){

        if(this.calcularValor()>imovel2.calcularValor()) {
            return this;
        } else if (this.calcularValor()<imovel2.calcularValor()) {
            return imovel2;
        }else{
            return null;
        }
    }
}
