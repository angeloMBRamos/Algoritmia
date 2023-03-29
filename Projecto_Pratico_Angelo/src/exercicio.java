import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nQuarto, diasReserva, totalLimpeza, totalReserva;
        double vLiquido, imposto;
        String tipo;


        System.out.println("Quantos dias esteve hospedado?");
        diasReserva = input.nextInt();
        System.out.println("Introduza o numero do quarto");
        nQuarto = input.nextInt();
        System.out.println("Qual o tipo de quarto que esteve hospedado?");
        tipo = input.next();

        switch (tipo){

            case "I":
                totalReserva = (diasReserva*200);
                System.out.println("O total iliquido deste quarto é " + totalReserva);
                totalLimpeza =  diasReserva*25;
                System.out.println("O custo total da limpeza é de " + totalLimpeza);
                if(totalReserva<=20000){
                    imposto = (totalReserva - totalLimpeza) * 0.23;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                } else if (totalReserva>20000 && totalReserva<=50000) {
                    imposto = (totalReserva - totalLimpeza) * 0.25;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                }else {
                    imposto = (totalReserva - totalLimpeza) * 0.28;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                }
                break;
            case "D":
                totalReserva = (diasReserva*250);
                System.out.println("O total iliquido deste quarto é " + totalReserva);
                totalLimpeza =  diasReserva*25;
                System.out.println("O custo total da limpeza é de " + totalLimpeza);
                if(totalReserva<=20000){
                    imposto = (totalReserva - totalLimpeza) * 0.23;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                } else if (totalReserva>20000 && totalReserva<=50000) {
                    imposto = (totalReserva - totalLimpeza) * 0.25;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                }else {
                    imposto = (totalReserva - totalLimpeza) * 0.28;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                }
                break;
            case "T":
                totalReserva = (diasReserva*275);
                System.out.println("O total iliquido deste quarto é " + totalReserva);
                totalLimpeza =  diasReserva*25;
                System.out.println("O custo total da limpeza é de " + totalLimpeza);
                if(totalReserva<=20000){
                    imposto = (totalReserva - totalLimpeza) * 0.23;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                } else if (totalReserva>20000 && totalReserva<=50000) {
                    imposto = (totalReserva - totalLimpeza) * 0.25;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                }else {
                    imposto = (totalReserva - totalLimpeza) * 0.28;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                }
                break;

            case "S":
                totalReserva = (diasReserva*350);
                System.out.println("O total iliquido deste quarto é " + totalReserva);
                totalLimpeza =  diasReserva*25;
                System.out.println("O custo total da limpeza é de " + totalLimpeza);
                if(totalReserva<=20000){
                    imposto = (totalReserva - totalLimpeza) * 0.23;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                } else if (totalReserva>20000 && totalReserva<=50000) {
                    imposto = (totalReserva - totalLimpeza) * 0.25;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                }else {
                    imposto = (totalReserva - totalLimpeza) * 0.28;
                    System.out.println("O imposto a entregar ao Estado é de " + imposto);
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                    System.out.println("O valor liquido a receber pelo quarto é de " + vLiquido);
                }
                break;
        }

    }
}