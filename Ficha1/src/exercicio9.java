import java.util.Scanner;

/* Foi contactado pela empresa XPTO,Lda para elaboração de um programa que permita calcular o vencimento
de um colaborador, bem como os descontos e impostos decorrentes desse processamento salarial. Conceitos:
a. Vencimento base: €40,00/dia;
b. Subsidio alimentação: €5,00/dia;
c. Retenção de IRS: 10%;
d. Segurança social: 11% encargo do funcionário 23,75% encargo da entidade patronal.
Deve ser solicitado ao utilizador o código do funcionário, e o número de dias que ele trabalhou nesse mês.
Deverá depois apresentar:
a. Valor ilíquido a receber fruto do vencimento;
b. Total subsidio de alimentação;
c. Valor da retenção de IRS a entregar ao Estado;
d. Valor total a entregar à Segurança Social (ambos os encargos);
e. Valor líquido a receber pelo funcionário.
 */

public class exercicio9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vBase=40, sAlim=5, codigoEmp, nDias, valorIliquido, totalSubAlim;
        double irs=0.1, ssEmp=0.11, ssEnt=0.2375, totalIrs, totalSs, valorLiquido;

        System.out.println("Qual o seu código de funcionário?");
        codigoEmp = input.nextInt();
        System.out.println("Quantos dias trabalhou?");
        nDias = input.nextInt();

        valorIliquido = nDias * vBase;
        System.out.println("\nO valor iliquido é " + "€" +valorIliquido);
        totalSubAlim = nDias * sAlim;
        System.out.println("\nO subsidio de alimentação é " + "€" + totalSubAlim);
        totalIrs = valorIliquido * irs;
        System.out.println("\nO total de IRS a entrega ao Estado é de " + "€" + totalIrs);
        totalSs = (valorIliquido*ssEmp) + (valorIliquido*ssEnt);
        System.out.println("\nO valor total a entregar à segurança social é de " + "€" + totalSs);
        valorLiquido = (valorIliquido + totalSubAlim) - (totalIrs+totalSs);
        System.out.println("\nO salário liquido é de " + valorLiquido);




    }
}
