package VJuegos;

public class VideoJuegos {
    /* ATRIBUTOS */
    protected String Nombre_J; // Nombre del juego
    protected int anio_J; // Año de lanzamiento

    /* COSTRUCTOR */
    public VideoJuegos(String nombre_J, int anio_J) {
        Nombre_J = nombre_J;
        this.anio_J = anio_J;
    }

    /*Getter*/
    public String getNombre_J() {
        return Nombre_J;
    }

    public int getAnio_J() {
        return anio_J;
    }
}
