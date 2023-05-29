package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;
import java.util.Scanner;

abstract public class Heroi extends Entidade{
    private int nivel, ouro;
    private ArrayList<PocaoHP> pocoes;
    private Arma arma;

    public Heroi(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.pocoes = new ArrayList<>();

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

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    public void setPocoes(ArrayList<PocaoHP> pocoes) {
        this.pocoes = pocoes;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    abstract public boolean atacar(NPC inimigo);

    public void usarPocao(){
        Scanner input = new Scanner(System.in);

        int contador = 0;
        for(PocaoHP pocao : this.getPocoes()){
            System.out.println("Bolsa de poções: ");
            System.out.println("Item: " + contador);
            System.out.println(pocao.getNome() + " Vida :" + pocao.getVida());
            contador++;
        }
        System.out.println("Escolha o item da sua bolsa de poções?");
        int opcao = input.nextInt();
        int pontosVida = this.getPocoes().get(opcao).getVida();
        System.out.println("Tinha " + this.getVida() + " de vida.");
        this.setVida(this.getVida() + pontosVida);
        System.out.println("Passou a ter: " + this.getVida() + " de vida");
        this.getPocoes().remove(opcao);

    }
}
