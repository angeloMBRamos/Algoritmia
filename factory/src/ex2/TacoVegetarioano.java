package ex2;

public class TacoVegetarioano extends Taco{

    /**
     * Método para imprimir na consola que o taco vegetariano está a ser preparado
     */
    @Override
    public void prepare() {
        System.out.println("A preparar Taco Vegetariano...");
    }

    /**
     * Método para imprimir na consola que o taco vegetariano está a ser cozinhado
     */
    @Override
    public void bake() {
        System.out.println("A cozinhar Taco Vegetariano...");
    }

    /**
     * Método para imprimir na consola que o taco vagetariano está a ser embalado
     */
    @Override
    public void box() {
        System.out.println("A embalar Taco Vegetariano...");
    }
}
