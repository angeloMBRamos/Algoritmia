package ex2;

public class Cao {

    private String nome;
    private String raca;

    public  Cao(String nome, String raca){
        this.nome=nome;
        this.raca=raca;
    }

    public String getNome() {
        return this.nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void ladrar(){
        System.out.println("aufauauaufufuauafuafuaf");
    }
}
