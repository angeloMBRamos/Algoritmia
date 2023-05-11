package ex11;

import java.util.Scanner;

public class Conta {

    Scanner input = new Scanner(System.in);

    private String numeroConta, titular;
    private int saldo = 0, valor=0;

    public Conta(String numeroConta, String titular, int saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public boolean transferencia(double valor, Conta contaDestino) {
       if(this.saldo>=valor){
           this.saldo-=valor;
           contaDestino.saldo+=valor;
           System.out.println("Transferência concluída!");
           return true;
       }else{
           System.out.println("Erro ao transferir!");
           return false;
       }
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    public void levantar(int valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
        } else {
            System.out.println("Não tens fundos para fazer o levantamento.");
        }
    }
    public void exibirSaldo(){
        System.out.println("Saldo: " + this.getSaldo());
    }
}
