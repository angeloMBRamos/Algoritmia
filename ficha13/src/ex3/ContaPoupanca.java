package ex3;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void depositar(double valor) {
        System.out.println("A depositar: " + valor + "€.");
        double saldo = getSaldo() + valor;
        System.out.println("Saldo do " + getTitular() +  " após o depósito de " + valor + ": " + saldo);
    }

    @Override
    public void levantar(double valor) {
        System.out.println("A levantar: " + valor + "€.");
        double saldo = getSaldo() - valor;
        System.out.println("Saldo do " + getTitular() +  " após o levantamento de " + valor + ": " + saldo);
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("Saldo: " + getSaldo());

    }
}
