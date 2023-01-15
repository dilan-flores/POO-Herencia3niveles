package Artistas;

public class Arte extends PersonajeA{
    /* ATRIBUTOS */
    private String Nombre_C; //Nombre de la creación ya sea canción, pintura, escultura
    private String Genero; // Género al que corresponde
    private int Anio_P; // Año de publicación

    /* COSTRUCTOR */

    public Arte(String nombre, String tipo, String instrumento, String nombre_A, String nombre_C, String genero, int anio_P) {
        super(nombre, tipo, instrumento, nombre_A);
        Nombre_C = nombre_C;
        Genero = genero;
        Anio_P = anio_P;
    }

    /* MÉTODO*/
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Nombre Creación: "+ Nombre_C+
                "\nGénero: "+ Genero+
                "\nPublicación: "+ Anio_P);
    }
}
