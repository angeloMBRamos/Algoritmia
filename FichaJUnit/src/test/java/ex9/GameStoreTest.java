package ex9;

import org.example.ex9.GameStore;
import org.example.ex9.VideoGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    }
}
