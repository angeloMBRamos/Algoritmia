package poo_fp_rpg.items;

import poo_fp_rpg.entidades.Heroi;

import java.util.ArrayList;

public class PocaoHP extends ItemHeroi{
    private int vida;

    public PocaoHP(String nome, int preco, ArrayList<TipoHeroi> tipoHeroi, int vida) {
        super(nome, preco, tipoHeroi);
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço em moedas de ouro: " + getPreco());
        System.out.println("Tipo de herói: " + getTipoHeroi());
        System.out.println("Quantidade de vida: " + this.vida);
        System.out.println();
    }
}
