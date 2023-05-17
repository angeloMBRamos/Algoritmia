package poo_fp11.pizzaRestaurant.Ingredients;

import poo_fp11.pizzaRestaurant.Enums.IngredientUnitMesure;
import poo_fp11.pizzaRestaurant.Enums.PizzaBase;

public class Base extends Ingredient{
    private PizzaBase type;
    private String description;

    public Base(int id, String name, float calories, PizzaBase type, String description) {
        super(id, name, IngredientUnitMesure.GRAMAS, calories);
        this.type = type;
        this.description = description;
    }
}
