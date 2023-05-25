package poo_fp_rpg.jogo;

import poo_fp_rpg.entidades.Cavaleiro;
import poo_fp_rpg.entidades.Heroi;
import poo_fp_rpg.entidades.NPC;
import poo_fp_rpg.entidades.Vendedor;
import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.ItemHeroi;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

    public static void labirinto() {

        ArrayList<Heroi> listaHerois = new ArrayList<Heroi>();
        ArrayList<PocaoHP> listaPocoes = new ArrayList<>();

        Arma espada = new Arma("Espada", 50, listaHerois, 30);

        PocaoHP rejuvenescer = new PocaoHP("Rejuvenescer", 20, listaHerois, 50);

        listaPocoes.add(rejuvenescer);

        Cavaleiro hercules = new Cavaleiro("Hercules", 100, 300, 0, 500, listaPocoes, espada);
        NPC bot = new NPC("Bot", 100, 50);

        listaHerois.add(hercules);

        ArrayList<ItemHeroi> stockVendedor = new ArrayList<>();
        stockVendedor.add(espada);
        stockVendedor.add(rejuvenescer);

        Vendedor vendedor = new Vendedor(stockVendedor);

        Scanner input = new Scanner(System.in);
        int num;
        do {
            do {
                System.out.println("Escolha a dificuldade do jogo: ");
                System.out.println("1. Fácil\n2. Dificil\n3. Sair");
                num = input.nextInt();

                if (num < 1 || num > 3) {
                    System.out.println("Please choose a valid option from the Menu");

                }
            }while (num < 1 || num > 3) ;

                switch (num) {

                    case 1:
                        break;
                    case 2:
                        break;
                }
            } while (num != 3);

            Scanner input = new Scanner(System.in);
            int opcao;

            System.out.println("1.Fácil\n2.Dificil");
            opcao = input.nextInt();
            if (opcao == 1) {
                System.out.println("Tem direito a 300 pontos.");
                System.out.println("Quantos pontos de vida quer?");

            }
        }

    public static void main(String[] args) {


        labirinto();





        hercules.mostrarDetalhes();
        System.out.println();
        rejuvenescer.mostrarDetalhes();
        System.out.println();
        espada.mostrarDetalhes();
       // System.out.println();
        //vendedor.vender(hercules);
        //System.out.println();
        //hercules.usarPocao();
        System.out.println();
        espada.mostrarDetalhes();
        System.out.println();
        hercules.atacar(bot);

    }
}
