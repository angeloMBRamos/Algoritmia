package ex3;

public class Word extends Document{


    public Word(String autor, String nome) {
        super(autor, nome, ".docx");
    }

    /**
     * Método para abrir documento de texto
     */
    public void open(){
        System.out.println("A abrir documento de texto " + getNome() + getExtensão() + "." );
        //Código especifico para abrir um documento de texto
    }
    /**
     * Método para gravar documento de texto
     */
    public void save(){
        System.out.println("Alterações do " + getAutor() + " gravadas." );
        //Código especifico para gravar um documento de text
    }
    /**
     * Método para fechar documento de texto
     */
    public void close(){
        System.out.println("A fechar documento de texto.");
        //Código especifico para fechar um documento de text
    }
}
