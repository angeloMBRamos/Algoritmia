package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;

public class Feiticeiro extends Heroi{

    public Feiticeiro(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca, nivel, ouro);
    }

    @Override
    public boolean atacar(NPC inimigo) {
        while (this.getVida() > 0 && inimigo.getVida() > 0) {
            inimigo.setVida(inimigo.getVida() - this.getForca() + this.getArma().getAtaque());
            this.setVida(this.getVida() - inimigo.getForca());
        }
        if (this.getVida() > 0) {
            System.out.println("O inimigo:"  + inimigo.getNome() + " perdeu");
            this.setNivel(this.getNivel() + 1);
            this.setVida(this.getVida() + 10);
            this.setForca(this.getForca() + 1);
            this.setOuro(this.getOuro() + 10);
            System.out.println();
            return true;
        } else {
            System.out.println("O heroi: " + this.getNome() + " perdeu.");
            System.out.println();
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
        if(this.getArma() == null){
            System.out.println("Arma: Não possui arma");
        }else {
            System.out.println("Arma: " + getArma().getNome());
        }
        for(PocaoHP listaPocoes : getPocoes()){
            System.out.println("Lista de poções: " + listaPocoes.getNome());
        }
        System.out.println();
    }
}
