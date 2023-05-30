package poo_fp_rpg.items;

import poo_fp_rpg.entidades.Heroi;

import java.util.ArrayList;

public class PocaoHP extends ItemHeroi{
    private int vida;

    /**
     * Construtor da classe PocaoHP
     * @param nome O nome da PocaoHP
     * @param preco O preço da PocaoHP
     * @param tipoHeroi A lista de tipos de herói permitidos para usar a PocaoHP
     * @param vida A quantidade de vida que será acrescentada à vida do herói
     */
    public PocaoHP(String nome, int preco, ArrayList<TipoHeroi> tipoHeroi, int vida) {
        super(nome, preco, tipoHeroi);
        this.vida = vida;
    }

    /**
     * Quantidade de vida da PocaoHP
     * @return A quantidade de vida da PocaoHP
     */
    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * Mostra os detalhes da PocaoHP
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço em moedas de ouro: " + getPreco());
        System.out.println("Tipo de herói: " + getTipoHeroi());
        System.out.println("Quantidade de vida: " + this.vida);
        System.out.println();
    }
}
