package poo_fp_rpg.jogo;

import poo_fp_rpg.entidades.*;
import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.ItemHeroi;
import poo_fp_rpg.items.PocaoHP;
import poo_fp_rpg.items.TipoHeroi;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {

    public static Heroi criacao(){

        Heroi meuHeroi = null;

        ArrayList<TipoHeroi> permissaoGeral = new ArrayList<>();
        permissaoGeral.add(TipoHeroi.CAVALEIRO);
        permissaoGeral.add(TipoHeroi.ARQUEIRO);
        permissaoGeral.add(TipoHeroi.FEITICEIRO);

        ArrayList<PocaoHP> listaPocoes = new ArrayList<>();
        PocaoHP pocaoInicial = new PocaoHP("sem poções", 0, permissaoGeral, 0);
        listaPocoes.add(pocaoInicial);

        Arma inicial = new Arma("sem arma",0,permissaoGeral,0);

        Scanner input = new Scanner(System.in);
        int num;
        int escolha;
        do {
            do {
                System.out.println("Escolha a dificuldade do jogo: ");
                System.out.println("1. Fácil\n2. Dificil\n3. Sair");
                num = input.nextInt();
                if (num < 1 || num > 3) {
                    System.out.println("Escolha uma opção válida do menu");
                }

            }while (num < 1 || num > 3);

            switch (num) {

                case 1:
                    System.out.println("Escolha o seu Heroi");
                    System.out.println("1. Hercules\n2. Flechas\n3. Gandalf");
                    escolha = input.nextInt();

                    if(escolha == 1){
                        meuHeroi= new Cavaleiro("Hercules", 0, 0, 0, 0);
                        System.out.println("O seu herói é o: " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(150);
                        meuHeroi.setForca(25);
                        meuHeroi.setOuro(20);
                        meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                    } else if (escolha == 2) {
                        meuHeroi = new Arqueiro("Flechas", 0, 0, 0, 0);
                        System.out.println("O seu héroi é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(150);
                        meuHeroi.setForca(25);
                        meuHeroi.setOuro(20);
                        meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                    } else if (escolha == 3) {
                        meuHeroi = new Feiticeiro("Gandalf", 0, 0, 0, 0);
                        System.out.println("O seu herói é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(150);
                        meuHeroi.setForca(25);
                        meuHeroi.setOuro(20);
                        meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                    }
                    num =3; // Variável para forçar a saída do menu
                    break;
                case 2:
                    System.out.println("Escolha o seu Heroi");
                    System.out.println("1. Hercules\n2. Flechas\n3. Gandalf");
                    escolha = input.nextInt();
                    if(escolha == 1){
                        meuHeroi= new Cavaleiro("Hercules", 0, 0, 0, 0);
                        System.out.println("O seu herói é o: " + meuHeroi.getNome());
                        System.out.println("Tem direito a 220 pontos.");
                        meuHeroi.setVida(110);
                        meuHeroi.setForca(22);
                        meuHeroi.setOuro(15);
                        meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                    } else if (escolha == 2) {
                        meuHeroi = new Arqueiro("Flechas", 0, 0, 0, 0);
                        System.out.println("O seu héroi é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(110);
                        meuHeroi.setForca(22);
                        meuHeroi.setOuro(15);
                        meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                    } else if (escolha == 3) {
                        meuHeroi = new Feiticeiro("Gandalf", 0, 0, 0, 0);
                        System.out.println("O seu herói é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(110);
                        meuHeroi.setForca(22);
                        meuHeroi.setOuro(15);
                        meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                    }
                    num =3; // Variável para forçar a saída do menu
                    break;
            }

        } while (num != 3);

        return meuHeroi;
    }

    public static Vendedor trafico(){

        ArrayList<TipoHeroi> permissaoGeral = new ArrayList<>();
        permissaoGeral.add(TipoHeroi.CAVALEIRO);
        permissaoGeral.add(TipoHeroi.ARQUEIRO);
        permissaoGeral.add(TipoHeroi.FEITICEIRO);

        ArrayList<TipoHeroi> permissaoC = new ArrayList<>();
        permissaoC.add(TipoHeroi.CAVALEIRO);

        ArrayList<TipoHeroi> permissaoA = new ArrayList<>();
        permissaoA.add(TipoHeroi.ARQUEIRO);

        ArrayList<TipoHeroi> permissaoF = new ArrayList<>();
        permissaoF.add(TipoHeroi.FEITICEIRO);

        ArrayList<TipoHeroi> permissaoCA = new ArrayList<>();
        permissaoCA.add(TipoHeroi.CAVALEIRO);
        permissaoCA.add(TipoHeroi.ARQUEIRO);

        Arma espada = new Arma("Espada", 2, permissaoC, 5);
        Arma machado = new Arma("Machado", 3, permissaoC, 4);
        Arma foice = new Arma("Nunchaku", 3, permissaoCA, 3);
        Arma arco = new Arma("Arco", 4, permissaoA, 5);
        Arma fisga = new Arma("Fisga", 2, permissaoA, 3);
        Arma besta = new Arma("Besta", 3,permissaoCA, 4 );
        Arma cuboMagico = new Arma("Cubo", 3, permissaoF, 4);
        Arma estrelaMagica = new Arma("Estrela", 4, permissaoF, 5);
        Arma fosforosMagicos = new Arma("Fósforos", 2, permissaoF, 3);

        PocaoHP carlsberg = new PocaoHP("Carlsberg", 2, permissaoGeral, 25);
        PocaoHP stout = new PocaoHP("Stout", 2, permissaoGeral,12 );
        PocaoHP budweiser = new PocaoHP("Budweiser", 3, permissaoGeral, 15);
        PocaoHP sb = new PocaoHP("SuperBock", 2, permissaoGeral, 20);

        ArrayList<ItemHeroi> stockVendedor = new ArrayList<>();
        stockVendedor.add(sb);
        stockVendedor.add(stout);
        stockVendedor.add(budweiser);
        stockVendedor.add(espada);
        stockVendedor.add(foice);
        stockVendedor.add(machado);
        stockVendedor.add(arco);
        stockVendedor.add(fisga);
        stockVendedor.add(besta);
        stockVendedor.add(cuboMagico);
        stockVendedor.add(estrelaMagica);
        stockVendedor.add(fosforosMagicos);
        stockVendedor.add(carlsberg);

        return new Vendedor(stockVendedor);
    }

    public static void labirinto() {

        NPC bot = new NPC("Bot", 200, 25);
        Heroi heroi= criacao();

        heroi.atacar(bot);

        Vendedor vendedor = trafico();

        //vendedor.imprimirInventario();
        vendedor.vender(heroi);
    }

    public static void main(String[] args) {

        labirinto();



    }
}
