package ex9;

public class Produto {
    private String nome;
    private double preço;
    private int stock=0;

    public Produto(String nome, double preço) {
        this.nome = nome;
        this.preço = preço;
    }

    public int getStock() {
        return stock;
    }

    public String getNome() {
        return nome;
    }

    public double getPreço() {
        return preço;
    }

    public void comprar(int quantidade){
        this.stock += quantidade;
    }
    public void vender(int quantidade){
        if(this.stock>=quantidade){
            this.stock-=quantidade;
        }else{
            System.out.println("Não temos stock para efectuar essa venda.");
        }

    }
}
