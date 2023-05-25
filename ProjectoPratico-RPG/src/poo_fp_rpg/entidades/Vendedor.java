package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.ItemHeroi;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;

public class Vendedor {
    private ArrayList<ItemHeroi> itemHerois;

    public Vendedor(ArrayList<ItemHeroi> itemHerois) {
        this.itemHerois = itemHerois;
    }

    public void imprimirInventário(){
        for (ItemHeroi stock : this.itemHerois) {
            System.out.println("Nome: " + stock.getNome());
            System.out.println("Preço: " + stock.getPreco());
        }
    }

    public void vender(Heroi heroi){
        for (ItemHeroi item : this.itemHerois) {
            if (heroi.getOuro() >= item.getPreco()) {
                if(item instanceof PocaoHP){
                    PocaoHP pocaoHP = (PocaoHP) item;
                    heroi.setOuro(heroi.getOuro()-item.getPreco());
                    System.out.println("Agora tenho " + heroi.getOuro() + " moedas de ouro.");
                    heroi.getPocoes().add(0, pocaoHP);
                    System.out.println();
                }
                if( item instanceof Arma){
                    Arma arma = (Arma) item;
                    heroi.setOuro(heroi.getOuro()-item.getPreco());
                    System.out.println("Agora tenho " + heroi.getOuro() + " moedas de ouro.");
                    heroi.setArma(arma);
                    System.out.println("Comprei uma arma nova: " + heroi.getArma().getNome());
                }
            }else {
                System.out.println("Não tens dinheiro suficiente para efetuar a compra");
            }
        }
    }
}
