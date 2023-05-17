package poo_fp11.pizzaRestaurant.Ingredients;

import poo_fp11.pizzaRestaurant.Enums.IngredientOrigin;
import poo_fp11.pizzaRestaurant.Enums.IngredientUnitMesure;
import poo_fp11.pizzaRestaurant.Enums.SeafoodType;

public class Seafood extends Topping{

    private SeafoodType type;

    public Seafood(int id, String name, IngredientUnitMesure unitMesure, float calories, IngredientOrigin origin, SeafoodType type) {
        super(id, name, unitMesure, calories, origin);
        this.type = type;
    }
}
