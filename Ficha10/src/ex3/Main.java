package ex3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> alimentacao = new ArrayList<String>();
        alimentacao.add("banana");
        alimentacao.add("pera");
        alimentacao.add("ananas");

        Animal macaco = new Animal("José Rosa", "Mamifero", "Lourinhã",500,alimentacao);

        if(macaco.comer(1000, "amendoins")){
            System.out.println("O macaco do " + macaco.getNome() + " comeu.");
        }else{
            System.out.println("O macaco do " + macaco.getNome() + " não comeu.");
        }
        System.out.println("Pesa: "+macaco.getPeso()+" Kg.");

        }
    }
