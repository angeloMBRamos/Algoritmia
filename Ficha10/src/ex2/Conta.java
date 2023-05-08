package ex2;

public class Conta {

    private String numeroConta, titular;
    private double saldo, margem, divida;
    private int anoAbertura;

    public Conta(String numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.anoAbertura=2023;
        this.saldo = saldo;
        this.divida=0;
    }

    public double margemEmprestimo(){
        return this.margem=this.saldo*0.9;
    }

    public boolean pedirEmprestimo(int valor){
            if (this.divida >0) {
            System.out.println("Não pode pedir emprestimo");
            return false;
            } else if (valor < margemEmprestimo()) {
                this.saldo+=valor;
                this.divida+=valor;
                System.out.println("Saldo: " + this.saldo);
                System.out.println("Divida: " + this.divida);
                return true;
            }else{
                System.out.println("Não pode pedir empréstimo porque não tem margem suficiente");
                return false;
            }
    }
}
