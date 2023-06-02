package ex3;

public class NoDiscountStrategy implements DiscountStrategy{

    @Override
    public double estrategiaDesconto(double valor) {
        return valor;
    }
}
