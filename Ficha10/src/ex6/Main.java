package ex6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Atleta atleta1 = new Atleta("Angelo", "Padel", "Portugal", 1.81, 83);
        Atleta atleta2 = new Atleta("Bernardo", "Tenis", "Espanha", 1.83, 80);
        Atleta atleta3 = new Atleta("Tássio", "Voleibol", "Brasil", 1.82, 82);

        ArrayList<Atleta> atletaArrayList = new ArrayList<Atleta>();
        atletaArrayList.add(atleta1);
        atletaArrayList.add(atleta2);

        ArrayList<Competicao> competicaoArrayList = new ArrayList<Competicao>();

        Competicao competicao1 = new Competicao("Caricas Challenge", "Itália", atletaArrayList, competicaoArrayList);
        Competicao competicao2 = new Competicao("Trail", "Valongo", atletaArrayList, competicaoArrayList);
        Competicao competicao3 = new Competicao("Cycling", "Caminha", atletaArrayList, competicaoArrayList);

        competicao1.addAtletas(atleta3);


        competicaoArrayList.add(competicao1);
        competicao2.addCompeticao(competicao3);

        System.out.println("Vai começar a competição....");
        System.out.println("O " + competicao1.getNomeCompeticao() + " vai ser em " + competicao1.getOrigem());
        System.out.println("Os atletas presentes nesta competição são: ");
        System.out.println(competicao1.getAtletas().get(0).getNome() + " e " + competicao1.getAtletas().get(1).getNome());

        System.out.println();

        competicao1.exibirDetalhesAtletas();
        System.out.println();
        competicao1.exibirDetalhesCompeticao();
    }
    
}
