package ex6;

import java.util.ArrayList;

public class Competicao {
    private String nomeCompeticao, origem;
    private ArrayList<Atleta> atletas;
    private ArrayList<Competicao> competicaoArrayList;
    private Atleta atleta;

    public Competicao(String nomeCompeticao, String origem, ArrayList<Atleta> atletas, ArrayList<Competicao> competicaoArrayList) {
        this.nomeCompeticao = nomeCompeticao;
        this.origem = origem;
        this.atletas = atletas;
        this.competicaoArrayList=competicaoArrayList;
    }

    public String getNomeCompeticao() {
        return nomeCompeticao;
    }

    public String getOrigem() {
        return origem;
    }

    public ArrayList<Atleta> getAtletas() {
        return atletas;
    }

    public Atleta getAtleta() {
        return atleta;
    }

    public void addAtletas(Atleta atletaNovo){
        this.atletas.add(atletaNovo);
    }

    public void addCompeticao(Competicao novaCompeticao){
        this.competicaoArrayList.add(novaCompeticao);
    }

    public void exibirDetalhesAtletas(){
        for (int i = 0; i < atletas.size(); i++) {
            System.out.println("Nome: " + atletas.get(i).getNome());
            System.out.println("Modalidade: " + atletas.get(i).getModalidade());
            System.out.println("Origem: " + atletas.get(i).getOrigem());
            System.out.println("Altura: " + atletas.get(i).getAltura());
            System.out.println("Peso: " + atletas.get(i).getPeso());
            System.out.println();
        }
        System.out.println("Competição: " + this.nomeCompeticao);
    }

    public void exibirDetalhesCompeticao(){
        for (int i = 0; i < competicaoArrayList.size(); i++) {
            System.out.println("Competição: " + competicaoArrayList.get(i).getNomeCompeticao());
            System.out.println("País: " + competicaoArrayList.get(i).getOrigem());
            System.out.println();
        }
    }
}
