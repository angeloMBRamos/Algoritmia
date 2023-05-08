package ex3;

import java.util.ArrayList;

public class Animal {

    private String nome, especie, origem;
    private double peso;
    private ArrayList<String> alimentacao;


    public Animal(String nome, String especie, String origem, double peso, ArrayList<String> alimentacao) {
        this.nome = nome;
        this.especie = especie;
        this.origem = origem;
        this.peso=peso;
        this.alimentacao=alimentacao;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public String getOrigem() {
        return origem;
    }

    public double getPeso() {
        return peso;
    }

    public ArrayList getAlimentacao() {
        return alimentacao;
    }


    public boolean comer(double peso, String alimento) {

        for (String a : this.alimentacao) {
            if (alimento.equals(a)) {
                this.peso += peso/1000;
                return true;
            }
        }
        return false;
        }
    }

