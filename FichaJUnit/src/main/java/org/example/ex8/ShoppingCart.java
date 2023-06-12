package org.example.ex8;

import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<String> items;
    private String codCliente;
    public ShoppingCart(String codCliente) {
        this.codCliente=codCliente;
        this.items = new ArrayList<>();
    }

    public boolean addItem(String item) {
        return items.add(item);
    }
    public boolean removeItem(String item) {
        for(String carrinho : items){
            if(item.equals(carrinho)){
                items.remove(item);
                return true;
            }
        }
        throw new RuntimeException("The word [" + item +"] does not exist in the ArrayList");
    }
    public boolean containsItem(String item) {
        return items.contains(item);
    }
    public int getItemCount() {
        return items.size();
    }
    public boolean clearCart() {
        items.clear();
        return true;
    }

}
