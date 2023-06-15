package org.example.ex9;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Formatter;

import static java.lang.Math.round;

public class GameStore {
    private ArrayList<VideoGame> stock;
    private ArrayList<VideoGame> sales;

    public ArrayList<VideoGame> getStock() {
        return stock;
    }

    public ArrayList<VideoGame> getSales() {
        return sales;
    }

    public GameStore() {
        stock = new ArrayList<>();
        sales = new ArrayList<>();
    }

    public void addGameToStock(VideoGame game) {
        stock.add(game);
    }
    public void sellGame(int index) {
        VideoGame game = stock.remove(index);
        sales.add(new VideoGame(game.getName(), game.getPublisher(), game.getCostPrice(),
                game.getSellingPrice()));
    }

    public double calcularLucro(){

        double lucro = 0;

        for(VideoGame jogosVendidos : sales) {
            lucro += jogosVendidos.getSellingPrice() - jogosVendidos.getCostPrice();
        }

        return lucro;
    }
    public void displayStock() {
        System.out.println("Stock:");
        for (VideoGame game : stock) {
            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
    }
    public void displaySales() {
        System.out.println("Sales:");
        for (VideoGame game : sales) {
            System.out.println("Name: " + game.getName());
            System.out.println("Publisher: " + game.getPublisher());
            System.out.println("Cost Price: " + game.getCostPrice());
            System.out.println("Selling Price: " + game.getSellingPrice());
            System.out.println("---------------------------");
        }
    }


}
