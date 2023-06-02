package ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String tipo, nome, autor;
        int opcao = 0;

        System.out.println("Tipo de documento (texto, calculo ou apresentação?");
        tipo = input.nextLine();

        System.out.println("Nome do documento: ");
        nome = input.nextLine();

        System.out.println("Autor: ");
        autor = input.nextLine();

        Document documento = DocumentFactory.createDocument(tipo.toUpperCase(), nome, autor);

        documento.open();

        do {
            do {
                System.out.println("1. Gravar Documento");
                System.out.println("2. Fechar Documento");
                System.out.println("Opção: ");
                opcao = input.nextInt();
            } while (opcao < 1 || opcao > 2);
            switch ((opcao)) {
                case 1:
                documento.save();
                break;
                case 2:
                documento.close();
                break;
                default:
                System.out.println("Opção inválida!");
            }
        }while(opcao!=2);


    }
}
