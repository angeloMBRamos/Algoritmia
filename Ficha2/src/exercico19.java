import java.util.Scanner;

/*
A empresa XPTO, LDA voltou a contactá-lo n o sentido de adaptar o programa anteriormente feito às novas
alterações fiscais. Tendo em conta os dados a seguir descritos, elabore uma nova versão do programa que permite
calcular o vencimento e um trabalhador, bem como os descontos e impostos decorrentes desse processamento salarial.
Conceitos:
a. Cargo: E-Empregado, C-Chefe, A-Administrador;
b. Vencimento base: E-€40/dia, C-€60/dia, A-€80/dia
c. Subsidio de alimentação: €5/dias para os empregados e €7,5/dia para os chefes e administradores
d. Retenção de IRS:
    d.1. 10% se vencimento inferior a €1000;
    d.2. 20% se vencimento do mês superior a €1000;
e. Segurança social:
    e.1. Administradores - 9% encargo do funcionário e 21% encargo da entidade patronal;
    e.2. Outros - 11% encargo do funcionário e 23,75% encargo da entidade patronal;
Deve ser solicitado ao utilizador o código do funcionário bem como o seu cargo e o número de dias que trabalhou
nesse mês.
Depois deverá apresentar:
a.O valor liquido do vencimento;
b. Total de subsidio de alimentação;
c. Valor da retenção de IRS a entregar ao Estado;
d. Valor total a entregar À segurança social;
e. Valor liquido a receber.
 */

public class exercico19 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String codigFuncionario, cargo;
        int ndias, vBaseE=40, vBaseC=60, vBaseA=80, valorIliquido,subAlimE=5 ,totalSubAlimE;
        double valorLiquido, totalSubAlimCa=7.5;


        System.out.println("Qual o seu código de funcionário");
        codigFuncionario = input.next();
        System.out.println("Quantos dias trabalhou?");
        ndias = input.nextInt();
        System.out.println("Qual o seu cargo?");
        cargo = input.next();


switch(cargo){
    case "e":
        valorIliquido = nDias * vBaseE;
        totalSubAlimE = ndias * subAlimE;
        if(valorIliquido < 1000){

    }

        totalSubAlim = nDias * sAlim;
        totalIrs = valorIliquido * irs;
        totalSs = (valorIliquido*ssEmp) + (valorIliquido*ssEnt);
        valorLiquido = (valorIliquido + totalSubAlim) - (totalIrs+totalSs);

}


    }
}
