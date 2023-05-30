package poo_fp_rpg.entidades;

abstract public class Entidade {

    private String nome;
    private int vida;
    private int forca;

    /**
     * Construtor da classe Entidade
     * @param nome O nome da entidade
     * @param vida A quantidade de pontos de vida da entidade
     * @param forca A força da entidade
     */
    public Entidade(String nome, int vida, int forca) {
        this.nome = nome;
        this.vida = vida;
        this.forca = forca;
    }

    /**
     * Retorna o nome da entidade
     * @return  O nome da entidade
     */
    public String getNome() {
        return nome;
    }

    /**
     * Retorna a vida da entidade
     * @return A vida da entidade
     */
    public int getVida() {
        return vida;
    }

    /**
     * Retorna a força da entidade
     * @return A força da entidade
     */
    public int getForca() {
        return forca;
    }

    /**
     * Define a quantidade de pontos de vida da entidade
     * @param vida A nova quantidade de pontos de vida
     */
    public void setVida(int vida) {

        this.vida = vida;
    }

    /**
     * Define a quantidade de pontos de força da entidade
     * @param forca A nova quantidade de pontos de força
     */
    public void setForca(int forca) {
        this.forca = forca;
    }

    /**
     * Método abstrato para exibir os detalhes da entidade
     * Implementações concretas desta classe devem fornecer uma implementação para exibir os detalhes específicos.
     */
    abstract public void mostrarDetalhes();
}
