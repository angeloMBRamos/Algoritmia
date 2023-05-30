package poo_fp_rpg.jogo;

import poo_fp_rpg.entidades.*;
import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.ItemHeroi;
import poo_fp_rpg.items.PocaoHP;
import poo_fp_rpg.items.TipoHeroi;

import java.util.ArrayList;
import java.util.Scanner;

public class Jogo {
    static Scanner input = new Scanner(System.in);

    public static Heroi criacao(){

        Heroi meuHeroi = null;

        ArrayList<TipoHeroi> permissaoGeral = new ArrayList<>();
        permissaoGeral.add(TipoHeroi.CAVALEIRO);
        permissaoGeral.add(TipoHeroi.ARQUEIRO);
        permissaoGeral.add(TipoHeroi.FEITICEIRO);

        /*ArrayList<PocaoHP> listaPocoes = new ArrayList<>();
        PocaoHP pocaoInicial = new PocaoHP("sem poções", 0, permissaoGeral, 0);
        listaPocoes.add(pocaoInicial);*/
       // Arma inicial = new Arma("sem arma",0,permissaoGeral,0);

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
                        /*meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);*/
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                    } else if (escolha == 2) {
                        meuHeroi = new Arqueiro("Flechas", 0, 0, 0, 0);
                        System.out.println("O seu héroi é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(150);
                        meuHeroi.setForca(25);
                        meuHeroi.setOuro(20);
                       /* meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);*/
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                    } else if (escolha == 3) {
                        meuHeroi = new Feiticeiro("Gandalf", 0, 0, 0, 0);
                        System.out.println("O seu herói é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(150);
                        meuHeroi.setForca(25);
                        meuHeroi.setOuro(20);
                        /*meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);*/
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
                        /*meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);*/
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                    } else if (escolha == 2) {
                        meuHeroi = new Arqueiro("Flechas", 0, 0, 0, 0);
                        System.out.println("O seu héroi é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(110);
                        meuHeroi.setForca(22);
                        meuHeroi.setOuro(15);
                        /*meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);*/
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                    } else if (escolha == 3) {
                        meuHeroi = new Feiticeiro("Gandalf", 0, 0, 0, 0);
                        System.out.println("O seu herói é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(110);
                        meuHeroi.setForca(22);
                        meuHeroi.setOuro(15);
                        /*meuHeroi.setArma(inicial);
                        meuHeroi.setPocoes(listaPocoes);*/
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
    public static void sala1(Heroi heroi){
        NPC bot1 = new NPC("Cinco Pontes", 100, 20);
        System.out.println("Aqui vai enfrentar o " + bot1.getNome() + " que tem o poder das pontes");
        heroi.atacar(bot1);
    }
    public static void sala2(Heroi heroi){
        NPC bot2 = new NPC("Paralelo", 80, 25);
        System.out.println("Aqui vai enfrentar o " + bot2.getNome() + " que tem o poder das pedras da calçada");
        heroi.atacar(bot2);
    }
    public static void sala3(Heroi heroi){
        NPC bot3 = new NPC("Os Velhotes", 85, 23);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " que tem o poder das pedras da calçada");
        heroi.atacar(bot3);
    }

    public static boolean labirinto() {

        boolean continueGame= true;
        Heroi heroi= criacao();
        Vendedor vendedor = trafico();
        vendedor.imprimirInventario();
        vendedor.vender(heroi);

        System.out.println("Chegas-te ao primeiro momento de decisão de vida ou morte");
        System.out.println("A opção 1: Sala 1 - Batalha das 5 pontes!");
        System.out.println("A opção 2: Sala2 - Batalha dos 4 caminhos!");
        System.out.println("A opção 0: Sair do Jogo");
        System.out.println("Qual a sua opção?");
        do {
            int opcao = input.nextInt();
            switch (opcao) {
                case 0:
                    continueGame = false;
                    break;
                case 1:
                    sala1(heroi);
                    System.out.println("Escolhe a próxima batalha:");
                    System.out.println("A opção 1 leva-te para a sala 2 - Batalha dos 4 caminhos!");
                    System.out.println("A opção 2 leva-te para a sala3 - Batalha do Vinho do Porto!");
                    System.out.println("Qual a sua opção?");
                    int escolha = input.nextInt();
                    if(escolha == 1){
                        opcao = 2;
                    }else {
                        opcao = 3;
                    }
                    break;
                case 2:
                    vendedor.imprimirInventario();
                    vendedor.vender(heroi);
                    sala2(heroi);
                    break;
                case 3:
                    sala3(heroi);
                    break;
                default:
                    System.out.println("Escolha errada. Tente novamente!!!!!");
            }
        }while(continueGame);

        return true;
    }

    public static void main(String[] args) {

        System.out.println("Bem vindo ao Mundo das Batalhas");
        System.out.println("--------------------------------------");
        System.out.println("A aventura vai começar");
        System.out.println("--------------------------------------");

        if(labirinto()){
            System.out.println("Parabéns venceu todas as batalhas e chegou ao fim do jogo!");
        }else{
            System.out.println("Game Over!");
            System.out.println("Descansa e entra na aventura novamente!");
        }



    }
}
