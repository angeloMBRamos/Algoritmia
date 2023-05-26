package poo_fp_rpg.items;

import poo_fp_rpg.entidades.Heroi;

import java.util.ArrayList;

abstract public class ItemHeroi {
    private String nome;
    private int preco;
    private ArrayList<TipoHeroi> tipoHeroi;

    public ItemHeroi(String nome, int preco, ArrayList<TipoHeroi> tipoHeroiPermitido) {
        this.nome = nome;
        this.preco = preco;
        this.tipoHeroi = tipoHeroiPermitido;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public ArrayList<TipoHeroi> getTipoHeroi() {
        return tipoHeroi;
    }

    abstract public void mostrarDetalhes();
}
