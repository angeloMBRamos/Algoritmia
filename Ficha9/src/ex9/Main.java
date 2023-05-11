package ex9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nome;
        double preco;
        int opcao, quantidade=0;

        System.out.println("Insira o nome do produto: ");
        nome= input.next();
        System.out.println("Insira o preço do produto: ");
        preco= input.nextDouble();

        Produto produto = new Produto(nome, preco);

        do{
            System.out.println("\nControlo do produto: " + produto.getNome());
            System.out.println("Preço: " + produto.getPreço());
            do{
                System.out.println("1- Comprar");
                System.out.println("2- Vender");
                System.out.println("3- Consultar stock");
                System.out.println("4- Sair");

                System.out.println("\nEscolha uma opção: ");
                opcao= input.nextInt();
            }while(opcao<1 || opcao>3);

            switch(opcao){
                case 1:
                    System.out.println("***** Comprar *****");
                    System.out.print("Quantas unidasdes quer comprar: ");
                    quantidade=input.nextInt();
                    produto.comprar(quantidade);
                    break;
                case 2:
                    System.out.println("***** Vender *****");
                    System.out.print("Quantas unidades quer vender: ");
                    quantidade=input.nextInt();
                    produto.vender(quantidade);
                    break;
                case 3:
                    System.out.println("\nTem " + produto.getStock() + " unidades.");
                    break;
                case 4:
                    System.out.println("Até à próxima!!");
            }
        }while(opcao!=4);

    }
}
