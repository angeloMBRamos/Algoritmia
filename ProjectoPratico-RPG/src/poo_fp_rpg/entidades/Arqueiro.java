package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;

public class Arqueiro extends Heroi{

    public Arqueiro(String nome, int vida, int forca, int nivel, int ouro, ArrayList<PocaoHP> pocoes, Arma arma) {
        super(nome, vida, forca, nivel, ouro, pocoes, arma);
    }

    @Override
    public void atacar(NPC inimigo) {

    }

    @Override
    public void mostrarDetalhes() {

    }
}
