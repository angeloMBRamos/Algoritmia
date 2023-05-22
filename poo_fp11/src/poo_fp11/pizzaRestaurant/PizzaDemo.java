package poo_fp11.pizzaRestaurant;

import poo_fp11.pizzaRestaurant.Enums.*;
import poo_fp11.pizzaRestaurant.Ingredients.Base;
import poo_fp11.pizzaRestaurant.Ingredients.Meat;
import poo_fp11.pizzaRestaurant.Ingredients.Vegetable;

public class PizzaDemo {
    public static void main(String[] args) {

        //instanciar Ingredientes
        Base baseFinaItaly = new Base(1, "Base Fina Italian stryle", 90, PizzaBase.FINA, "Massa fina Italiana");
        Vegetable tomate = new Vegetable(2, "Tomate Cherry", IngredientUnitMesure.GRAMAS, 50, IngredientOrigin.ORIGINAL, VegetableType.TOMATE);
        Vegetable ananasAcores = new Vegetable(3, "Ananás dos Açores", IngredientUnitMesure.GRAMAS, 12, IngredientOrigin.ORIGINAL, VegetableType.ANANAS);
        Meat fiambre = new Meat(4, "Fiambre de Frango", IngredientUnitMesure.GRAMAS, 40, IngredientOrigin.IMPORTADO, MeatType.FRANGO);

        //Instanciar Pizzas
        Pizza havaiana = new Pizza(100,"Havaiana", "Pizza c/ Ananás", 12, PizzaSize.KING, 5);


        //Adicionar à Pizza ingredientes
        havaiana.addIngredients(new PizzaIngredients(baseFinaItaly, 150));
        havaiana.addIngredients(new PizzaIngredients(tomate,120));
    }
}
