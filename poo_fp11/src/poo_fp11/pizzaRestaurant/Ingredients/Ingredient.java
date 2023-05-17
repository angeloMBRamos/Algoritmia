package poo_fp11.pizzaRestaurant.Ingredients;

import poo_fp11.pizzaRestaurant.Enums.IngredientUnitMesure;

public class Ingredient {
    private int id;
    private String name;
    private IngredientUnitMesure unitMesure;
    private float calories;

    public Ingredient(int id, String name, IngredientUnitMesure unitMesure, float calories) {
        this.id = id;
        this.name = name;
        this.unitMesure = unitMesure;
        this.calories = calories;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public IngredientUnitMesure getUnitMesure() {
        return unitMesure;
    }

    public float getCalories() {
        return calories;
    }
}
