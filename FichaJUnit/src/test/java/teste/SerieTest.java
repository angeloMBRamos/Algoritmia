package teste;

import org.example.testeOriginal.Episodio;
import org.example.testeOriginal.Serie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class SerieTest {

    private Serie serie;

    private Episodio episodio;
    private ArrayList<Episodio> temporada1;
    private ArrayList<Episodio> temporada2;
    private ArrayList<Episodio> temporada3;


@BeforeEach
    public void setUp(){
    this.serie=new Serie("Seinfeld", "Comedia");
    this.temporada1 = new ArrayList<>();
    this.temporada2 = new ArrayList<>();
    this.temporada3 = new ArrayList<>();
}

@Test
public void calcularMediaDuracaoEpisodiosTeste(){

    Episodio ep1 = new Episodio("Ep1", 45);
    Episodio ep11 = new Episodio("Ep3", 51);
    Episodio ep2 = new Episodio("Ep2", 35);
    Episodio ep3 = new Episodio("Ep3", 47);
    serie.getTemporada1().add(ep1);
    serie.getTemporada2().add(ep2);
    serie.getTemporada2().add(ep3);
    serie.getTemporada3().add(ep11);

    assertEquals()
}



}
