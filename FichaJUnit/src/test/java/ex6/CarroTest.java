package ex6;

import org.example.ex6.Carro;
import org.example.ex6.Combustivel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    Carro carro;

    @Test
    public void calcularIdadeteste(){
        this.carro = new Carro("Mercedes","A45",2010,100, 2.0, 5.2, Combustivel.GASOLINA);
        assertEquals(13, carro.calcularIdade());
    }
    @Test
    public void calcularIdadeSuperiorAnoCorrente(){
        this.carro = new Carro("Mercedes","A45",2024,100, 2.0, 5.2, Combustivel.GASOLINA);
        assertThrows(IllegalArgumentException.class,()-> carro.calcularIdade());
    }
    @Test
    public void calcularIdadeValoresNegativos(){
        this.carro = new Carro("Mercedes","A45",-2010,100, 2.0, 5.2, Combustivel.GASOLINA);
        assertThrows(IllegalArgumentException.class,()-> carro.calcularIdade());
    }
    @Test
    public void LigarCarroMaisDe30AnosDiesel(){
        this.carro = new Carro("Mercedes","A45",1920,100, 2.0, 5.2, Combustivel.DIESEL);
        Assertions.assertEquals( "Deita um pouco de fumo...Custa a pegar...O carro está ligado!\nVrum-vrum-vrum", carro.ligar());
    }
    @Test
    public void LigarCarroMaisDe30NotDiesel(){
        this.carro = new Carro("Mercedes","A45",1920,100, 2.0, 5.2, Combustivel.GPL);
        Assertions.assertEquals( "Custa a pegar...O carro está ligado!\nVrum-vrum-vrum", carro.ligar());
        this.carro = new Carro("Mercedes","A45",1920,100, 2.0, 5.2, Combustivel.GASOLINA);
        Assertions.assertEquals( "Custa a pegar...O carro está ligado!\nVrum-vrum-vrum", carro.ligar());
    }
    @Test
    public void LigarCarroMenosDe30AnosPotenciaBaixa(){
        this.carro = new Carro("Mercedes","A45",2010,100, 2.0, 5.2, Combustivel.GASOLINA);
        assertEquals("O carro está ligado!\nVrummmmmmmmmmm",carro.ligar());
    }
    @Test
    public void LigarCarroMenosDe30AnosPotenciaAlta(){
        this.carro = new Carro("Mercedes","A45",2010,300, 2.0, 5.2, Combustivel.GASOLINA);
        assertEquals("O carro está ligado!\nVRUUUMMMMM",carro.ligar());
    }
    @Test
    public void LigarCarroCom30AnosPotenciaAlta(){
        this.carro = new Carro("Mercedes","A45",1993,300, 2.0, 5.2, Combustivel.GASOLINA);
        assertEquals("O carro está ligado!\nVRUUUMMMMM",carro.ligar());
    }

    @Test
    public void testarCorridaEmpate(){
        Carro carro1 = new Carro("Mercedes","A45",1993,300, 2.0, 5.2, Combustivel.GASOLINA);
        Carro carro2 = new Carro("Mercedes","A45",1993,300, 2.0, 5.2, Combustivel.GASOLINA);

        assertNull(carro1.corrida(carro2));
    }
    @Test
    public void testarCorridaCarro1VencedorMaiorPotencia(){
        Carro carro1 = new Carro("Mercedes","A45",1993,300, 2.0, 5.2, Combustivel.GASOLINA);
        Carro carro2 = new Carro("Mercedes","A45",1993,100, 2.0, 5.2, Combustivel.GASOLINA);

        assertEquals(carro1, carro1.corrida(carro2));
    }
    @Test
    public void testarCorridaCarro2VencedorMaiorPotencia(){
        Carro carro1 = new Carro("Mercedes","A45",1993,100, 2.0, 5.2, Combustivel.GASOLINA);
        Carro carro2 = new Carro("Mercedes","A45",1993,300, 2.0, 5.2, Combustivel.GASOLINA);

        assertEquals(carro2, carro1.corrida(carro2));
    }
    @Test
    public void testarCorridaCarro2EmpatePotenciaMaiorCilindrada(){
        Carro carro1 = new Carro("Mercedes","A45",1993,300, 1.0, 5.2, Combustivel.GASOLINA);
        Carro carro2 = new Carro("Mercedes","A45",1993,300, 2.0, 5.2, Combustivel.GASOLINA);

        assertEquals(carro2, carro1.corrida(carro2));
    }
    @Test
    public void testarCorridaCarro1EmpatePotenciaMaiorCilindrada(){
        Carro carro1 = new Carro("Mercedes","A45",1993,300, 2.0, 5.2, Combustivel.GASOLINA);
        Carro carro2 = new Carro("Mercedes","A45",1993,300, 1.0, 5.2, Combustivel.GASOLINA);

        assertEquals(carro1, carro1.corrida(carro2));
    }
    @Test
    public void testarCorridaCarro2EmpatePotenciaEmpateCilindradaMaisRecente(){
        Carro carro1 = new Carro("Mercedes","A45",2010,300, 1.0, 5.2, Combustivel.GASOLINA);
        Carro carro2 = new Carro("Mercedes","A45",1993,300, 1.0, 5.2, Combustivel.GASOLINA);

        assertEquals(carro1, carro1.corrida(carro2));
    }
    @Test
    public void testarCorridaCarro1EmpatePotenciaEmpateCilindradaMaisRecente(){
        Carro carro1 = new Carro("Mercedes","A45",1993,300, 1.0, 5.2, Combustivel.GASOLINA);
        Carro carro2 = new Carro("Mercedes","A45",2010,300, 1.0, 5.2, Combustivel.GASOLINA);

        assertEquals(carro2, carro1.corrida(carro2));
    }























}
