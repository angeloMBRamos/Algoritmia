package ex2;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        File file = new File("src/ex2/Express.txt");
        Logger logger = Logger.getInstance(file);



        logger.log("Teste ");
        logger.log("Teste...");

        logger.readFile();
    }



}
