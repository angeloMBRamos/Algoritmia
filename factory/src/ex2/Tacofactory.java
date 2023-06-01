package ex2;

public class Tacofactory {

    public static Taco createTaco(String tipo) {
        switch(tipo){
            case "CARNE VACA":
                return new TacoVaca();
            case "CARNE FRANGO":
                return new TacoFrango();
            case "VEGETARIANO":
                return new TacoVegetarioano();
            default:
                throw new IllegalArgumentException("Não temos tacos desse tipo " + tipo);
        }
    }
}
