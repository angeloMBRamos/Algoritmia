package poo_fp11.pizzaRestaurant;

import poo_fp11.pizzaRestaurant.Ingredients.Ingredient;

public class PizzaIngredients {
    private Ingredient ingredient;
    private float quantity;

    public PizzaIngredients(Ingredient ingredient, float quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
