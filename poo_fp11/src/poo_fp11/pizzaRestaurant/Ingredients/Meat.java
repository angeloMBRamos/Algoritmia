package poo_fp11.pizzaRestaurant.Ingredients;

import poo_fp11.pizzaRestaurant.Enums.IngredientOrigin;
import poo_fp11.pizzaRestaurant.Enums.IngredientUnitMesure;
import poo_fp11.pizzaRestaurant.Enums.MeatType;

public class Meat extends Topping{

    private MeatType type;

    public Meat(int id, String name, IngredientUnitMesure unitMesure, float calories, IngredientOrigin origin, MeatType type) {
        super(id, name, unitMesure, calories, origin);
        this.type = type;
    }
}
