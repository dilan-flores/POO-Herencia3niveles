package Artistas;

public class PersonajeA extends Artista{
    /* ATRIBUTOS */
    protected String Nombre_A; // Nombre Artístico

    /* COSTRUCTOR */
    public PersonajeA(String nombre, String tipo, String instrumento, String nombre_A) {
        super(nombre, tipo, instrumento);
        Nombre_A = nombre_A;
    }

    /* MÉTODO*/
    public void Imprimir(){
        System.out.println("Nombre Artísta: "+ getNombre()+
                "\nTipo: "+ getTipo()+
                "\nInstrumento: "+ getInstrumento()+
                "\nNombre Atístico: "+ Nombre_A);
    }
}
