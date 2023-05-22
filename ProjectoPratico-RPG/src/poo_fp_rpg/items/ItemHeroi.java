package poo_fp_rpg.items;

import poo_fp_rpg.entidades.Heroi;

import java.util.ArrayList;

abstract public class ItemHeroi {
    private String nome;
    private int preco;
    private ArrayList<Heroi> tipoHeroi;

    public ItemHeroi(String nome, int preco, ArrayList<Heroi> tipoHeroi) {
        this.nome = nome;
        this.preco = preco;
        this.tipoHeroi = tipoHeroi;
    }

    public String getNome() {
        return nome;
    }

    public int getPreco() {
        return preco;
    }

    public ArrayList<Heroi> getTipoHeroi() {
        return tipoHeroi;
    }

    abstract public void mostrarDetalhes();
}
