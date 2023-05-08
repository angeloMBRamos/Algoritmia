package ex4;

public class Main {
    public static void main(String[] args) {
        Imovel imovel = new Imovel("Guerra Junqueiro", "120", "Porto", 300, 20, 3, 2,Tipo.CASA, Acabamento.NOVA);
        Imovel imovel2= new Imovel("Av. Brasil", "165", "Porto", 120, 0, 3, 3, Tipo.APARTAMENTO, Acabamento.RESTAURO);
        System.out.println("O imovel custa " + imovel.calcularValor() + "€");
        System.out.println("Fiz obras em casa!");
        imovel.setAcabamento(Acabamento.LUXO);
        System.out.println("O imovel agora é de " + imovel.getAcabamento());
        System.out.println("O imovel custa " + imovel.calcularValor() + "€");

        Imovel maisCaro = imovel.compararImovel(imovel2);
        System.out.println();
        if(maisCaro==null){
            System.out.println("As casas têm o mesmo valor");
        }else{
            System.out.println("O imóvel mais caro:");
            maisCaro.exibirDetalhes();
        }


    }
}
