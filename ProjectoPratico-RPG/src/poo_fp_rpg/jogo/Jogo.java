package poo_fp_rpg.jogo;

import poo_fp_rpg.entidades.Cavaleiro;
import poo_fp_rpg.entidades.Heroi;
import poo_fp_rpg.entidades.Vendedor;
import poo_fp_rpg.items.Arma;
import poo_fp_rpg.items.ItemHeroi;
import poo_fp_rpg.items.PocaoHP;

import java.util.ArrayList;

public class Jogo {
    public static void main(String[] args) {

        ArrayList<Heroi> listaHerois = new ArrayList<Heroi>();
        ArrayList<PocaoHP> listaPocoes = new ArrayList<>();
        Arma espada = new Arma("Espada", 50, listaHerois,30 );

        PocaoHP rejuvenescer = new PocaoHP("Rejuvenescer", 20, listaHerois, 50);

        Cavaleiro hercules = new Cavaleiro("Hercules", 100, 300, 0, 500, listaPocoes, espada);

        listaHerois.add(hercules);

        ArrayList<ItemHeroi> stockVendedor = new ArrayList<>();
        stockVendedor.add(espada);
        stockVendedor.add(rejuvenescer);

        Vendedor vendedor = new Vendedor(stockVendedor);
        hercules.mostrarDetalhes();
        vendedor.vender(hercules);
    }
}
