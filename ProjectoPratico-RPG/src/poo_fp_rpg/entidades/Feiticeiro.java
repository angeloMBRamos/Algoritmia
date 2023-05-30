package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;

public class Feiticeiro extends Heroi{

    /**
     * Construtor da classe Feiticeiro
     * @param nome O nome do feiticeiro
     * @param vida A quantidade de pontos de vida do feiticeiro
     * @param forca A força do feiticeiro
     * @param nivel O nível do feiticeiro
     * @param ouro A quantidade de ouro do feiticeiro
     */
    public Feiticeiro(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca, nivel, ouro);
    }

    /**
     * Realiza um ataque ao NPC inimigo
     * @param inimigo O NPC inimigo a ser atacado
     * @return true se o herói vencer a batalha, false caso contrário
     */
    @Override
    public boolean atacar(NPC inimigo) {
        while (this.getVida() > 0 && inimigo.getVida() > 0) {
            if(this.getArma() == null){
                System.out.println("Luta sem armas");
                this.setVida(this.getVida() - inimigo.getForca());
                System.out.println("Vida do inimigo: " + inimigo.getVida());
                System.out.println("Vida do " + this.getNome() + ": " + this.getVida());
            }else {
                inimigo.setVida(inimigo.getVida() - this.getForca() + this.getArma().getAtaque());
                System.out.println("Vida do inimigo: " + inimigo.getVida());
                this.setVida(this.getVida() - inimigo.getForca());
                System.out.println("Vida do " + this.getNome() + ": " + this.getVida());
            }

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

    /**
     * Mostra os detalhes do Heroi
     */
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
