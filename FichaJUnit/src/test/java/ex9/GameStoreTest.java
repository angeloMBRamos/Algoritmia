package ex9;

import org.example.ex9.GameStore;
import org.example.ex9.VideoGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameStoreTest {
    private GameStore gameStore;
    private VideoGame jogo1;

    @BeforeEach
    public void setUp(){
        this.gameStore = new GameStore();
        this.jogo1 = new VideoGame("Jogo 1","EA",10.2,15.5);
    }

    @Test
    public void addGameToStockTeste(){
        gameStore.addGameToStock(jogo1);
        assertEquals(1,gameStore.getStock().size());
    }

    @Test
    public void sellGametest(){
        gameStore.addGameToStock(jogo1);
        gameStore.sellGame(0);
        assertEquals(0, gameStore.getStock().size());
        assertEquals(1, gameStore.getSales().size());
    }

    @Test
    public void calcularLucroTest(){
        gameStore.addGameToStock(jogo1);
        gameStore.sellGame(0);

        DecimalFormat df1 = new DecimalFormat( "#.##" );


        assertEquals("5,3", df1.format(gameStore.calcularLucro()));
    }
}
