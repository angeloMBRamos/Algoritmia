package poo_fp_rpg.items;

import poo_fp_rpg.entidades.Heroi;

import java.util.ArrayList;

abstract public class ItemHeroi {
    private String nome;
    private int preco;
    private ArrayList<TipoHeroi> tipoHeroi;

    /**
     * Classe contrutor do ItemHeroi
     * @param nome O nome do itemHerói
     * @param preco O preço do ItemHerói
     * @param tipoHeroiPermitido Os tipos de heróis permitidos para utilizar o item
     */
    public ItemHeroi(String nome, int preco, ArrayList<TipoHeroi> tipoHeroiPermitido) {
        this.nome = nome;
        this.preco = preco;
        this.tipoHeroi = tipoHeroiPermitido;
    }

    /**
     * Retorna o nome do item
     * @return O nome do item
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna o preço do item
     * @return O preço do item
     */
    public int getPreco() {
        return preco;
    }

    /**
     * Retorna a lista de tipos de heróis permitidos para este item
     * @return A lista de tipos de heróis permitidos
     */
    public ArrayList<TipoHeroi> getTipoHeroi() {
        return tipoHeroi;
    }

    /**
     * Método abstrato para exibir os detalhes do item
     * Deve ser implementado pelas subclasses para fornecer a implementação específica
     */
    abstract public void mostrarDetalhes();
}
