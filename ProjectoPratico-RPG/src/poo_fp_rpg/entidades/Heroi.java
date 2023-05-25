package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;
import java.util.Scanner;

abstract public class Heroi extends Entidade{
    private int nivel, ouro;
    private ArrayList<PocaoHP> pocoes;
    private Arma arma;

    public Heroi(String nome, int vida, int forca, int nivel, int ouro, ArrayList<PocaoHP> pocoes, Arma arma) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.pocoes = pocoes;
        this.arma = arma;
    }

    public int getNivel() {
        return nivel;
    }

    public int getOuro() {
        return ouro;
    }

    public ArrayList<PocaoHP> getPocoes() {
        return pocoes;
    }

    public Arma getArma() {
        return arma;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }
    public void setArma(Arma arma) {
        this.arma = arma;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    abstract public boolean atacar(NPC inimigo);

    public void usarPocao(){
        Scanner input = new Scanner(System.in);
        //String opcao;
        /*System.out.println("Qual a poção que quer usar?");
        opcao = input.next();
        for(PocaoHP item : this.pocoes){
            if(opcao.equals(item.getNome())){
                setVida(getVida() + item.getVida());
                System.out.println("Passou a ter " + this.getVida() + " de vida");
            }
        }*/


        int contador = 0;
        for(PocaoHP pocao : this.getPocoes()){
            System.out.println("Bolsa de poções: "+ contador + " " + pocao.getNome() + " Preço: "+pocao.getPreco() +" Ouro: " +pocao.getVida());
            contador++;
        }
        System.out.println("Qual deseja usar?");
        int opcao = input.nextInt();
        int pontosVida = getPocoes().get(opcao).getVida();
        System.out.println("Tinha isto de vida " + this.getVida());
        this.setVida(this.getVida() + pontosVida);
        System.out.println("Passou a ter: " + this.getVida());

        this.getPocoes().remove(opcao);
        contador--;

        for(PocaoHP pocao : this.getPocoes()){
            System.out.println("Bolsa de poções: "+ contador + " " + pocao.getNome() + " Preço: "+pocao.getPreco() +" Ouro: " +pocao.getVida());
        }
    }


}
