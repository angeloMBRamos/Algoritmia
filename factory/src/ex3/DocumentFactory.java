package ex3;

public class DocumentFactory {

    public static Document createDocument(String tipo, String nome, String autor){
        switch(tipo){
            case "TEXTO":
                return new Word(autor, nome);
            case "CALCULO":
                return new Excel(autor, nome);
            case "APRESENTAÇÃO":
                return new Powerpoint(autor, nome);
            default:
                throw new IllegalArgumentException("Não temos ficheiros desse tipo " + tipo);
        }
    }
}
