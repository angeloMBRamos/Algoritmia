package poo_fp_rpg.entidades;

public class NPC extends Entidade{
    /**
     * Construtor da classe NPC
     * @param nome O nome do NPC
     * @param vida A quantidade de pontos de vida do NPC
     * @param forca A força do NPC
     */
    public NPC(String nome, int vida, int forca) {
        super(nome, vida, forca);
    }

    /**
     * Método para exibir os detalhes do NPC
     */
    @Override
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Força: " + getForca());
    }
}
