package ex2;

import java.io.*;
import java.util.Scanner;

public class Logger {

    File file;

    /**
     * Único objeto desta classe
     */
    private static Logger instance;

    /**
     * Construtor privado que só vai executar a primeira vez
     * @param file
     */
    private Logger(File file) {
        this.file = file;
    }

    /**
     * Método de criação de objeto / Retorno do objeto criado
     * @param file
     * @return instance
     */
    public static synchronized Logger getInstance (File file){
        if (instance == null) {
            instance = new Logger(file);
        }
        return instance;
    }

    /**
     * Método para guardar uma linha de String no ficheiro
     * @param log
     */
    public void log(String log) {

        try  {
            FileWriter write = new FileWriter(this.file,true);
            write.write(log);
            write.close();
        } catch (IOException ex) {
            System.out.println("Não escreve! " + ex);

        }
    }

    /**
     * Método para ler o ficheiro
     */

    public void readFile(){
        try{
            Scanner readFile = new Scanner(this.file);
            while(readFile.hasNext()){
                System.out.println(readFile.nextLine());
        }
    }catch (FileNotFoundException ex){
            System.out.println("File not found! " + ex);

        }
    }

}
