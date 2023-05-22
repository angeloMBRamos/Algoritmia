package poo_fp11.pizzaRestaurant;

import poo_fp11.pizzaRestaurant.Enums.PizzaSize;

import java.util.ArrayList;

public class Pizza {
    private final int MAX_INGREDIENTS = 5;
    private int id;
    private String name, description;
    private float price;
    private PizzaSize size;
    private ArrayList<PizzaIngredients> listaIngredientes;
    private int numberOfIngredients;

    /**
     *
     * @param id - Código que identifica uma <b>Pizza</b>
     * @param name - Nome da Pizza
     * @param description - Descrição da <b>Pizza</b>
     * @param price - Preço da <b>Pizza</b>
     * @param size - Tamanho da <b>Pizza</b>
     * @param numberOfIngredients - Número de ingredientes de uma <b>Pizza</b>
     */

    public Pizza(int id, String name, String description, float price, PizzaSize size, int numberOfIngredients) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.size = size;
        this.numberOfIngredients = numberOfIngredients;
        this.listaIngredientes = new ArrayList<PizzaIngredients>(MAX_INGREDIENTS);
    }

    /**
     * Método que permite adicionar ingredientes à Pizza
     * @param pizzaIngredients
     */
    public void addIngredients(PizzaIngredients pizzaIngredients){
        this.listaIngredientes.add(pizzaIngredients);
    }

    /**
     * Permite editar a quantidade de um dos ingredientes
     * @param id - ID do Ingrediente a editar
     * @param newQuantity - Quantidade a editar
     */
    public void setIngredientQuantity(int id, double newQuantity){
        this.listaIngredientes.get(id).setQuantity(newQuantity);

    }

    /**
     *
     * @param id
     */
    public void removeIngredient(int id){

    }

    public void printPizza(){
        int count =0;
        System.out.println("Nome: " + this.name);
        for (PizzaIngredients ingredient : this.listaIngredientes){
            System.out.println("ID: " + count);
            System.out.println("Ingrediente: " + ingredient.getIngredient());
            System.out.println("Quantidade: " + ingredient.getQuantity());
            System.out.println();
        }
    }

    public double countKcal(){
        int count=0;
        for (PizzaIngredients ingredient : this.listaIngredientes){
            count += ingredient.getQuantity()*ingredient.getIngredient().getCalories();
        }
        return count;
    }
}
