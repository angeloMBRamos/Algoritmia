package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;

public class Cavaleiro extends Heroi{

    public Cavaleiro(String nome, int vida, int forca, int nivel, int ouro, ArrayList<PocaoHP> pocoes, Arma arma) {
        super(nome, vida, forca, nivel, ouro, pocoes, arma);
    }

    @Override
    public void atacar(NPC inimigo) {
        setVida(this.getVida()-(inimigo.getForca() * Integer.parseInt("0.8")));
        inimigo.setVida(inimigo.getVida() - (this.getForca() + getArma().getAtaque()));
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Força: " + getForca());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Ouro: " + getOuro());
        System.out.println("Arma: " + getArma());
    }
}
