package ex4;

import java.io.File;

public class main {
    public static void main(String[] args) {

        FileManager fileManager = FileManager.getInstance("\\desktop");

        //fileManager.setRootDirectory("src/ex4");

        //Criar ficheiros
        fileManager.creatFile("novo-ficheiro.txt");

        //Apagar ficheiros
        fileManager.deleteFile("novo-ficheiro");

    }
}
