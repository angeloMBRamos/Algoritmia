package poo_fp_rpg.entidades;

import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;
import java.util.Scanner;

abstract public class Heroi extends Entidade{
    private int nivel, ouro;
    private ArrayList<PocaoHP> pocoes;
    private Arma arma;

    /**
     * Construtor da classe Heroi
     * @param nome O nome do herói
     * @param vida A quantidade de pontos de vida do herói
     * @param forca  A força do herói
     * @param nivel O nível do herói
     * @param ouro A quantidade de ouro do herói
     */
    public Heroi(String nome, int vida, int forca, int nivel, int ouro) {
        super(nome, vida, forca);
        this.nivel = nivel;
        this.ouro = ouro;
        this.pocoes = new ArrayList<>();

    }

    /**
     * Retorna o nível do herói
     * @return  O nível do herói
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Retorna o ouro do herói
     * @return O ouro do herói
     */
    public int getOuro() {
        return ouro;
    }

    /**
     * Retorna a lista de poções de vida do herói
     * @return A lista de poções de vida do herói
     */
    public ArrayList<PocaoHP> getPocoes() {
        return pocoes;
    }

    /**
     * Retorna a arma do herói
     * @return a arma do herói
     */
    public Arma getArma() {
        return arma;
    }

    /**
     * Actualiza o nível do herói
     * @param nivel O novo nível do herói
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Actualiza o ouro do herói
     * @param ouro O novo ouro do herói
     */
    public void setOuro(int ouro) {
        this.ouro = ouro;
    }

    /**
     * Actualiza a lista de poções de vida do herói
     * @param pocoes A nova lista de poções do herói
     */
    public void setPocoes(ArrayList<PocaoHP> pocoes) {
        this.pocoes = pocoes;
    }

    /**
     * Actualiza a arma do herói
     * @param arma O nova arma do herói
     */
    public void setArma(Arma arma) {
        this.arma = arma;
    }

    /**
     * Método abstrato para realizar um ataque a um NPC inimigo
     * Implementações concretas desta classe devem fornecer uma implementação para realizar o ataque
     * @param inimigo O NPC inimigo a ser atacado
     * @return true se o ataque for bem-sucedido, false caso contrário
     */
    abstract public boolean atacar(NPC inimigo);

    /**
     * Utiliza uma poção de vida da bolsa do herói
     * Pede ao usuário que escolha uma poção da bolsa e adiciona os pontos de vida da poção à vida do herói
     * Após utilizar a poção, a mesma é removida da bolsa do herói
     */
    public void usarPocao(){
        Scanner input = new Scanner(System.in);
        int contador = 0;

            for (PocaoHP pocao : this.getPocoes()) {
                System.out.println("Bolsa de poções: ");
                System.out.println("Item: " + contador);
                System.out.println(pocao.getNome() + " Vida :" + pocao.getVida());
                contador++;
            }
            System.out.println("Escolha o item da sua bolsa de poções?");
            int opcao = input.nextInt();
            int pontosVida = this.getPocoes().get(opcao).getVida();
            System.out.println("Tinha " + this.getVida() + " de vida.");
            this.setVida(this.getVida() + pontosVida);
            System.out.println("Passou a ter: " + this.getVida() + " de vida");
            this.getPocoes().remove(opcao);
            System.out.println("------------------------------------------");

    }
}
