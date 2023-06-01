package ex3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Instanciar pela primeira vez
        UserSessionManager userSessionManager = UserSessionManager.getInstance();

        String gerarToken = userSessionManager.gerarToken();
        System.out.println("Token: " + gerarToken);

        long gerarUltimoAcesso = userSessionManager.getUltimoAcesso();
        System.out.println("Ultimo acesso: " + gerarUltimoAcesso);

        userSessionManager.updateUltimoAcesso();

        long gerarUltimoAcessoActualizado = userSessionManager.getUltimoAcesso();
        System.out.println("Ultimo acesso actualizado: " + gerarUltimoAcessoActualizado);

        Random sessionToken = userSessionManager.getSessionToken();
        System.out.println("Session Token " + sessionToken);






    }


}
