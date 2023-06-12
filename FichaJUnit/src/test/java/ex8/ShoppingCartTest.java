package ex8;

import org.example.ex8.ShoppingCart;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {

    private ShoppingCart shoppingCart;

    @BeforeEach
    public void setUp(){
        this.shoppingCart = new ShoppingCart("123");
        shoppingCart.addItem("Beer");
        shoppingCart.addItem("Presunto");
        shoppingCart.addItem("Salsicha");
    }

    @Test
    public void additemTeste(){
        assertTrue(shoppingCart.addItem("Broa"));
        assertEquals(4, shoppingCart.getItemCount());
    }
    @Test
    public void removeItemTeste(){
        assertTrue(shoppingCart.removeItem("Beer"));
        assertEquals(2, shoppingCart.getItemCount());

        assertThrows(RuntimeException.class,() -> shoppingCart.removeItem("Chourica"));
        assertEquals(2, shoppingCart.getItemCount());
    }
    @Test
    public void containsItemTest(){
        shoppingCart.addItem("garrafa");
        assertTrue(shoppingCart.containsItem("garrafa"));
        assertTrue(shoppingCart.containsItem("Beer"));
        assertFalse(shoppingCart.containsItem("Vinho"));
        assertFalse(shoppingCart.containsItem(""));
    }

    @Test
    public void getItemCountTest(){
        assertEquals(3, shoppingCart.getItemCount());
    }

    @Test
    public void clearCartTeste(){
        assertTrue(shoppingCart.clearCart());
        assertEquals(0, shoppingCart.getItemCount());
        assertNotEquals(1, shoppingCart.getItemCount());
    }





}
