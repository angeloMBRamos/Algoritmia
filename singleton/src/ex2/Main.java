package ex2;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("src/ex2/Express.txt");
        File file2 = new File("src/ex2/NuncaVaiAcontecer.txt");
        Logger logger = Logger.getInstance(file);
        Logger logger1 = Logger.getInstance(file2);



        logger.log("Teste");
        logger.log("Teste...");

        logger1.log("teste3");

        logger.readFile();
    }



}
