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

    abstract public void atacar(NPC inimigo);

    public void usarPocao(){
        Scanner input = new Scanner(System.in);
        String opcao;
        System.out.println("Qual a poção que quer usar?");
        opcao = input.next();
        for(PocaoHP item : this.pocoes){
            if(opcao.equals(item)){
                setNivel(item.getVida() + this.getNivel());
                System.out.println("Passou a ter " + this.getNivel() + " de vida");
            }
        }
    }

}
