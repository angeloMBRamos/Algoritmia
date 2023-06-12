package org.example.ex8;

public class Main {
    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart("123");

        shoppingCart.addItem("Agua");




        System.out.println( shoppingCart.getItemCount());
    }
}
