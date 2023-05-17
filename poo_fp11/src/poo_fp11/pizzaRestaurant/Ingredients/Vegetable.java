package poo_fp11.pizzaRestaurant.Ingredients;

import poo_fp11.pizzaRestaurant.Enums.IngredientOrigin;
import poo_fp11.pizzaRestaurant.Enums.IngredientUnitMesure;
import poo_fp11.pizzaRestaurant.Enums.VegetableType;

public class Vegetable extends Topping{
    private VegetableType type;

    public Vegetable(int id, String name, IngredientUnitMesure unitMesure, float calories, IngredientOrigin origin, VegetableType type) {
        super(id, name, unitMesure, calories, origin);
        this.type = type;
    }
}
