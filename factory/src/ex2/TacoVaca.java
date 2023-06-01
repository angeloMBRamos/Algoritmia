package ex2;

public class TacoVaca extends Taco{

    /**
     * Método para imprimir na consola que o taco de carne vaca está a ser preparado
     */
    @Override
    public void prepare() {
        System.out.println("A preparar Taco de Carne de vaca...");
    }

    /**
     * Método para imprimir na consola que o taco de carne de vaca está a ser cozinhado
     */
    @Override
    public void bake() {
        System.out.println("A cozinhar Taco de Carne de Vaca....");
    }

    /**
     * Método para imprimir na consola que o taco de carne de vaca está a ser embalado
     */
    @Override
    public void box() {
        System.out.println("A embalar Taco de Carne de Vaca....");
    }
}
