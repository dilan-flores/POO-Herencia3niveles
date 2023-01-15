package Comida;

public class Plato extends Lugar{
    /* ATRIBUTOS */
    protected String Nombre_P; // Nombre del plato
    protected int Tiempo; // Tiempo en minutos

    /* CONTRUCTOR */

    public Plato(String pais, String ciudad, String nombre_P, int tiempo) {
        super(pais, ciudad);
        Nombre_P = nombre_P;
        Tiempo = tiempo;
    }

    /* MÉTODO */
    public void Imprimir(){
        System.out.println("País: "+ getPais()+
                "\nCiudad: " + getCiudad()+
                "\nNombre Plato: " + Nombre_P+
                "\nTiempo de elaboración: "+ Tiempo + " minutos");
    }
}
