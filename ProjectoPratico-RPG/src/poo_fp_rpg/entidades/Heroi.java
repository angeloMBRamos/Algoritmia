package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;

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

    abstract public void atacar(NPC adversario);

}
