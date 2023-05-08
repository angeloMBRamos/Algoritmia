package ex5;

import java.util.ArrayList;

public class Agenda {
    ArrayList<Pessoa> pessoas;

    public Agenda(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public void addPessoas(Pessoa pessoaNova){
        pessoas.add(pessoaNova);
    }



}
