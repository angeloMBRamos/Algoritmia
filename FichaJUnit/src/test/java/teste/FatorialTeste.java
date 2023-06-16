package teste;

import org.example.testeOriginal.Fatorial;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FatorialTeste {

    @Test
    public void calcularFatorial5(){
        assertEquals(120, Fatorial.calcular(5));
    }

    @Test
    public void calcularFatorial0(){
        assertEquals(1, Fatorial.calcular(0));
    }

    @Test
    public void calcularFatorial1(){
        assertEquals(1, Fatorial.calcular(1));
    }

    @Test
    public void calcularFatorialNumeroNegativo(){
        assertThrows(IllegalArgumentException.class, ()-> Fatorial.calcular(-5));
    }

}
