package VJuegos;

public class Personaje extends Juego{
    /* ATRIBUTOS */
    private String Nombre_Jugador; // Nombre del jugador
    private String Personaje; // Nombre del personaje
    private String Herramienta; // Herramienta a usar

    /* COSTRUCTOR */
    public Personaje(String nombre_J, int anio_J, String escenario, int n_Jugadores, String nombre_Jugador, String personaje, String herramienta) {
        super(nombre_J, anio_J, escenario, n_Jugadores);
        Nombre_Jugador = nombre_Jugador;
        Personaje = personaje;
        Herramienta = herramienta;
    }

    /* MÉTODO*/
    public void Imprimir(){
        super.Imprimir();
        System.out.println("Nombre Jugador: "+ Nombre_Jugador+
                "\nPersonaje: " + Personaje+
                "\nHerramienta: " + Herramienta);
    }
}
