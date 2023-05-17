package poo_fp11.pizzaRestaurant.Enums;

public enum PizzaSize {
    SMALL,
    MEDIUM,
    BIG,
    KING;

    public static String PizzaSizeToString(PizzaSize size){
        switch (size){
            case SMALL:
                return "A pizza é pequena.";
            case MEDIUM:
                return "A pizza é média";
            case BIG:
                return "A pizza é grande.";
            case KING:
                return "A pizza é enorme.";
            default:
                return "Tamanho desconhecido.";
        }
    }
}
