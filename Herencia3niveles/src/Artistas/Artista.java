package Artistas;

public class Artista {
    /* ATRIBUTOS */
    protected String Nombre; // Nombre del Artista
    protected String Tipo; // Tipo de artista
    protected String Instrumento; // Instrumento que utiliza o utilizo en la última creación

    /* COSTRUCTOR */
    public Artista(String nombre, String tipo, String instrumento) {
        Nombre = nombre;
        Tipo = tipo;
        Instrumento = instrumento;
    }

    /*Getter*/

    public String getNombre() {
        return Nombre;
    }

    public String getTipo() {
        return Tipo;
    }

    public String getInstrumento() {
        return Instrumento;
    }
}
