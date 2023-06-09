package ex3;

import org.example.ex3.Alimento;
import org.example.ex3.Animal;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.rmi.Naming;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalTest {

    private Animal animal;

    @BeforeEach
    public void setup(){
        animal = new Animal("Girafa",Alimento.VEGETAIS);
    }

    @Test
    public void testeComerValido(){
        animal.comer(Alimento.CARNE);
        assertTrue(animal.estaComFome());
        assertTrue(animal.comer(Alimento.VEGETAIS));
    }

    @Test
    public void testeComerInvalido(){
        animal.comer(Alimento.VEGETAIS);
        assertFalse(animal.estaComFome());
    }

    @Test
    public void testeComerNull(){
        animal.comer(null);
        assertTrue(animal.estaComFome());
    }


}
