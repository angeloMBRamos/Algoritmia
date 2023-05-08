package ex5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa vitor = new Pessoa("Vitor Santos", "vmvs007@gmail.com","911222333", 23);
        Pessoa angelo = new Pessoa("Angelo", "angleo@gmail.com", "91155599", 42);

        ArrayList<Pessoa> contactos = new ArrayList<Pessoa>();
        contactos.add(vitor);
        contactos.add(angelo);

        Agenda aMinhaAgenda= new Agenda(contactos);

        Pessoa bernardo = new Pessoa("Bernardo", "bernardo@gmail.com", "915666999", 26);

        aMinhaAgenda.addPessoas(bernardo);

        // aMinhaAgenda.exibirDetalhes();
    }
}
