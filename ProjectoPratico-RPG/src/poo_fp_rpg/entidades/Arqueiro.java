package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;

public class Arqueiro extends Heroi{

    public Arqueiro(String nome, int vida, int forca, int nivel, int ouro, ArrayList<PocaoHP> pocoes, Arma arma) {
        super(nome, vida, forca, nivel, ouro, pocoes, arma);
    }

    @Override
    public boolean atacar(NPC inimigo) {
        while (this.getVida() > 0 && inimigo.getVida() > 0) {
           inimigo.setVida(inimigo.getVida()-(this.getForca() + this.getArma().getAtaque()));
           this.setVida(this.getVida() - ((inimigo.getForca() * 10/100) + inimigo.getForca()));
        }
        if (this.getVida() > 0) {
            System.out.println("O inimigo:"  + inimigo.getNome() + " perdeu");
            this.setNivel(this.getNivel() + 1);
            this.setVida(this.getVida() + 10);
            this.setForca(this.getForca() + 1);
            this.setOuro(this.getOuro() + 10);
            return true;
        } else {
            System.out.println("O heroi: " + this.getNome() + " perdeu.");
            return false;
        }

    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Força: " + getForca());
        System.out.println("Nivel: " + getNivel());
        System.out.println("Ouro: " + getOuro());
        for(PocaoHP listaPocoes : getPocoes()){
            System.out.println("Lista de poções: " + listaPocoes.getNome());
        }
        System.out.println("Arma: " + getArma().getNome());
    }

}
