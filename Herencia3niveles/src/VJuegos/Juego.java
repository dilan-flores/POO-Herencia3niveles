package VJuegos;

public class Juego extends VideoJuegos{
    /* ATRIBUTOS */
    protected String Escenario; // Escenario a desarrollarse el juego
    protected int N_Jugadores; // Número de jugadores involucrados

    /* COSTRUCTOR */
    public Juego(String nombre_J, int anio_J, String escenario, int n_Jugadores) {
        super(nombre_J, anio_J);
        Escenario = escenario;
        N_Jugadores = n_Jugadores;
    }

    /* MÉTODO*/
    public void Imprimir(){
        System.out.println("Nombre Juego: "+ getNombre_J()+
                "\nAño juego: " + getAnio_J()+
                "\nEscenario: " + Escenario+
                "\nN_Judarores: "+ N_Jugadores);
    }
}
