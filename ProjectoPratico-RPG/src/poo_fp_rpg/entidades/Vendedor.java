package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.ItemHeroi;
import poo_fp_rpg.items.PocaoHP;
import poo_fp_rpg.items.TipoHeroi;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Vendedor {

    static Scanner input = new Scanner(System.in);
    private ArrayList<ItemHeroi> inventario;

    public Vendedor(ArrayList<ItemHeroi> inventario) {
        this.inventario = inventario;
    }

    public void imprimirInventario() {
        int contador = 0;
        for (ItemHeroi stock : this.inventario) {
            contador++;
            if (stock instanceof PocaoHP) {
                PocaoHP pocaoHP = (PocaoHP) stock;
                System.out.println("item " + contador);
                pocaoHP.mostrarDetalhes();
            }
            if (stock instanceof Arma) {
                Arma arma = (Arma) stock;
                System.out.println("item " + contador);
                arma.mostrarDetalhes();
            }
        }
    }

    public void vender(Heroi heroi) {
        boolean comprar = true;
        boolean permitidoComprar = false;
        int escolhaInicial;
        while (comprar) {
            System.out.println();
            System.out.println("Escolha o numero do item que pretende comprar ou carregue na tecla zero para continuar o jogo sem comprar ");
            System.out.println("A sua resposta: ");
            escolhaInicial = input.nextInt();
            if (escolhaInicial == 0) {
                System.out.println();
                System.out.println("Escolheu seguir em frente sem comprar items");
                comprar = false;
            } else if (escolhaInicial >= 1 && escolhaInicial <= this.inventario.size()) {
                ItemHeroi item = inventario.get(escolhaInicial - 1);
                for (TipoHeroi heroiPermitido : item.getTipoHeroi()) {
                    if (heroiPermitido.toString().equals(heroi.getClass().getSimpleName().toUpperCase())) {
                        permitidoComprar = true;
                    }
                    if(permitidoComprar){
                        if (heroi.getOuro() >= item.getPreco()) {
                            if (item instanceof Arma) {
                                Arma arma = (Arma) item;
                                heroi.setArma(arma);
                                this.inventario.remove(arma);
                                heroi.setOuro(heroi.getOuro() - item.getPreco());
                                System.out.println("Comprou o item " + item.getNome());
                                System.out.println("Após a compra ficou com " + heroi.getOuro() + " moedas de ouro.");
                                comprar = false;
                                break;
                            } else if (item instanceof PocaoHP) {
                                PocaoHP pocao = (PocaoHP) item;
                                //heroi.getPocoes().remove(0);
                                heroi.getPocoes().add(pocao);
                                heroi.getPocoes().size();
                                this.inventario.remove(pocao);
                                heroi.setOuro(heroi.getOuro() - item.getPreco());
                                System.out.println("Comprou o item " + item.getNome());
                                System.out.println("Após a compra ficou com " + heroi.getOuro() + " moedas de ouro.");
                                comprar = false;
                                break;
                            }
                        } else {
                            System.out.println("Não tem dinheiro suficiente para comprar esse item.");
                        }
                    }
                }
                heroi.mostrarDetalhes();
            }
        }
    }
}
