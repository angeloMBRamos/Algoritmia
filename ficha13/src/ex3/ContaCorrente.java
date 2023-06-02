package ex3;

public class ContaCorrente extends ContaBancaria implements Transferivel{

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void transferir(double valor, ContaBancaria destino) {
        if(this.getSaldo() >= valor){
            this.setSaldo(this.getSaldo()-valor);
            destino.setSaldo(destino.getSaldo()+valor);
        }else{
            System.out.println("Transferência permitada para a conta " + destino);
            double saldo = this.getSaldo() - valor;
            System.out.println("O seu saldo: " + saldo);
        }
    }
}
