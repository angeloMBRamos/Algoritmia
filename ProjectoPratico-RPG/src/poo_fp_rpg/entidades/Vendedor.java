package poo_fp_rpg.entidades;

import poo_fp_rpg.items.ItemHeroi;

import java.util.ArrayList;

public class Vendedor {
    private ArrayList<ItemHeroi> itemHerois;

    public Vendedor(ArrayList<ItemHeroi> itemHerois) {
        this.itemHerois = itemHerois;
    }

    public void imprimirInventário(){
        for (ItemHeroi itemHeroi : this.itemHerois) {
            System.out.println("Nome: " + itemHeroi.getNome());
            System.out.println("Preço: " + itemHeroi.getPreco());
        }
    }

    public void vender(Heroi heroi){
        int ouroEmCarteira=0;
        for (ItemHeroi item : this.itemHerois) {
            if (heroi.getOuro() > item.getPreco()) {
                ouroEmCarteira = heroi.getOuro() - item.getPreco();

            }
        }

    }
}
