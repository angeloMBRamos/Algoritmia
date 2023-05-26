package poo_fp_rpg.jogo;

import poo_fp_rpg.entidades.*;
import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.ItemHeroi;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

    public static void labirinto() {

        ArrayList<Heroi> listaHerois = new ArrayList<Heroi>();
        ArrayList<PocaoHP> listaPocoes = new ArrayList<>();

        Arma espada = new Arma("Espada", 2, listaHerois, 5);
        Arma machado = new Arma("Machado", 3, listaHerois, 4);
        Arma foice = new Arma("Nunchaku", 3, listaHerois, 3);
        Arma arco = new Arma("Arco", 4, listaHerois, 5);
        Arma fisga = new Arma("Fisga", 2, listaHerois, 3);
        Arma besta = new Arma("Besta", 3,listaHerois, 4 );
        Arma cuboMagico = new Arma("Cubo", 3, listaHerois, 4);
        Arma estrelaMagica = new Arma("Estrela", 4, listaHerois, 5);
        Arma fosforosMagicos = new Arma("Fósforos", 2, listaHerois, 3);

        PocaoHP carlsberg = new PocaoHP("Carlsberg", 2, listaHerois, 25);
        PocaoHP stout = new PocaoHP("Stout", 2, listaHerois,12 );
        PocaoHP budweiser = new PocaoHP("Budweiser", 3, listaHerois, 15);
        PocaoHP sb = new PocaoHP("SuperBock", 2, listaHerois, 20);

        Cavaleiro hercules = new Cavaleiro("Hercules", 0, 0, 0, 0, listaPocoes, espada);
        Arqueiro flechas = new Arqueiro("Flechas", 0, 0, 0, 0, listaPocoes,arco);
        Feiticeiro gandalf = new Feiticeiro("Gandalf", 0, 0, 0, 0, listaPocoes, cuboMagico);
        NPC bot = new NPC("Bot", 100, 25);

        ArrayList<ItemHeroi> stockVendedor = new ArrayList<>();
        stockVendedor.add(espada);
        stockVendedor.add(machado);
        stockVendedor.add(foice);
        stockVendedor.add(arco);
        stockVendedor.add(fisga);
        stockVendedor.add(besta);
        stockVendedor.add(cuboMagico);
        stockVendedor.add(estrelaMagica);
        stockVendedor.add(fosforosMagicos);
        stockVendedor.add(carlsberg);
        stockVendedor.add(stout);
        stockVendedor.add(budweiser);
        stockVendedor.add(sb);

        Vendedor vendedor = new Vendedor(stockVendedor);
        vendedor.imprimirInventário();

        Scanner input = new Scanner(System.in);
        int num;
        do {
            do {
                System.out.println("Escolha a dificuldade do jogo: ");
                System.out.println("1. Fácil\n2. Dificil\n3. Sair");
                num = input.nextInt();
                if (num < 1 || num > 3) {
                    System.out.println("Escolha uma opção válida do menu");
                }

            }while (num < 1 || num > 3) ;

                switch (num) {

                    case 1:
                        System.out.println("Escolha o seu Heroi");
                        System.out.println("1. Hercules\n2. Flechas\n3. Gandalf");
                        int escolhaFacil = input.nextInt();
                        if(escolhaFacil == 1){
                            System.out.println("O seu herói é o: " + hercules.getNome());
                            System.out.println("Tem direito a 300 pontos.");
                            hercules.setVida(150);
                            hercules.setForca(25);
                            hercules.setOuro(20);
                            System.out.println("Aqui está o seu herói: ");
                            hercules.mostrarDetalhes();

                        } else if (escolhaFacil == 2) {
                            System.out.println("O seu héroi é o " + flechas.getNome());
                            System.out.println("Tem direito a 300 pontos.");
                            flechas.setVida(150);
                            flechas.setForca(25);
                            flechas.setOuro(20);
                            System.out.println("Aqui está o seu herói: ");
                            flechas.mostrarDetalhes();
                        } else if (escolhaFacil == 3) {
                            System.out.println("O seu herói é o " + gandalf.getNome());
                            System.out.println("Tem direito a 300 pontos.");
                            gandalf.setVida(150);
                            gandalf.setForca(25);
                            gandalf.setOuro(20);
                            System.out.println("Aqui está o seu herói: ");
                            gandalf.mostrarDetalhes();
                        }
                        break;
                    case 2:
                        System.out.println("Escolha o seu Heroi");
                        System.out.println("1. Hercules\n2. Flechas\n3. Gandalf");
                        int escolhaDificil = input.nextInt();
                        if(escolhaDificil == 1){
                            System.out.println("O seu herói é o: " + hercules.getNome());
                            System.out.println("Tem direito a 220 pontos.");
                            hercules.setVida(110);
                            hercules.setForca(22);
                            hercules.setOuro(15);
                            System.out.println("Aqui está o seu herói: ");
                            hercules.mostrarDetalhes();
                        } else if (escolhaDificil == 2) {
                            System.out.println("O seu héroi é o " + flechas.getNome());
                            System.out.println("Tem direito a 300 pontos.");
                            flechas.setVida(110);
                            flechas.setForca(22);
                            flechas.setOuro(15);
                            System.out.println("Aqui está o seu herói: ");
                            flechas.mostrarDetalhes();
                        } else if (escolhaDificil == 3) {
                            System.out.println("O seu herói é o " + gandalf.getNome());
                            System.out.println("Tem direito a 300 pontos.");
                            gandalf.setVida(110);
                            gandalf.setForca(22);
                            gandalf.setOuro(15);
                            System.out.println("Aqui está o seu herói: ");
                            gandalf.mostrarDetalhes();
                        }
                        break;
                }
            } while (num != 3);

        hercules.mostrarDetalhes();



            }

    public static void main(String[] args) {


        labirinto();





        /*hercules.mostrarDetalhes();
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
        hercules.atacar(bot);*/

    }
}
