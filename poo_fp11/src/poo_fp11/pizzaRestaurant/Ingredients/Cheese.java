package poo_fp11.pizzaRestaurant.Ingredients;

import poo_fp11.pizzaRestaurant.Enums.CheeseType;
import poo_fp11.pizzaRestaurant.Enums.IngredientOrigin;
import poo_fp11.pizzaRestaurant.Enums.IngredientUnitMesure;

public class Cheese extends Topping{
    private CheeseType type;

    public Cheese(int id, String name, IngredientUnitMesure unitMesure, float calories, IngredientOrigin origin, CheeseType type) {
        super(id, name, unitMesure, calories, origin);
        this.type = type;
    }
}
