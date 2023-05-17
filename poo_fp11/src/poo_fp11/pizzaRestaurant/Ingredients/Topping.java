package poo_fp11.pizzaRestaurant.Ingredients;

import poo_fp11.pizzaRestaurant.Enums.IngredientOrigin;
import poo_fp11.pizzaRestaurant.Enums.IngredientUnitMesure;

public class Topping extends Ingredient{

    private IngredientOrigin origin;

    public Topping(int id, String name, IngredientUnitMesure unitMesure, float calories, IngredientOrigin origin) {
        super(id, name, unitMesure, calories);
        this.origin = origin;
    }
}
