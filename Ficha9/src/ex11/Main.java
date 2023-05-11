package ex11;

public class Main {
    public static void main(String[] args) {

        Conta conta1 = new Conta("1", "Ângelo", 100);
        Conta conta2 = new Conta("2", "Afonso", 200);

       //conta1.transferencia(100, conta2);
       conta2.transferencia(350, conta1);

        System.out.println("Saldo da conta " + conta1.getNumeroConta() + ": " + conta1.getSaldo());
        System.out.println("Saldo da conta " + conta2.getNumeroConta() + ": " + conta2.getSaldo());

    }
}
