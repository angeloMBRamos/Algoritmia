package ex4;

import org.example.ex3.Alimento;
import org.example.ex3.Animal;
import org.example.ex4.Rectangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RectanguloTest {

    Rectangulo rectangulo;

    @BeforeEach
    public void setup(){
        rectangulo = new Rectangulo(2.5, 3.2);
    }

    @Test
    public void areaRectanguloTeste(){
        assertEquals(8, rectangulo.areaRectangulo());
    }

    @Test
    public void perimetroRectanguloTeste(){
        assertEquals(11.4, rectangulo.perimetroRectangulo());
    }

    //Casos de teste mais especificos
    @Test
    public void perimetroRectanguloTesteLado0(){
        this.rectangulo= new Rectangulo(0,10);
        assertEquals(0, rectangulo.perimetroRectangulo());

        this.rectangulo= new Rectangulo(10,0);
        assertEquals(0, rectangulo.perimetroRectangulo());
    }

    @Test
    public void perimetroRectanguloNegativoTeste(){
        this.rectangulo= new Rectangulo(-10,10);
        assertThrows(IllegalArgumentException.class, ()->{
            rectangulo.perimetroRectangulo();
        });
    }


}
