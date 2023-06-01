package ex4;

import ex3.UserSessionManager;

import java.io.File;
import java.io.FileNotFoundException;

public class FileManager {

    private static FileManager instance;
    private String path;

    private FileManager(String path) {
        this.path = path;
    }

    public static synchronized FileManager getInstance (String path){
        if (instance == null) {
            instance = new FileManager(path);
        }
        return instance;
    }

    public void setRootDirectory(String path) {
        this.path = path;
    }

    public void creatFile(String nome){
        File file = new File(nome);
    }

    public void deleteFile(String nome){
        File file = new File(nome);
        file.delete();
    }
}
