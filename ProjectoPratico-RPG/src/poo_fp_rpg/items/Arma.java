package poo_fp_rpg.items;

import poo_fp_rpg.entidades.Heroi;

import java.util.ArrayList;

public class Arma extends ItemHeroi{
    private int ataque;

    public Arma(String nome, int preco, ArrayList<TipoHeroi> tipoHeroi, int ataque) {
        super(nome, preco, tipoHeroi);
        this.ataque = ataque;
    }

    public int getAtaque() {
        return ataque;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço em moedas de ouro: " + getPreco());
        System.out.println("Quantidade de dano: " + this.ataque);

        for(TipoHeroi tipoHeroiPermitidos : this.getTipoHeroi()){
            System.out.println("Tipo de herói: " + tipoHeroiPermitidos.toString());
        }
        System.out.println();
    }
}
