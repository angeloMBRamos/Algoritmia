package poo_fp_rpg.items;

import poo_fp_rpg.entidades.Heroi;

import java.util.ArrayList;

public class Arma extends ItemHeroi{
    private int ataque;

    /**
     * Construtor da classe Arma
     * @param nome O nome da arma
     * @param preco O preço da arma
     * @param tipoHeroi A lista de tipos de herói permitidos para usar a arma
     * @param ataque O valor de ataque da arma
     */
    public Arma(String nome, int preco, ArrayList<TipoHeroi> tipoHeroi, int ataque) {
        super(nome, preco, tipoHeroi);
        this.ataque = ataque;
    }

    /**
     * Retorna o valor de ataque da arma
     * @return O valor de ataque da arma
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Mostra os detalhes da arma
     * A quantidade de dano aplicada e os tipos de heróis permitidos a utilizá-la
     */
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
