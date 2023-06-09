package ex5;

import org.example.ex5.Funcionario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FuncionarioTest {

    Funcionario funcionario;

    @BeforeEach
    public void setUp(){
        this.funcionario = new Funcionario("Angelo", 1000, "DEVOPS");
    }

    @Test
    public void aumentarSalarioTeste(){
        assertEquals(1035, funcionario.aumentarSalario(3.5));
    }

    @Test
    public void aumentarSalarioConValor0OuNegativo(){
        assertThrows(IllegalArgumentException.class,()-> funcionario.aumentarSalario(0));
        assertThrows(IllegalArgumentException.class,()-> funcionario.aumentarSalario(-5.6));
    }



}
