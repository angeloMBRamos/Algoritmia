package ex3;

public class Excel extends Document{

    public Excel(String autor, String nome) {
        super(autor, nome, ".xlsx");
    }

    /**
     * Método para abrir documento de calculo
     */
    @Override
    public void open() {
        System.out.println("A abrir documento de calculo " + getNome() + getExtensão() + "." );
        //Código especifico para abrir um documento de texto
    }

    /**
     * Método para gravar documento de calculo
     */
    @Override
    public void save() {
        System.out.println("Alterações do " + getAutor() + " gravadas." );
        //Código especifico para gravar um documento de text
    }

    /**
     * Método para fechar documento de calculo
     */
    @Override
    public void close() {
        System.out.println("A fechar documento de calculo.");
        //Código especifico para fechar um documento de text
    }


}
