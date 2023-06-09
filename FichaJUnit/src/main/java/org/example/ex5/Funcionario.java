package org.example.ex5;

public class Funcionario {
    private String nome, departamento;
    private double salario;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public double aumentarSalario(double aumento){

        if(aumento > 0){
            this.salario*=(1+(aumento/100));
            return salario;
        }else{
            throw new IllegalArgumentException("Não é possível dar aumentos de 0 ou valores negativos");
        }

    }

    public void exibirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Departamento: " + this.departamento);
    }
}
