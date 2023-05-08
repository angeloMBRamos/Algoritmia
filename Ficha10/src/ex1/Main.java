package ex1;

public class Main {
    public static void main(String[] args) {

        Carro mercedes = new Carro("Mercedes","A45",2023,100, 2.0, 5.2, Combustivel.GASOLINA);
        mercedes.ligar();

        Carro bmw = new Carro("Bmw", "Serie1", 2022,120,2.0,6.3, Combustivel.DIESEL);
        bmw.ligar();

        Carro ferrari= new Carro("Ferrari", "458 Italia", 2014,650,4.0,7.3, Combustivel.GASOLINA);
        ferrari.ligar();

        Carro bugatti= new Carro("Bugatti", "Chiron", 2022,1500,6.0,8.2, Combustivel.GASOLINA);
        ferrari.ligar();

        System.out.println("Bem-vindo ao grande torneio");

        Carro vencedor=bmw.corrida(mercedes);
        System.out.println("Corrida a acontecer...");
        if(vencedor==null){
            System.out.println("Empate!");
        }else {
            System.out.println("Vencedor:");
            vencedor.exibirDetalhes();
            System.out.println("Consumiu: " + vencedor.consumo(97) + " lts.");
        }

        System.out.println();

        //Carro.torneio(mercedes,bmw,ferrari,bugatti);

        //mercedes.consumo(200);
    }
}