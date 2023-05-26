package poo_fp_rpg.jogo;

import poo_fp_rpg.entidades.Cavaleiro;
import poo_fp_rpg.entidades.Heroi;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Tipo Heroi (cavaleiro, feiticeiro, arqueiro): ");
        String tipoHeroi = input.next();

        System.out.print("Tipo Heroi (cavaleiro, feiticeiro, arqueiro): ");
        String nome = input.next();

        Heroi heroi;
        int vida=0, forca=0, nivel=0, ouro=0;



        if(tipoHeroi.toLowerCase().equals("cavaleiro")){
            heroi = new Cavaleiro(nome, vida, forca, nivel, ouro);
        }
    }
}
