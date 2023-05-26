package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.ItemHeroi;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;

public class Vendedor {
    private ArrayList<ItemHeroi> inventario;

    public Vendedor(ArrayList<ItemHeroi> inventario) {
        this.inventario = inventario;
    }

    public void imprimirInventario(){
        for (ItemHeroi stock : this.inventario) {
            if(stock instanceof PocaoHP){
                PocaoHP pocaoHP = (PocaoHP) stock;
                pocaoHP.mostrarDetalhes();
            }
            if( stock instanceof Arma){
                Arma arma = (Arma) stock;
                arma.mostrarDetalhes();
            }
        }
    }

    public void vender(Heroi heroi){
        for (ItemHeroi item : this.inventario) {
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
