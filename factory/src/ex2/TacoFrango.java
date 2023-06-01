package ex2;

public class TacoFrango extends Taco{

    /**
     * Método para imprimir na consola que o taco de frango está a ser preparado
     */
    @Override
    public void prepare() {
        System.out.println("A preparar Taco de Carne de Frango...");
    }

    /**
     * Método para imprimir na consola que o taco de frango está a ser cozinhado
     */
    @Override
    public void bake() {
        System.out.println("A cozinhar Taco de Carne de Frango...");
    }

    /**
     * Método para imprimir na consola que o taco de frango está a ser embalado
     */
    @Override
    public void box() {
        System.out.println("A embalar Taco de Carne de Frango...");
    }
}
