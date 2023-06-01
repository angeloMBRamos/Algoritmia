package ex3;

import ex2.Logger;

import java.io.File;
import java.util.Random;

public class UserSessionManager {
    private static UserSessionManager instance;
    private long ultimoAcesso;
    private Random sessionToken;

    private UserSessionManager() {
        this.sessionToken = new Random();
        this.ultimoAcesso = System.currentTimeMillis();
    }

    public static synchronized UserSessionManager getInstance (){
        if (instance == null) {
            instance = new UserSessionManager();
        }
        return instance;
    }

    public Random getSessionToken() {
        return sessionToken;
    }

    public long getUltimoAcesso() {
        return this.ultimoAcesso;
    }

    public String gerarToken(){
        Random random = new Random();
        return Long.toString(random.nextLong());
    }
    public void updateUltimoAcesso(){

        this.ultimoAcesso = System.currentTimeMillis();
    }


}
