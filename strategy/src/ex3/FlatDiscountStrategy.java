package ex3;

public class FlatDiscountStrategy implements DiscountStrategy{

    @Override
    public double estrategiaDesconto(double valor) {
        return valor * 100;
    }
}
