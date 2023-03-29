//Import da biblioteca Scanner para o utilizador poder introduzir dados
import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {

        //Instância da classe para o utilizador poder introduzir os valores
        Scanner input = new Scanner(System.in);

        //Declarar as variáveis
        int nQuarto, diasReserva, totalLimpeza=0, totalReserva=0;
        double vLiquido=0, imposto=0;
        String tipo;

        System.out.println("\nHotel ***** Temático - Mundo de Chocolate\n");

        //Ler a variável nQuarto
        System.out.println("Introduza o numero do quarto");
        nQuarto = input.nextInt();
        //Ler a variável diasReserva
        System.out.println("Quantos dias o quarto esteve ocupado?");
        diasReserva = input.nextInt();
        //Ler a variável tipo
        System.out.println("Qual o tipo de quarto?");
        tipo = input.next();

        //Switch para selecionar o caso que se adequa à variável tipo
        switch (tipo){

            case "I":
                totalReserva = (diasReserva*200);
                totalLimpeza =  diasReserva*25;
                if(totalReserva<=20000){
                    imposto = (totalReserva - totalLimpeza) * 0.23;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }else if(totalReserva>20000 && totalReserva<=50000) {
                    imposto = (totalReserva - totalLimpeza) * 0.25;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }else {
                    imposto = (totalReserva - totalLimpeza) * 0.28;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }
                break;
            case "D":
                totalReserva = (diasReserva*250);
                totalLimpeza =  diasReserva*30;
                if(totalReserva<=20000){
                    imposto = (totalReserva - totalLimpeza) * 0.23;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }else if(totalReserva>20000 && totalReserva<=50000) {
                    imposto = (totalReserva - totalLimpeza) * 0.25;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }else {
                    imposto = (totalReserva - totalLimpeza) * 0.28;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }
                break;
            case "T":
                totalReserva = (diasReserva*275);
                totalLimpeza =  diasReserva*30;
                if(totalReserva<=20000){
                    imposto = (totalReserva - totalLimpeza) * 0.23;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }else if(totalReserva>20000 && totalReserva<=50000) {
                    imposto = (totalReserva - totalLimpeza) * 0.25;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }else {
                    imposto = (totalReserva - totalLimpeza) * 0.28;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }
                break;
            case "S":
                totalReserva = (diasReserva*350);
                totalLimpeza =  diasReserva*50;
                if(totalReserva<=20000){
                    imposto = (totalReserva - totalLimpeza) * 0.23;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }else if(totalReserva>20000 && totalReserva<=50000) {
                    imposto = (totalReserva - totalLimpeza) * 0.25;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }else {
                    imposto = (totalReserva - totalLimpeza) * 0.28;
                    vLiquido =(totalReserva - totalLimpeza) - imposto;
                }
                break;
            default:
                System.out.println("Escolha um tipo de quarto válido");
        }
        System.out.println("O total iliquido deste quarto são €" + totalReserva);
        System.out.println("O custo total de limpeza deste quarto são €" + totalLimpeza);
        System.out.println("O imposto a entregar ao Estado referente a este quarto são €" + imposto);
        System.out.println("O valor liquido a receber pelo quarto são €" + vLiquido);
    }
}