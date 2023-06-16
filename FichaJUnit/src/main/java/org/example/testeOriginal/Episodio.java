package org.example.testeOriginal;

    public class Episodio {
        private String nome;
        private int duracao;

        public Episodio(String nome, int duracao) {
            this.nome = nome;
            this.duracao = duracao;
        }

        public String getNome() {
            return nome;
        }

        public int getDuracao() {
            return duracao;
        }
    }
