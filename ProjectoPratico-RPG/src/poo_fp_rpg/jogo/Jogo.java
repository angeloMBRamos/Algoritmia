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

    /**
     * Cria um novo herói com base na escolha do jogador
     * O método permite que o jogador escolha a dificuldade do jogo e, em seguida, selecione um herói
     * entre as opções disponíveis. Dependendo da escolha do jogador, são definidos atributos específicos
     * para o herói, como nome, vida, força e ouro. O método retorna o herói criado
     * @return  O herói criado com base na escolha do jogador
     */
    public static Heroi criacao(){

        Heroi meuHeroi = null;

        ArrayList<TipoHeroi> permissaoGeral = new ArrayList<>();
        permissaoGeral.add(TipoHeroi.CAVALEIRO);
        permissaoGeral.add(TipoHeroi.ARQUEIRO);
        permissaoGeral.add(TipoHeroi.FEITICEIRO);

        Scanner input = new Scanner(System.in);
        int num;
        int escolha;
        do {
            do {
                System.out.println("Escolha a dificuldade do jogo: ");
                System.out.println("1. Fácil\n2. Dificil\n3. Sair");
                System.out.println("------------------------------------");
                num = input.nextInt();
                if (num < 1 || num > 3) {
                    System.out.println("Escolha uma opção válida do menu");
                    System.out.println("----------------------------------");
                    System.out.println();
                }
            }while (num < 1 || num > 3);

            switch (num) {
                case 1:
                    System.out.println("Escolha o seu Heroi");
                    System.out.println("1. Hercules\n2. Flechas\n3. Gandalf");
                    System.out.println("--------------------------------------");
                    escolha = input.nextInt();
                    if(escolha == 1){
                        meuHeroi= new Cavaleiro("Hercules", 0, 0, 0, 0);
                        System.out.println("O seu herói é o: " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(150);
                        meuHeroi.setForca(25);
                        meuHeroi.setOuro(20);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                        System.out.println("----------------------------");
                    } else if (escolha == 2) {
                        meuHeroi = new Arqueiro("Flechas", 0, 0, 0, 0);
                        System.out.println("O seu héroi é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(150);
                        meuHeroi.setForca(25);
                        meuHeroi.setOuro(20);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                        System.out.println("------------------------------");
                    } else if (escolha == 3) {
                        meuHeroi = new Feiticeiro("Gandalf", 0, 0, 0, 0);
                        System.out.println("O seu herói é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(150);
                        meuHeroi.setForca(25);
                        meuHeroi.setOuro(20);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                        System.out.println("---------------------------------");
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
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                        System.out.println("-------------------------------");
                    } else if (escolha == 2) {
                        meuHeroi = new Arqueiro("Flechas", 0, 0, 0, 0);
                        System.out.println("O seu héroi é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(110);
                        meuHeroi.setForca(22);
                        meuHeroi.setOuro(15);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                        System.out.println("---------------------------------");
                    } else if (escolha == 3) {
                        meuHeroi = new Feiticeiro("Gandalf", 0, 0, 0, 0);
                        System.out.println("O seu herói é o " + meuHeroi.getNome());
                        System.out.println("Tem direito a 300 pontos.");
                        meuHeroi.setVida(110);
                        meuHeroi.setForca(22);
                        meuHeroi.setOuro(15);
                        System.out.println("Aqui está o seu herói: ");
                        meuHeroi.mostrarDetalhes();
                        System.out.println("-------------------------------------");
                    }
                    num =3; // Variável para forçar a saída do menu
                    break;
            }
        } while (num != 3);
        return meuHeroi;
    }

    /**
     * Cria um novo vendedor com o stock de itens disponíveis para venda
     * O vendedor possui um stock de itens que podem ser comprados pelo jogador
     * @return um vendedor com um stock de itens disponíveis para venda
     */
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

    /**
     * Realiza uma batalha na Sala 1 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Cinco Pontes"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 1
     */
    public static void sala1(Heroi heroi){
        NPC bot1 = new NPC("Cinco Pontes", 100, 20);
        System.out.println("Aqui vai enfrentar o " + bot1.getNome() + " que tem o poder das pontes.");
        System.out.println("-------------------------------------------");
        heroi.atacar(bot1);
        System.out.println("-------------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 2 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Paralelo"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 2
     */
    public static void sala2(Heroi heroi){
        NPC bot2 = new NPC("Paralelo", 80, 25);
        System.out.println("Aqui vai enfrentar o " + bot2.getNome() + " que tem o poder das pedras da calçada.");
        System.out.println("-----------------------------------------");
        heroi.atacar(bot2);
        System.out.println("------------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 3 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Os Velhotes"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 3
     */
    public static void sala3(Heroi heroi){
        NPC bot3 = new NPC("Os Velhotes", 85, 23);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " que tem o poder do vinho.");
        System.out.println("--------------------------------------------");
        heroi.atacar(bot3);
        System.out.println("--------------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 4 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "JB Special"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 4
     */
    public static void sala4(Heroi heroi){
        NPC bot3 = new NPC("JB Special", 85, 23);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " que é um party rocker.");
        System.out.println("-----------------------------------");
        heroi.atacar(bot3);
        System.out.println("------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 5 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Doc martens"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 5
     */
    public static void sala5(Heroi heroi){
        NPC bot3 = new NPC("Doc Martens", 90, 28);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " que tem biqueiras de aço.");
        System.out.println("-----------------------------------");
        heroi.atacar(bot3);
        System.out.println("------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 6 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Big Zero"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 6
     */
    public static void sala6(Heroi heroi){
        NPC bot3 = new NPC("Big Zero", 87, 24);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " que pesa 300 kilos.");
        System.out.println("-----------------------------------");
        heroi.atacar(bot3);
        System.out.println("------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 7 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Totti"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 7
     */
    public static void sala7(Heroi heroi){
        NPC bot3 = new NPC("Totti", 89, 26);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " que tem uma força brutal de pernas.");
        System.out.println("-----------------------------------");
        heroi.atacar(bot3);
        System.out.println("------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 8 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Vader"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 8
     */
    public static void sala8(Heroi heroi){
        NPC bot3 = new NPC("Vader", 92, 28);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " que tem o poder the invocar a noite.");
        System.out.println("-----------------------------------");
        heroi.atacar(bot3);
        System.out.println("------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 9 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Vitor"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 9
     */
    public static void sala9(Heroi heroi){
        NPC bot3 = new NPC("Vitor", 94, 30);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " o destruidor de jogos.");
        System.out.println("-----------------------------------");
        heroi.atacar(bot3);
        System.out.println("------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 10 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Tó Martelo"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 10
     */
    public static void sala10(Heroi heroi){
        NPC bot3 = new NPC("Tó Martelo", 91, 31);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " que tem muitos martelos.");
        System.out.println("-----------------------------------");
        heroi.atacar(bot3);
        System.out.println("------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 11 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Pistolas"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 11
     */
    public static void sala11(Heroi heroi){
        NPC bot3 = new NPC("Pistolas", 82, 32);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " que tem o poder da pontaria.");
        System.out.println("-----------------------------------");
        heroi.atacar(bot3);
        System.out.println("------------------------------------");
    }

    /**
     * Realiza uma batalha na Sala 12 do jogo
     * O herói passado como parâmetro enfrentará um NPC chamado "Terrarea"
     * Após a batalha, exibe-se o resultado
     * @param heroi O herói que irá enfrentar o NPC na Sala 12
     */
    public static void sala12(Heroi heroi){
        NPC bot3 = new NPC("Terrarea", 83, 33);
        System.out.println("Aqui vai enfrentar o " + bot3.getNome() + " que tem o poder de invocar plantas carnivoras.");
        System.out.println("-----------------------------------");
        heroi.atacar(bot3);
        System.out.println("------------------------------------");
    }

    /**
     * Inicia a execução do labirinto do jogo
     * O jogador terá que fazer escolhas e enfrentar batalhas em diferentes salas
     * Após cada batalha, o jogador tem a opção de escolher a próxima sala para explorar
     * @return true se o herói completar todas as salas com vida suficiente, caso contrário, retorna false
     */
    public static boolean labirinto() {

        int op;

        Heroi heroi = criacao();
        Vendedor vendedor = trafico();
        System.out.println("Tem à sua disposição a lista de produtos do vendedor caso queira adquirir algum item:");
        vendedor.imprimirInventario();
        vendedor.vender(heroi);

        System.out.println("Chegas-te ao primeiro momento da aventura");
        System.out.println("A opção 1: Sala 1");
        System.out.println("A opção 2: Sala 2");
        System.out.println("Qual a sua opção?");
        int escolha = input.nextInt();

        if (escolha == 1) {
            System.out.println("Batalha das 5 pontes!");
            System.out.println("*******************************");
            System.out.println("Aqui tem a lista de itens do Vendedor:");
            System.out.println();
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            System.out.println();
            System.out.println("A luta vai começar!!!!!!!!!!");
            sala1(heroi);
            if(heroi.getVida() <= 0){
                return false;
            }
        }else {
            System.out.println("Batalha dos 4 caminhos!");
            System.out.println("*****************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala2(heroi);
            if(heroi.getVida()<0){
                return false;
            }
        }
        System.out.println("Escolhe a próxima batalha:");
        System.out.println("************************************");
        System.out.println("A opção 1: Sala 3 ");
        System.out.println("A opção 2: Sala 4");
        System.out.println("Qual a sua opção?");
        escolha = input.nextInt();

        if (escolha == 1) {
            System.out.println("Batalha do Vinho do Porto!");
            System.out.println("*******************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala3(heroi);
            if(heroi.getVida() <0){
                return false;
            }
        }else {
            System.out.println("Batalha JB - Juanito Caminhante");
            System.out.println("***************************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala4(heroi);
            if(heroi.getVida() <0){
                return false;
            }
        }
        System.out.println("Escolhe a próxima batalha:");
        System.out.println("************************************");
        System.out.println("A opção 1: Sala 5 ");
        System.out.println("A opção 2: Sala 6");
        System.out.println("Qual a sua opção?");
        escolha = input.nextInt();
        if (escolha == 1) {
            System.out.println("Batalha do Aço!");
            System.out.println("*******************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala5(heroi);
            if(heroi.getVida() <0){
                return false;
            }
        }else {
            System.out.println("Batalha com muita banha");
            System.out.println("***************************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala6(heroi);
            if(heroi.getVida() <0){
                return false;
            }
        }
        System.out.println("Escolhe a próxima batalha:");
        System.out.println("************************************");
        System.out.println("A opção 1: Sala 7 ");
        System.out.println("A opção 2: Sala 8");
        System.out.println("Qual a sua opção?");
        escolha = input.nextInt();
        if (escolha == 1) {
            System.out.println("Batalha do Universo FIFA!");
            System.out.println("*******************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala7(heroi);
            if(heroi.getVida() <0){
                return false;
            }
        }else {
            System.out.println("Batalha do Metaverso");
            System.out.println("***************************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala8(heroi);
            if(heroi.getVida() <0){
                return false;
            }
        }
        System.out.println("Escolhe a próxima batalha:");
        System.out.println("************************************");
        System.out.println("A opção 1: Sala 7 ");
        System.out.println("A opção 2: Sala 8");
        System.out.println("Qual a sua opção?");
        escolha = input.nextInt();
        if (escolha == 1) {
            System.out.println("Batalha dos jogos!");
            System.out.println("*******************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala9(heroi);
            if(heroi.getVida() <0){
                return false;
            }
        }else {
            System.out.println("Batalha dos Martelos");
            System.out.println("***************************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala10(heroi);
            if(heroi.getVida() <0){
                return false;
            }
        }
        System.out.println("Escolhe a próxima batalha:");
        System.out.println("************************************");
        System.out.println("A opção 1: Sala 7 ");
        System.out.println("A opção 2: Sala 8");
        System.out.println("Qual a sua opção?");
        escolha = input.nextInt();
        if (escolha == 1) {
            System.out.println("Batalha do Universo Western!");
            System.out.println("*******************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala11(heroi);
            if(heroi.getVida() <0){
                return false;
            }
        }else {
            System.out.println("Batalha do Universo orgânico");
            System.out.println("***************************************");
            vendedor.imprimirInventario();
            vendedor.vender(heroi);
            System.out.println("Quer usar a poção que está na Bolsa de poções?");
            System.out.println("Escolha 1 para sim e 2 para não");
            op = input.nextInt();
            if(op == 1){
                heroi.usarPocao();
            }else{
                System.out.println("Continuando a aventura");
            }
            sala12(heroi);
            if(heroi.getVida() <0){
                return false;
            }
        }

         return true;
    }

    public static void main(String[] args) {

        System.out.println("\nBem vindo ao Mundo das Batalhas");
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
