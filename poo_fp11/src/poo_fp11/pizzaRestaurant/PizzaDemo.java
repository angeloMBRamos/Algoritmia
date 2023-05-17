package poo_fp11.pizzaRestaurant;

import poo_fp11.pizzaRestaurant.Enums.*;
import poo_fp11.pizzaRestaurant.Ingredients.Base;
import poo_fp11.pizzaRestaurant.Ingredients.Vegetable;

public class PizzaDemo {
    public static void main(String[] args) {

        //instanciar Ingredientes
        Base baseFina = new Base(1, "Base Fina", 90, PizzaBase.FINA, "Massa fina Italiana");
        Vegetable tomate = new Vegetable(2, "Tomate Cherry", IngredientUnitMesure.GRAMAS, 50, IngredientOrigin.ORIGINAL, VegetableType.TOMATE);

        //Instanciar Pizzas
        Pizza havaiana = new Pizza(100,"Havaiana", "Pizza c/ Ananás", 12, PizzaSize.KING, 5);


        //Adicionar à Pizza ingredientes
        havaiana.addIngredients(new PizzaIngredients(baseFina, 150));
    }
}
